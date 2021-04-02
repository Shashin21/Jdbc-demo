package com.vastika.jdbcdemo.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbCreateDemo {
    public static final String DRIVER_NAME ="com.mysql.cj.jdbc.Driver";
    public static final String DB_URL="jdbc:mysql://localhost:3306";
    public static final String USER_NAME ="root";
    public static final String PASSWORD = "root1234";
    public static final String SQL = "create database jdbc_demo_db";

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try{
            Class.forName(DRIVER_NAME);
            con = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            st = con.createStatement();
            st.executeUpdate(SQL);
            System.out.println("db created.");
        }catch (ClassNotFoundException |SQLException e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
