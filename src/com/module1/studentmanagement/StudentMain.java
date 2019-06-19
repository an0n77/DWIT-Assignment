package com.module1.studentmanagement;

import java.sql.*;
import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        StudentMain sm = new StudentMain();
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test", "root", "");
        System.out.println("Enter \n 1 for Adding Student \n 2 for Editing Student Details \n 3 for Viewing Student Details");
        int op = sc.nextInt();

        if (op == 1) {
            System.out.println("Enter the no. of Students to be add: ");
            int n = sc.nextInt();
            sc.nextLine();

            sm.addStudent(n);
        } else if (op == 2) {
            System.out.println("1 for Edit\n2 for Delete");
            int op1 = sc.nextInt();
            if (op1 == 1) {
                sm.edit();
            } else if (op1 == 2) {
                sm.delete();
            }
        } else if (op == 3) {
            sm.view();
        }
        else{
            System.out.println("Wrong Input.");
        }
    }

    private void addStudent(int n) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test", "root", "");
        StudentDetail[] sd = new StudentDetail[n];
        for (int i = 0; i < n; i++) {
            sd[i] = new StudentDetail();
            System.out.println("Enter Roll:");
            sd[i].setRoll_no(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter Name:");
            sd[i].setName(sc.nextLine());
            System.out.println("Enter Address:");
            sd[i].setAddress(sc.nextLine());
            System.out.println("Enter Grade:");
            sd[i].setGrade(sc.nextLine());
        }
        for (int i = 0; i < n; i++) {
            PreparedStatement pst = connection.prepareStatement("INSERT into student_details (roll_no,name,address,grade) values (?,?,?,?)");
            pst.setInt(1, sd[i].getRoll_no());
            pst.setString(2, sd[i].getName());
            pst.setString(3, sd[i].getAddress());
            pst.setString(4, sd[i].getGrade());
            pst.executeUpdate();
        }
    }

    private void edit() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test", "root", "");
        String editQuery = "";

        System.out.println("Edit: \n 1 for Name \n 2 for Address \n3 for Grade");
        int e1 = sc.nextInt();
        if (e1 == 1) {
            editQuery = "update student_details set name=? where roll_no=?";
        } else if (e1 == 2) {
            editQuery = "update student_details set address=? where roll_no=?";
        } else if (e1 == 3) {
            editQuery = "update student_details set grade=? where roll_no=?";
        }

        PreparedStatement pst = connection.prepareStatement(editQuery);
        /* PreparedStatement pst = connection.prepareStatement("update student_details set name=? , address=?, grade = ? where roll_no=?"); */
        System.out.println("Enter Roll to Edit:");
        pst.setInt(2, sc.nextInt());
        sc.nextLine();
        System.out.println("Enter New Detail:");
        pst.setString(1, sc.nextLine());
        /*pst.setString(2,sc.nextLine());
        pst.setString(3,sc.nextLine());*/
        pst.executeUpdate();
    }

    private void delete() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test", "root", "");
        PreparedStatement pst = connection.prepareStatement("delete from student_details where roll_no=?");
        System.out.println("Enter Roll No:");
        pst.setInt(1, sc.nextInt());
        pst.executeUpdate();
    }

    private void view() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test", "root", "");
        String selectQuery = "Select * from student_details";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(selectQuery);
        while (rs.next()) {
            System.out.println(rs.getInt("roll_no") + "\t " + rs.getString("name") + "\t " + rs.getString("address") + "\t " + rs.getString("grade"));

        }
    }

}
