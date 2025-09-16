package com.servlet;

import java.io.IOException;

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
	    
	    System.out.println(name);
	    System.out.println(id);
	    System.out.println(age);
	    System.out.println(email);
	    System.out.println(phoneNo);
	    System.out.println(gender);
	    System.out.println(state);
	    System.out.println(country);
	    System.out.println(address);
	    System.out.println(department);
	    System.out.println(role);
	    System.out.println(exp);
	    System.out.println(sal);
	     
	     
	     
	     
	     
	}

	
}
