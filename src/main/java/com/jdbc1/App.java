package com.jdbc1;

//importing package
import java.sql.*;

/**
 * JDBC SAMPLE PROGRAM BY 
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	//load and register driver
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	//create the object to get Connection
    	//url to db,username,password
    	String url="jdbc:mysql://localhost:3306/samsung";
    	String username="root";
    	String password="123456";
    	
    	//get connection to the db
    	Connection con=DriverManager.getConnection(url,username,password);
    	//a statement to execute a query
    	Statement st=con.createStatement();
    	//execution of query and storing the response in resultset rs
    	ResultSet rs=st.executeQuery("select * from mobile where mobileId=1");
    	//checking for reponse
    	
    	rs.next();
    	//reading the mobile name from response
    	String Mobiledata=rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3);
    	//printing mobile name
    	System.out.println(Mobiledata);
    	//closing the connection
    	con.close();	
    }
}

