
<%@page import="java.util.List"%>
<%@page import="com.jsp.Dto.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table{

text-align: center;
}
th{
font-style: oblique;
color: black;}
td{
color: blue;
font-style: italic;
}
</style>

</head>
<body>

<% List<Hospital> list=(List<Hospital>)request.getAttribute("addlist"); %>
<table border="2px" >
<tr>
<th>Id</th>
<th>Name</th>
<th>Website</th>
<th>Phone</th>
<th>Update</th>
<th>Delete</th>




</tr>
<%
for(Hospital hospital: list){ 
%>
<tr>
<td ><%=hospital.getId() %></td>
<td ><%=hospital.getName() %></td>
<td ><%=hospital.getPhone()%></td>
<td ><%=hospital.getWebsite() %></td>
<td ><a href="edit?id=<%= hospital.getId()%>">Edit</a> </td>
<td ><a href="delete?id=<%= hospital.getId()%>">DELETE</a> </td>

</tr>


<%} %>
</table>

</body>
</html>