<%@page import="com.example.bean.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!private Date getToday() {
		return new Date();
	}%>
	<%
		LoginBean loginBean = (LoginBean) session.getAttribute("login");
	%>
	<h2>
		<%="Welcome to the success page...." + loginBean.getUsername() + ". You logged in at " + getToday()%>
		<%="You Logged in as " + request.getParameter("role")%>
	</h2>
</body>
</html>