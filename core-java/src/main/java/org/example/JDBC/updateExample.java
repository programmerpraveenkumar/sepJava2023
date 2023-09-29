package org.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class updateExample {
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
            stmt.execute("update user set name='newname' where id = 5");
            System.out.println("update successfully.");
        }catch (Exception e){
                e.printStackTrace();
        }
    }
}
