package com.itcourses.grusha.DB;

import java.io.*;
import java.nio.file.Files;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DBExample {


    public static String url = "jdbc:sqlite:D:/trainings/db/chinook.db";

    public static void main(String[] args) throws FileNotFoundException {
        List<Track> trackList = new ArrayList();

        try (Connection conn = DriverManager.getConnection(url)) {

            System.out.println("Connection to SQLite has been established.");
            Statement statement = conn.createStatement();
            String query = new Scanner(new File("D:\\trainings\\db\\sqlquery.sql")).nextLine();

            ResultSet response = statement.executeQuery(query);
            while (response.next()) {
                Track track = new Track();
                track.setName(response.getString("Name"));
                track.setComposer(response.getString("Composer"));
                track.setPrice(response.getDouble("UnitPrice"));
                trackList.add(track);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Track track: trackList) {
            System.out.println(track);
        }


    }
}
