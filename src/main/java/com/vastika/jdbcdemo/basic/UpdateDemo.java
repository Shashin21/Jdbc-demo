package com.vastika.jdbcdemo.basic;

import com.vastika.jdbcdemo.basic.util.DButil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL = "update user_tbl set user_name='krishna', password ='tt#1234' where id = 3";

    public static void main(String[] args) {
        try(
                Statement st = DButil.getConnection().createStatement();
                ){
            st.executeUpdate(SQL);
            System.out.println("data updated.");
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


}
