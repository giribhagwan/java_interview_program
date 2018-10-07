package com.company;

import java.sql.*;
import java.util.*;

public class JDBCConnections {

    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo", "root", "toor");
        }catch (Exception e){
            e.printStackTrace();
        }
    return con;
    }
    public static void main(String args[]){
        Connection con = JDBCConnections.getConnection();
        try {
            System.out.println("connect..");
            Statement statement=con.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from user");
//            HashSet<String> set=new HashSet<>();
            SortedSet<String> set= new TreeSet<>();
//        while (resultSet.next()){
//            System.out.println(resultSet.getInt(1));
            resultSet.first();
            System.out.println(resultSet.getString(5));
//            set.add(resultSet.getString(3));
//        }
//        Iterator<String> iterable= set.iterator();
//        while (iterable.hasNext()){
//            System.out.println(iterable.next());
//        }
//            PreparedStatement preparedStatement=con.prepareStatement("insert into user (full_name)values(?)");
//            preparedStatement.setString(1,"bhagwan giri");
//            Integer i=preparedStatement.executeUpdate();
//            System.out.println(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
