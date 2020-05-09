package com.hello.data;

import java.sql.*;

public class MySQLTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testapp", "root", "root");
			// here testapp is database name, root is username and password
			Statement stmt = con.createStatement();
			
			
			//int result=stmt.executeUpdate("insert into emp values(34,'Pathan',500)");  
			
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println("before : "+rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			
			
			//int result=stmt.executeUpdate("update emp set name='Vimal',age=10000 where id=33");  
			int result=stmt.executeUpdate("delete from emp where id=33");  
			System.out.println(result+" records affected");  
			
			rs=null;
			rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println("after : "+rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
