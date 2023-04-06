package com.jdbc1;

import java.sql.*;

public class addMobile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

    	Class.forName("com.mysql.cj.jdbc.Driver");
    	String url="jdbc:mysql://localhost:3306/samsung";
    	String username="root";
    	String password="123456";
    	Connection bs=DriverManager.getConnection(url,username,password);
    	
    	int mid=4;
    	String mname="Pixel 6";
		int mprice=72000;
		String query="insert into mobile values( ?,?,?)";
		
		PreparedStatement pst=bs.prepareStatement(query);
		pst.setInt(1, mid);
		pst.setString(2,mname);
		pst.setInt(3, mprice);
		
		int count=pst.executeUpdate();
		System.out.println(count+" row(s) effected");
	}

}
