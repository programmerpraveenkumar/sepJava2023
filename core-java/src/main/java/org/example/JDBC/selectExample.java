package org.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectExample {
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
            ResultSet resultSet = stmt.executeQuery("select id,name,email from user");
            while(resultSet.next()){
                System.out.println(
                        resultSet.getString("id")+" -- "+
                        resultSet.getString("name")+" -- "+
                        resultSet.getString("email")
                );
            }
        }catch (Exception e){
                e.printStackTrace();
        }
    }
}
