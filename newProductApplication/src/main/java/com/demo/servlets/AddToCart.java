package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;


@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		MyUser user = (MyUser) session.getAttribute("user");
		
		if(user!=null && user.getRole().equals("user")) {
			int pid = Integer.parseInt(request.getParameter("pid"));
			String pname = request.getParameter("pname");
			double price = Double.parseDouble(request.getParameter("price"));
			
			int order_qty = Integer.parseInt(request.getParameter("qty"));
		}
		
		
	}

}
