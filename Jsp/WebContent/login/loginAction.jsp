<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page errorPage="loginError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if ("admin".equalsIgnoreCase(username) && "password".equals(password)) {
	%>
	<jsp:useBean id="login" class="com.example.bean.LoginBean" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="login"/>
	<jsp:forward page="loginSuccess.jsp">
		<jsp:param value="admin" name="role"/>
	</jsp:forward>
	<%
		} else {
			throw new Exception("Invalid Login Credentials.. Please login again....");
		}
	%>
</body>
</html>