<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	
	<body>
		<h1>Employee Form</h1>
		<form:form method="POST" action="save.html" modelAttribute="employee">
	First name: <form:input path="firstName" /><br>
	Last name: <form:input path="lastName" /><br>
	Designation: <form:select path="designation">
				<form:option value="">Please Select Designation </form:option>
				<form:options items="${designation}" />
			</form:select>
	Salary: <form:input path="salary" /><br>
			<button type="button">Add Employee</button>
		</form:form>
	</body>
</html>