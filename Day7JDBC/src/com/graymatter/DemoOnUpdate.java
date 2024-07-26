package com.graymatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoOnUpdate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/graymatterdb";
		String username="root";
		String password="password";
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("connection established");
		
		
//		String query = "update regions set region_name = ? where region_id=? ";
//		PreparedStatement ps =con.prepareStatement(query);
//		ps.setString(1, "Artic");
//		ps.setInt(2, 6);
//		ps.executeUpdate();
//		System.out.println("row updated");
		
		String query1="delete from regions where region_id=?";
		PreparedStatement ps = con.prepareStatement(query1);
		ps.getConnection().prepareStatement(query1);
		ps.setInt(1, 6);
		ps.executeUpdate();
		System.out.println("row deleted");
		
		Statement st = con.createStatement();
		String query2 = "select * from regions";
		ResultSet rs=st.executeQuery(query2);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			
		}
		
		
		rs.close();
		ps.close();
		con.close();
		

	}

}
