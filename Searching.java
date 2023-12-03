package com.Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Searching {
	
	public static void searchBook(String pw) throws ClassNotFoundException, SQLException
	{
		
		

		 System.out.println("");
		 System.out.println("");
System.out.println("----------------Search Result ---------------");

Scanner sc= new Scanner(System.in);
System.out.println("");
System.out.print("Enter the Book Name that your are Searching:"); 
String bn=sc.nextLine();
System.out.println("");
System.out.println("");

		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection object creation.
		String s1 ="jdbc:mysql://localhost:3306/cruddb";
		String s2 ="root";
		String s3 = "prasadnaidu";
		 Connection con =DriverManager.getConnection(s1,s2,s3);
		 //step ->3  Statement object creation
		 Statement s= con.createStatement();
		 ResultSet rs=s.executeQuery("Select * from Book_Table where Bookname='"+bn+"';");
//		 rs.next();
//		 int am=rs.getInt(7);
		 System.out.println("");
		 System.out.println("");
		 while(rs.next())
		 {
			 
			 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		 }

//	 System.out.println("The amount on your Account is:"+am);
		 System.out.println("");
		 System.out.println("");

		 
		 
		 
		
		
		
		System.out.println("Thanks for Verifying our Site for the books.");
	
	}

}
