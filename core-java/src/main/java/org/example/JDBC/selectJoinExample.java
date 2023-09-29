package org.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectJoinExample {
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
            ResultSet resultSet = stmt.executeQuery("select u.id as id,a.type  ,name,address,email from user as u join address as a on u.id = a.user_id ");
            while(resultSet.next()){
                System.out.println(
                        resultSet.getString("id")+" -- "+
                        resultSet.getString("name")+" -- "+
                        resultSet.getString("email")+" -- "+
                        resultSet.getString("address")+" -- "+
                        resultSet.getString("type")
                );
            }
        }catch (Exception e){
                e.printStackTrace();
        }
    }
}
