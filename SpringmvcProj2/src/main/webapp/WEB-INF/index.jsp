<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello my name is Bablu kumar</h1>

<%
String n = (String) request.getAttribute("name");
%>

<h2>your name is:
<%= n %>
</h2>

</body>
</html>
