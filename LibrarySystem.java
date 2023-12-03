package com.Library;
import java.sql.SQLException;
import java.util.*;

//import com.JDBCConnectivity.LoginMethods;
//import com.JDBCConnectivity.RegisterClass;


public class LibrarySystem {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------WELCOME TO THE Library_System---------------");
		System.out.println("REGISTER                                              LOGIN");
		System.out.print("Enter the option(REGISTER/LOGIN):");
		String relog=sc.next();
		if(relog.equalsIgnoreCase("login"))
			{
			System.out.print("Enter the type of login(Admin/Student):");
			String typeLogin=sc.next();
			if(typeLogin.equalsIgnoreCase("admin"))
				{
				AdminLogin alog= new AdminLogin();
				alog.adminLogin();
				}
			else
				{
				StudentLogin slog = new StudentLogin();
				slog.studentLogin();
				
				}
			}
		
		else
			{
			System.out.print("Enter the type of Registration(Admin/Student):");
			String typeLogin=sc.next();
			if(typeLogin.equalsIgnoreCase("admin"))
					{
						AdminRegistraction areg= new AdminRegistraction();
						areg.adminRegister();
					}
			else
					{
						StudentRegistration sreg = new StudentRegistration();
						sreg.studentRegister();
				
					}
			}				
	}
	
}


