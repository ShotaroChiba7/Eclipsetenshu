package com.mycompany;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MSSqlTest1 {
	public static void main(String[] args) {
		try {
			Driver d = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			String connUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;database=Northwind;"
					+ "integratedSecurity=false;user=sa;password=your password";
			Connection con = d.connect(connUrl, new Properties());
			String SQL = "SELECT * FROM Employees ORDER BY LastName";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				System.out.println(rs.getString("LastName") + ", " + rs.getString("FirstName"));
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}