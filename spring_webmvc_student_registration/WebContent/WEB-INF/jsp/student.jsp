<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Student Information</h2>
	<form:form method="POST" action="/spring_webmvc_student_registration/addStudent">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td><form:label path="rollno">Rollno</form:label></td>
				<td><form:input path="rollno" /></td>
			</tr>
			<tr>
				<td><form:label path="collegeName">collegeName</form:label></td>
				<td><form:input path="collegeName" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>