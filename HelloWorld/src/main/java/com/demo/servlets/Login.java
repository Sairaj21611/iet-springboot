package com.demo.servlets;
import com.demo.beans.MyUser;
import com.demo.service.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Login extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		LoginService lservice = new LoginServiceImpl();
		MyUser user = lservice.validUser("uname","pass");
		if(user!=null) {
			RequestDispatcher rd = request.getRequestDispatcher("showproduct");
			rd.forward(request, response);
		}else {
			out.print("<h1>Invalid Credentials</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}
