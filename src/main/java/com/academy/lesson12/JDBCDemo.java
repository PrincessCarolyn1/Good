package com.academy.lesson12;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/subscriber?user=root&password=root&serverTimezone=UTC");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM abonent");
        while (rs.next()) { // указатель на первую строку данных
            int id = rs.getInt("id");
            String firstName = rs.getString("first_name");
            System.out.println("id: " + id + ", firstName: " + firstName);
        }
    }
}
