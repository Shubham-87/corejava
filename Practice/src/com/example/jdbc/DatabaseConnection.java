package com.example.jdbc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shubham","password123");
	    
		Statement statement=connection.createStatement();
		
		
		//Calling stored procedure
		CallableStatement  callableStatement;
		/*
		CallableStatement  callableStatement=connection.prepareCall("{call addstudent(?,?,?,?,?)}");
		callableStatement.setInt(1, 12);
		callableStatement.setString(2, "Rishabh");
		callableStatement.setInt(3, 25);
		callableStatement.setDouble(4, 65);
		InputStream inputStream=new FileInputStream("src/result1");
		callableStatement.setBinaryStream(5, inputStream);
		callableStatement.execute();
		*/
		callableStatement=connection.prepareCall("{call get_student (?,?)}");
		callableStatement.setInt(1, 12);
		callableStatement.registerOutParameter(2, Types.VARCHAR);
		callableStatement.execute();
		String name=callableStatement.getString(2);
		System.out.println(name);
		
		ResultSet rs= statement.executeQuery("select result from student where id=12");
		   
		
		while (rs.next()) {
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(rs.getBinaryStream("Result")));
			
			bufferedReader.lines().forEach((l)->{System.out.println(l);});
		}
		
		connection.close();
		
		
	}

}
