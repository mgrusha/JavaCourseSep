package com.itcourses.grusha.HasA;

// Java program to illustrate
//the concept of Aggregation.

// student class
class Student {
    String name;
    int id;
    String dept;

    Student(String name, int id, String dept) {

        this.name = name;
        this.id = id;
        this.dept = dept;

    }
}

/* Department class contains list of student
Objects. It is associated with student
class through its Object(s). */
class Department {

    String name;
    private Student[] students;

    Department(String name, Student[] students) {

        this.name = name;
        this.students = students;

    }

    public Student[] getStudents() {
        return students;
    }
}

/* Institute class contains list of Department
Objects. It is asoociated with Department
class through its Object(s).*/
class Institute {

    String instituteName;
    private Department[] departments;

    Institute(String instituteName, Department[] departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    // count total students of all departments
    // in a given institute
    public int getTotalStudentsInInstitute() {
        int noOfStudents = 0;
        Student[] students;
        for (Department dept : departments) {
            students = dept.getStudents();
            for (Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }

}

// main method
public class Aggregation {
    public static void main(String[] args) {
        Student s1 = new Student("Mia", 1, "CSE");
        Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("John", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");

        // making a List of
        // CSE Students.
        Student[] cse_students = new Student[2];
        cse_students[0] = (s1);
        cse_students[1] = (s2);

        // making a List of
        // EE Students
        Student[] ee_students = new Student[2];
        ee_students[0] = (s3);
        ee_students[1] = (s4);

        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);

        Department[] departments = new Department[2];
        departments[0] = (CSE);
        departments[1] = (EE);

        // creating an instance of Institute.
        Institute institute = new Institute("BITS", departments);

        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());
    }
}
