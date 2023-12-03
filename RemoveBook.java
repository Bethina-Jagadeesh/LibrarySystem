package com.Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RemoveBook {

	public static void removeBook(String pw) throws ClassNotFoundException, SQLException
	{
		
		 System.out.println("");
		 System.out.println("");

		System.out.println("---------------WELCOME TO THE Process of Removal of Book ---------------");
		System.out.println("");
		System.out.println("");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("");
		System.out.print("Enter the Book Name to Remove:"); 
		String bn=sc.nextLine();
		System.out.println("");
		System.out.println("");
		 Class.forName("com.mysql.cj.jdbc.Driver");
			//connection object creation.
			String s1 ="jdbc:mysql://localhost:3306/cruddb";
			String s2 ="root";
			String s3 = "prasadnaidu";
			 Connection con =DriverManager.getConnection(s1,s2,s3);
			 // using prepared Statement and object creation.   
//		        delete from Book_Table where Bookname='life of ram';
			 PreparedStatement ps= con.prepareStatement(" delete from Book_Table where Bookname=?;");
			ps.setString(1, bn);
//			ps.setString(2,Bookname);
//			ps.setString(3,AuthorName);
//			ps.setString(4,Edition);
//			ps.setString(5,Poblitionyear);
//			ps.setString(6,Bookcost);
//			ps.setString(7,releated);
			 int row=ps.executeUpdate();
//			 ResultSet rs=ps.executeQuery("Select * from Book_Table;");

			 
		System.out.println("Book Removed Sucessfully.");
	
	}

}
