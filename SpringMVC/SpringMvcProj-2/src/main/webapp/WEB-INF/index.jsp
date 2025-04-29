<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>View part you show</h1>
<%
String n1 = (String)request.getAttribute("name");
 Integer r3 = (Integer)request.getAttribute("Id");

%>
<h2>your Name is 
<%= n1 %>
</h2>
<h2>your Name is 
<%= r3 %>
</h2>



</body>
</html>