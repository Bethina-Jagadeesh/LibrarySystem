package com.Library;
import java.sql.*;
import java.util.*;

//import javax.naming.directory.SearchResult;

public class AdminLogin extends LibrarySystem {
	public static void adminLogin() throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		int i = 1;
		System.out.println();
		System.out.print("Enter your Personal ID:");
		String pi=sc.next();
		System.out.println("");
		System.out.print("Enter your password:");
		String pw=sc.next();
	 Class.forName("com.mysql.cj.jdbc.Driver");
		//connection object creation.
		String s1 ="jdbc:mysql://localhost:3306/cruddb";
		String s2 ="root";
		String s3 = "prasadnaidu";
		 Connection con =DriverManager.getConnection(s1,s2,s3);
		 // using prepared Statement and object creation.
		 Statement s= con.createStatement();
		 ResultSet rs=s.executeQuery("Select * from Admin_Table where PersonID='"+pi+"';");
		 String psw=null;
		 while(rs.next()) {
			psw= rs.getString("PersonID");
		 }
		 if(pw.equals(psw))
		 {
			 
				
				while(true)
				{
					System.out.println("🙏🙏Here's that welcomes you to admin features of the Library 🙏🙏");
					System.out.println("-----------------------------------------------------------------");
					System.out.println("1).Adding Book to the Library System. ");
					System.out.println();
					System.out.println("2).Removing Book from the Library System");
					System.out.println();
					System.out.println("3).Finding the Number of Book in the Library System");
					System.out.println();
					System.out.println("4).Exit ");
					System.out.println();
					
					int option;
					System.out.println("Enter option: ");
					option = sc.nextInt();
					AddBook ab= new AddBook();
					RemoveBook rb= new RemoveBook();
					Searching sb=new Searching();
							switch(option)
					{
						case 1:
							ab.addBook(pi);
							break;
						case 2:
							rb.removeBook(pi);
							break;
						case 3:
							sb.searchBook(pi);
							break;
						case 4:
							System.exit(0);
							System.out.println("Thanks for visiting out Site 🙏.");
							
							
					}
				}
			
 
		 }
		 else
		 {
			 System.out.println("The Password you have Entered is Wrong.");
		 }
	}
}
