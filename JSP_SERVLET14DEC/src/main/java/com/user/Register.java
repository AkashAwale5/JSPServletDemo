package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Register extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{	
	
		response.setContentType("text/html");
		try(PrintWriter out= response.getWriter())
		{
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet s2</title>");
			out.println("</head>");
			out.println("<body>");
			//getting all incoming detail from request
			String name = request.getParameter("user_name");
			String email = request.getParameter("user_email");
			String password = request.getParameter("user_password");
			out.println(name);
			out.println(email);
			out.println(password);
			//connection jdbc..................
			try 
			{
				System.out.println("before class.,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				System.out.println("connected");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservlet", "root", "root");	
				String q="insert into user (name,password,email)values(?,?,?)";
				PreparedStatement prepareStatement = con.prepareStatement(q);
				prepareStatement.setString(1, name);
				prepareStatement.setString(2, password);
				prepareStatement.setString(3, email);
				prepareStatement.executeUpdate();
				
				out.println("<h1>Done,,,,,</h1>");
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
				out.println("<h1>error,,,,,</h1>");
			}
				
			out.println("</body>");
			out.println("</html>");
					
		} 
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		processRequest(request, response);
	}

}
