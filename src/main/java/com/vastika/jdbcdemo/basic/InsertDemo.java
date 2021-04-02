package com.vastika.jdbcdemo.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
        public static final String DRIVER_NAME ="com.mysql.cj.jdbc.Driver";
        public static final String DB_URL="jdbc:mysql://localhost:3306/jdbc_demo_db ";
        public static final String USER_NAME ="root";
        public static final String PASSWORD = "root1234";
        public static final String SQL = "insert into user_tbl(user_name, password)values('shashin', 'akkb@123')";

        public static void main(String[] args) {

            try(
                    Connection con = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
                    Statement st = con.createStatement();
            ){
                st.executeUpdate(SQL);
                System.out.println("Data inserted");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

