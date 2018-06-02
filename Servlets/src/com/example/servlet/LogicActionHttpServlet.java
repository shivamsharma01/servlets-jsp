package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogicActionHttpServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
			out.print("<br/><h1>Welcome to The Http Login Servlet, Current Time is " + dateTime + "</h1>");
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
