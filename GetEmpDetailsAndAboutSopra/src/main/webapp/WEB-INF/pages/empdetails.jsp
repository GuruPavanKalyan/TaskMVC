<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page import="com.storage.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee details</title>
<style type="text/css">
body {
	background-color: #000000d1;
}

div {
	/*     background: white;
 */
	padding: 20px 30px;
	display: flex;
	flex-direction: row;
	flex-wrap: wrap;
	justify-content: space-around;
	align-content: space-around;
	align-items: center;
}

table {
	width: 60%;
	text-align: center;
	padding: 10px 5px;
}

tr {
	border-bottom: 1px solid black;
	height: 50px;
	/* 	background-color:black;
 */
}

th {
	color: red;
}

td {
	width: 300px;
	color: white;
}
</style>
</head>
<body>
	<%
	Employee emp = (Employee) request.getAttribute("emp");
	String norec = "No Record";
	if (emp.getEmpName() == null)
		emp.setEmpName(norec);
	if (emp.getEmpDep() == null)
		emp.setEmpDep(norec);
	%>
	<div>
		<table>
			<tr>
				<th>Employe Id</th>
				<th>Employe Name</th>
				<th>Employe Department</th>
			</tr>
			<tr>
				<td>
					<%=emp.getEmpid() %>
				</td>
				<td><%=emp.getEmpName()%></td>
				<td><%=emp.getEmpDep()%></td>
			</tr>
		</table>
	</div>
</body>
</html>