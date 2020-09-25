package com.sns.dao;
import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBUtil {
	public static Connection getDBConnection() {    // this is factory method

	Connection conn =null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");

		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "Krishna", "Krishna@3");

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	return  conn;

}


}
