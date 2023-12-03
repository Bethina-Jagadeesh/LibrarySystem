package com.Library;

import java.sql.*;
//import java.sql.SQLException;
import java.util.*;
public class AdminRegistraction extends LibrarySystem{

	public static void adminRegister() throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner(System.in);
		System.out.println("---------------Welcome to the Admin register page👋---------------.");
		int amount=0;
		String PersonID,LastName,FirstName,Mobile_Number,EMail_Address,Position;
		System.out.print("Please Enter  The personal ID :");
		PersonID=sc.nextLine();
		System.out.println("");
		System.out.print("Please Enter your Last Name:");
		LastName=sc.nextLine();
		System.out.println("");
		System.out.print("Please Enter Your First Name:");
		FirstName=sc.nextLine();
		System.out.println("");
		System.out.print("Please Enter Your Mobile Number:");
		Mobile_Number=sc.nextLine();
		System.out.println("");
		System.out.print("Enter The EMail_Address:");
		EMail_Address=sc.nextLine();
		System.out.println("");
		System.out.print("Please Enter Your Position:");
		Position=sc.nextLine();
//		System.out.println("Please Remember your password.");
		System.out.println("");
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
			//connection object creation.
			String s1 ="jdbc:mysql://localhost:3306/cruddb";
			String s2 ="root";
			String s3 = "prasadnaidu";
			 Connection con =DriverManager.getConnection(s1,s2,s3);
			 // using prepared Statement and object creation.
			 PreparedStatement ps= con.prepareStatement("insert into Admin_Table values(?,?,?,?,?,?);");
			ps.setString(1,PersonID);
			ps.setString(2,LastName);
			ps.setString(3,FirstName);
			ps.setString(4,Mobile_Number);
			ps.setString(5,EMail_Address);
			ps.setString(6,Position);
//			ps.setInt(7,amount);
			 int row=ps.executeUpdate();
			 System.out.println("Updated Success Fully");
			 AdminLogin alog= new AdminLogin();
				alog.adminLogin();
//			 ResultSet rs=ps.executeQuery("Select * from Admin_Table;");

		}


}
