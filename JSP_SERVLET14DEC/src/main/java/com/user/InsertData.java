package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


//@WebServlet("/Register")
@MultipartConfig
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String password = request.getParameter("user_password");
		Part img = request.getPart("image");
		String fileName = img.getSubmittedFileName();
		System.out.println(fileName);
		out.println("<h1>"+fileName+"</h1>");
		
		try
		{
			Class.forName("com.mysql.jdbc.cj.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservlet", "root", "root");	
			String q="insert into user (name,password,email)values(?,?,?)";
			PreparedStatement prepareStatement = con.prepareStatement(q);
			prepareStatement.setString(1, name);
			prepareStatement.setString(2, password);
			prepareStatement.setString(3, email);
//			int i = prepareStatement.executeUpdate();
//			if(i>0)
//			{
//				out.println("<h1>Done</h1>");
//			}
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			out.println("<h1>error</h1>");
		}
		
		
		
	}

}
