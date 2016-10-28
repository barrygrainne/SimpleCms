<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
//invalidate the session object
session.invalidate();

//redirect to login.jsp
response.sendRedirect("login.jsp");
%>
