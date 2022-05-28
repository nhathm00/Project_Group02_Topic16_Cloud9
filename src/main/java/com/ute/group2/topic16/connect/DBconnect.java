package com.ute.group2.topic16.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	static String hostname  = "cloud.ckdrw8bxkk31.us-east-1.rds.amazonaws.com"; // thầy thay đổi địa chỉ ip public của ec2
	static String dbName = "cloud"; // tên database đã import
	static String portNumber = "3306"; 
	static String userName  = "admin"; //tài khoản kết nối sql
	static String password = "lephuongnam19133036"; // mật khẩu tài khoản kết nối sql
	public static Connection getConnection()throws Exception {
		  String url = "jdbc:mysql://" + hostname + ":" +
				  portNumber + "/" + dbName + "?user=" + userName + "&password=" + password;
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		  Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url);
    } 	
	public static void main(String[] args) {
		System.out.println("Connecting....");
		try {
			new DBconnect();
			System.out.println(DBconnect.getConnection());
			System.out.println("Connect successful");
	}catch(Exception e) {
		System.out.println(e);
		}
	}
}
