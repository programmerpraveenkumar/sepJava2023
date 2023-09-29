package org.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class ArrayListJDBCInsert {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<User>();

        User user1 = new User();
        user1.setName("test12");
        user1.setEmail("list12@gmail.com");

        User user2 = new User();
        user2.setName("test13");
        user2.setEmail("list13@gmail.com");

        User user3 = new User();
        user3.setName("test14");
        user3.setEmail("list24@gmail.com");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        userList.forEach((user -> {
                insertUser(user);
        }));


    }
   static void insertUser(User user){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/oct2023","root","");
            Statement stmt=con.createStatement();
            stmt.execute("insert into user(name,email)values('"+user.getName()+"','"+user.getEmail()+"')");
            System.out.println("insert successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
