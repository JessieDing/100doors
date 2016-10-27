package com.jessie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
    private final static String URL = "jdbc:mysql://localhost:3306/100doors";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "jieding";
    private final static String DRIVER = "com.mysql.jdbc.Driver";

    public static void main(String[] args) {
        insert();
    }

    public static void insert() {
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String sql = "insert into game_result (id,result) values(1,'door1 closed')";
            Statement state = connection.createStatement();
            state.executeUpdate(sql);

            state.close();
            connection.close();

            System.out.println("insert success");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
