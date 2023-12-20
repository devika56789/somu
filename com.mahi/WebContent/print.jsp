<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>user details</h1>
<% 
String name=request.getParameter("user");
String pass=request.getParameter("pwd");
if(name.equals("devi")&& pass.equals("123"))
{
	//out.println("name:"+name);
	//out.println("password:"+pass);
	response.sendRedirect("http://www.google.com/");
}
else
{
	out.println("invalid credentials");
	RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
	rd.include(request, response);
}
%>
</body>
</html>