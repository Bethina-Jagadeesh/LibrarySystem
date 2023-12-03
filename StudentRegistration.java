package com.Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentRegistration  extends LibrarySystem{

	


	public static void studentRegister() throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner(System.in);
		System.out.println("---------------Welcome to the Student register page👋---------------.");
		int amount=0;
		String PersonID,LastName,FirstName,Branch,Mobile_Number,EMail_Address;
		System.out.print("Please Enter  your PersonID :");
		PersonID=sc.nextLine();
		System.out.println("");
		System.out.print("Please Enter your LastName:");
		LastName=sc.nextLine();
		System.out.println("");
		System.out.print("Please Enter Your FirstName:");
		FirstName=sc.nextLine();
		System.out.println("");
		System.out.print("Please Enter Your Branch:");
		Branch=sc.nextLine();
		System.out.println("");
		System.out.print("Enter The Mobile_Number:");
		Mobile_Number=sc.nextLine();
		System.out.println("");
		System.out.print("Please Enter Your EMail_Address:");
		EMail_Address=sc.nextLine();
		System.out.println("");
		 Class.forName("com.mysql.cj.jdbc.Driver");
			//connection object creation.
			String s1 ="jdbc:mysql://localhost:3306/cruddb";
			String s2 ="root";
			String s3 = "prasadnaidu";
			 Connection con =DriverManager.getConnection(s1,s2,s3);
			 // using prepared Statement and object creation.
			 PreparedStatement ps= con.prepareStatement("insert into Student_Table values(?,?,?,?,?,?);");
			ps.setString(1,PersonID);
			ps.setString(2,LastName);
			ps.setString(3,FirstName);
			ps.setString(4,Branch);
			ps.setString(5,Mobile_Number);
			ps.setString(6,EMail_Address);
			 int row=ps.executeUpdate();
				System.out.println("Student registraction done Successfully");
			 StudentLogin slog = new StudentLogin();
				slog.studentLogin();

			 ResultSet rs=ps.executeQuery("Select * from Student_Table;");

		}



	
}
