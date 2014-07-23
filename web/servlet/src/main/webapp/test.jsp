<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.yarenty.rememome.jsp.Hello" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
//server side!!
System.out.println("TEST JSP - check ooutput.");

response.getWriter().write("Where I am?");

Hello prod = new Hello();

response.getWriter().write("<br/>PROD::"+prod.getText());

%>


</body>
</html>