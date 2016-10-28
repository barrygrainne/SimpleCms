<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
  <link rel="stylesheet" href="css/home.css" type="text/css">
</head>

<body onload ="updateYear();">

<div id="header">Hello

  </div>

<div id="left">
  

</div>
<div id="main"><form action="login.jsp" method="post">
username:<input type="text" name="userName"><br>
password:<input type="password" name="password"><br>
<input type="submit" value="submit" name="submit"><br>


</form>

</div>
<div id="footer">&copy;<span id="year">2015</span> Revenue Commissioners</div>



<%
String userName = request.getParameter("userName");
String password = request.getParameter("password");
boolean loggedIn = false;

if(userName == null || password == null) {
	loggedIn = false;
} else if (userName.equals("Grainne") && password.equals("password")) {
	
		loggedIn = true;	
}

if (loggedIn) {
	session.setAttribute("userName", userName);
	response.sendRedirect("home.jsp");
	//out.println("<a href='home.jsp'>proceed to main page</a>");
	
}
else {
	out.println("Please log in");
}
%>


<script src="js/functions.js">

</script>


</body>
</html>