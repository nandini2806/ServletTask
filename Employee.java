package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Employee extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse responce) throws ServletException, IOException {
		
		String name=req.getParameter("name");
	    
		String id1=	req.getParameter("id");
	    int id=Integer.parseInt(id1);
	    
	    String age1=req.getParameter("age");
	    int age=Integer.parseInt(age1);
	     
	    String email=req.getParameter("emailid");
	    
	    String phone=req.getParameter("phone");
	    long phoneNo=Long.parseLong(phone);
	    
	    String gender=req.getParameter("gender");
	     
	    String state=req.getParameter("state");
	    
	    String country=req.getParameter("country");
	     
	    String address=req.getParameter("address");
	    
	    String department=req.getParameter("department");
	     
	    String role=req.getParameter("jobrole");
	     
	    String experience=req.getParameter("experience");
	    int exp=Integer.parseInt(experience);
	     
	    String salary=req.getParameter("salary");
	    int sal=Integer.parseInt(salary);
	    
	    System.err.println(name);
	    System.err.println(id);
	    System.err.println(age);
	    System.err.println(email);
	    System.err.println(phoneNo);
	    System.err.println(gender);
	    System.err.println(state);
	    System.err.println(country);
	    System.err.println(address);
	    System.err.println(department);
	    System.err.println(role);
	    System.err.println(exp);
	    System.err.println(sal);
	    
	  PrintWriter out=responce.getWriter();
	   /* out.println(name);
	    out.println(id);
	    out.println(age);
	    out.println(email);
	    out.println(gender);
	    out.println(exp);*/
	    
	  try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection c = DriverManager.getConnection(
		        "jdbc:mysql://localhost:33061/employee", "root", "Nandini@2806");

		    PreparedStatement pst = c.prepareStatement(
		        "INSERT INTO employee(name, id, age, email, phoneNo, gender, state, country, address, department, role, exp, sal) " +
		        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

		    pst.setString(1, name);
		    pst.setInt(2, id);
		    pst.setInt(3, age);
		    pst.setString(4, email);
		    pst.setLong(5, phoneNo);
		    pst.setString(6, gender);
		    pst.setString(7, state);
		    pst.setString(8, country);
		    pst.setString(9, address);
		    pst.setString(10, department);
		    pst.setString(11, role);
		    pst.setInt(12, exp);
		    pst.setInt(13, sal);

		    int check = pst.executeUpdate();
		    if (check > 0) {
		        out.println("<h1 style='background-color:green;'>Data Inserted</h1>");
		    } else {
		        out.println("<h1 style='background-color:red;'>Data Not Inserted</h1>");
		    }

		    c.close();
		} catch (Exception e) {
		    out.println(e.getMessage());
		}

	    
	     
	     
	     
	     
	     
	}

	
}
