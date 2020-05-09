package com.hello.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class MySQLPreparedStmt {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testapp", "root", "root");
			// here testapp is database name, root is username and password
			PreparedStatement stmt;
			int count;
			//Insert
			/*stmt = con.prepareStatement("insert into emp values(?,?,?)");
			stmt.setInt(1, 12);
			stmt.setString(2, "Amit");
			stmt.setInt(3, 28);
			count = stmt.executeUpdate();*/
			
			//Select
			stmt = con.prepareStatement("select * from emp");
			ResultSet rs = stmt.executeQuery();
			while (rs.next())
				System.out.println("before : " + rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
		
			
			//Update
			/*stmt = con.prepareStatement("update emp set name=? ,age=? where id=?");
			stmt.setInt(3, 12);
			stmt.setString(1, "Shubham");
			stmt.setInt(2, 25);
			count = stmt.executeUpdate();*/
			
			//Delete
			stmt = con.prepareStatement("delete from emp where id=?");
			stmt.setInt(1, 12);
			count = stmt.executeUpdate();
			
			System.out.println(count + " row affected");

			rs = null;
			stmt = con.prepareStatement("select * from emp");
			rs = stmt.executeQuery();
			while (rs.next())
				System.out.println("after : " + rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
