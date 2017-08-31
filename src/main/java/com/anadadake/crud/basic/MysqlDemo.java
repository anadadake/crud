package com.anadadake.crud.basic;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class MysqlDemo {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        String sql;
        String url = "jdbc:mysql://anadadake.mysql.rds.aliyuncs.com:3306?zeroDateTimeBehavior=convertToNull"
                + "&user=root&password=12345678&useUnicode=true&characterEncoding=UTF8";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String sqlusedb = "use andadake";

            int result1 = stmt.executeUpdate(sqlusedb);

            sql = "create table teacher(NO char(20),name varchar(20),primary key(NO))";
            int result = stmt.executeUpdate(sql);
            if (result != -1) {

                sql = "insert into teacher(NO,name) values('2016001','wangsan')";
                result = stmt.executeUpdate(sql);
                sql = "insert into teacher(NO,name) values('2016002','zhaosi')";
                result = stmt.executeUpdate(sql);
                sql = "select * from teacher";
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("学号\t姓名");
                while (rs.next()) {
                    System.out
                            .println(rs.getString(1) + "\t" + rs.getString(2));
                }
            }
        } catch (SQLException e) {
            System.out.println("MySQL操作错误");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


    }

}