package com.Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddBook {
	
	public static void addBook(String pw) throws ClassNotFoundException, SQLException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("---------------Welcome to our site to add books to our library 👋---------------.");
//		int amount=0;
		String Bookname,AuthorName,Edition,Poblitionyear,Bookcost,releated;
		System.out.print("Name of  the book:");
		Bookname=sc.nextLine();
		System.out.println("");
		System.out.print("Enter the name of the Author of the book:");
		AuthorName=sc.nextLine();
		System.out.println("");
		System.out.print("Enter the Edition of the book:");
		Edition=sc.nextLine();
		System.out.println("");
		System.out.print("Enter the year of Poblition of the book:");
		Poblitionyear=sc.nextLine();
		System.out.println("");
		System.out.print("Enter The Cost of the book:");
		Bookcost=sc.nextLine();
		System.out.println("");
		System.out.print("book related to branch:");
		releated=sc.nextLine();
		 Class.forName("com.mysql.cj.jdbc.Driver");
			//connection object creation.
			String s1 ="jdbc:mysql://localhost:3306/cruddb";
			String s2 ="root";
			String s3 = "prasadnaidu";
			 Connection con =DriverManager.getConnection(s1,s2,s3);
			 // using prepared Statement and object creation.
			 PreparedStatement ps= con.prepareStatement("insert into Book_Table values(?,?,?,?,?,?,?);");
			ps.setString(1,pw);
			ps.setString(2,Bookname);
			ps.setString(3,AuthorName);
			ps.setString(4,Edition);
			ps.setString(5,Poblitionyear);
			ps.setString(6,Bookcost);
			ps.setString(7,releated);
			 int row=ps.executeUpdate();
//			 ResultSet rs=ps.executeQuery("Select * from Book_Table;");
	System.out.println("Book Added Successfully.");
	}
}
