package com.harman.java;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        try{
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false","root","");
            Scanner input = new Scanner(System.in);
        String name,rollno,admno,college;
        System.out.println("enter name");
        name=input.next();
        System.out.println("enter rollnumber");
        rollno=input.next();
        System.out.println("enter admission number");
        admno=input.next();
        System.out.println("enter college name");
        college=input.next();
            Statement stmt = c.createStatement();
            stmt.executeUpdate("INSERT INTO `student`(`name`, `rollno`, `admno`, `college`) " +
                    "VALUES('"+name+"',"+rollno+","+admno+",'"+college+"')");
            System.out.println("Inserted successfully");

    }
        catch (Exception e){
            System.out.println(e);
        }
}
}
