package com.graymatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoOnJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//jdbc is an api
		//import -> register -> establish -> create statement
		//statement ->dql(select)
		//prepared- pre-compiled -->dml(CRUD)
		//callable
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		String url="jdbc:mysql://localhost:3306/graymatterdb";
		String username="root";
		String password="password";
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("connection established");
		
		//prepared statements to insert the data
//		String query="insert into regions values(?,?)";
//		PreparedStatement ps =con.prepareStatement(query);
//		ps.setInt(1,7); //args -1-placeholder position 1st ?,5- region id
//		ps.setString(2, "Africa");
//		int row =ps.executeUpdate(); //num of rows affected by the compile stmt--updatation
//		System.out.println("row inserted "+ row);
		
		//dml statement		
		Statement st = con.createStatement();
		String query1 = "select * from regions";
		ResultSet rs=st.executeQuery(query1);//result set is a buffer,internally works on iterator
		
		//to retrieve the data
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			
		}
		//metadata retrieval
		ResultSetMetaData rsmd =rs.getMetaData();
		System.out.println(rsmd);
		
		
		
//		rs.close();
//		st.close();
		con.close();
	}

}
