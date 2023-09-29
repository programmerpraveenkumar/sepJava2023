package org.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deleteExample {
    public static void main(String[] args) {
        /*
            username,
            password
            portno
            servername
            databsename
         */
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/oct2023","root","");
            Statement stmt=con.createStatement();
            stmt.execute("delete from user where id = 5");
            System.out.println("delete successfully.");
        }catch (Exception e){
                e.printStackTrace();
        }
    }
}
