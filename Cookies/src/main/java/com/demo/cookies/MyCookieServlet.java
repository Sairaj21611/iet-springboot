package com.demo.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet("/cookieservlet")
public class MyCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");

		String btn = request.getParameter("btn");

		switch (btn) {
		case "add" -> {
			String val = request.getParameter("val");
			Cookie c = new Cookie(name, val);
			response.addCookie(c);

			out.print("<h2>Cookie added</h2>");

		}
		case "delete" -> {
			Cookie[] carr = request.getCookies();
			
			for(Cookie e: carr) {
				if(e.getName().equals(name)) {
					e.setMaxAge(0);
					response.addCookie(e);
					out.println("<h1>Cookie "+name+"deleted");
					break;
				}
			}
		}
		case "display" -> {
			Cookie[] carr = request.getCookies();
			
			for(Cookie e: carr) {
				out.println("name : "+e.getName()+"---->"+"Value : "+e.getValue());
			}
		}
		}
		RequestDispatcher rd= request.getRequestDispatcher("cookies.html");
		rd.include(request, response);
	}

}
