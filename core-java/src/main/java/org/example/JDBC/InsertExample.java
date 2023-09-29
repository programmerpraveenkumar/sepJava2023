package org.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertExample {
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
            stmt.execute("insert into user(name,email)values('javaSep','javaSep@gmail.com')");
            System.out.println("insert successfully");
        }catch (Exception e){
                e.printStackTrace();
        }


    }
}
