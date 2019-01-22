package com.itcourses.grusha.DB;

import java.sql.*;
import java.util.HashSet;

public class QueryExample {

    private static HashSet<Connection> availibleConnections = new HashSet<>();
    public static String url = "jdbc:sqlite:D:/trainings/db/chinook.db";

    public static void main(String[] args) throws SQLException {
        connect();
        Connection newConnection = getConnection();
        Statement aStmt = null;
        try {
             aStmt = newConnection.createStatement();
            StringBuffer sb = new StringBuffer("select ar.Name, count(tr.Name) from artists ar");
            sb.append(" join albums al on al.ArtistId = ar.ArtistId");
            sb.append(" join tracks tr on tr.AlbumId = al.AlbumId");
            sb.append(" join genres gr on gr.GenreId= tr.GenreId");
            sb.append(" where gr.Name = 'Rock'");
            sb.append(" group by ar.Name");

            ResultSet rs = aStmt.executeQuery(sb.toString());

            while(rs.next())
            {
                String band = rs.getString(1);
                int  songsCount = rs.getInt(2);
                System.out.println("Band [" + band + "] has " + songsCount +" rock songs");
            }
            aStmt.close();


            String dropTable = "drop table if exists users;";
            String createTable ="CREATE TABLE users \n" +
                    "( user_id INTEGER PRIMARY KEY AUTOINCREMENT, \n" +
                    "first_name text, \n" +
                    "last_name text, \n" +
                    "email text, \n" +
                    "phone integer );";
            String addUsers = "insert into users(first_name,last_name,email,phone) \n" +
                    "values ('Steve', 'Jobs', 'steve@apple.com', 55555555);\n" +
                    "\n" +
                    "insert into users(first_name,last_name,email,phone) \n" +
                    "values ('Bill', 'Gates', 'bill@ms.com', 48484848);\n" +
                    "\n" +
                    "insert into users(first_name,last_name,email,phone) \n" +
                    "values ('Jo', 'Bloch', 'jb@sun.com', 55555555);";
            aStmt = newConnection.createStatement();
            aStmt.executeUpdate(dropTable);
            aStmt.executeUpdate(createTable);

            aStmt.executeUpdate(addUsers);
            aStmt.close();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            retrieveConnection(newConnection);
        }


    }


    /**
     * Connect to a sample database
     */
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            //String url = "jdbc:sqlite:D:/trainings/Java2018_1/db/testdb.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            conn.setAutoCommit(true);
            retrieveConnection(conn);
            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConnection(){
        Connection connection;
        while (true){
           if (availibleConnections.iterator().hasNext()){
               connection = availibleConnections.iterator().next();
                availibleConnections.remove(connection);
                break;
           }
        }
        return connection;
    }

    public static boolean retrieveConnection(Connection connection){
        return availibleConnections.add(connection);
    }

    /**
     * Create a new table in the test database
     *
     */
    public static void createNewTable() {
        // SQLite connection string
        //String url = "jdbc:sqlite:C://sqlite/db/tests.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS warehouses (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	capacity real\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
