<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.professionaltraining.rc.CmsMenu" %> <!-- this is how you import a class -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
<h1>Simple CMS</h1>

<%
	CmsMenu menu = new CmsMenu();
	
%>

<%=menu.getSideMenu()%>


</body>
</html>