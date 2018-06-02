package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginActionServlet implements Servlet {

	@Override
	public void destroy() {
		Logger logger = Logger.getLogger(this.getClass().getName());
		logger.log(Level.INFO, "LoginAction servlet destroying...");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		Logger logger = Logger.getLogger(this.getClass().getName());
		logger.log(Level.INFO, "LoginAction servlet initializing...");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Logger logger = Logger.getLogger(this.getClass().getName());
		String dateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
		if ("admin".equalsIgnoreCase(username) && "password".equals(password)) {
			out.print("<html>");
			out.print("<head>");
			out.print("</head>");
			out.print("<body>");
			out.print("<br/><h1>Welcome to The Login Servlet, Current Time is " + dateTime + "</h1>");
			out.print("</body>");
			out.print("</html>");
			logger.log(Level.INFO, "Logged in at " + dateTime);
		} else {
			out.print("<html>");
			out.print("<head>");
			out.print("</head>");
			out.print("<body>");
			out.print("<h2>Invalid Login Attempt</h2><a href='html/login.html'></a>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
