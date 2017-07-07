package com.jessie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class DoorDao {
    private final static String URL = "jdbc:mysql://localhost:3306/100doors";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "jieding";
    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private Connection connection;

    DoorDao() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    void insert(int id, String status) {
        try {
            String sql = String.format("insert into game_result (id,status) values(%d,'%s')", id, status); //format的用法
            Statement state = connection.createStatement();
            state.executeUpdate(sql);
            state.close();
            System.out.println("insert success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
