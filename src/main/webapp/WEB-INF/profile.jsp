<%@ page import="com.spring.boot.Customer"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
	<%
	Customer cust = (Customer) request.getAttribute("CustomerKey");
	%>
	<h1>Profile</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>userName</th>
			<th>email</th>
			<th>firstname</th>
			<th>lastname</th>
			<th>phoneNumber</th>
			<th>address</th>
			<th>city</th>
			<th>country</th>
		</tr>
		<tr>
			<td><%=cust.getUserName()%>
			<td><%=cust.getEmail()%>
			<td><%=cust.getFirstname()%>
			<td><%=cust.getLastname()%>
			<td><%=cust.getPhoneNumber()%>
			<td><%=cust.getAddress()%>
			<td><%=cust.getCity()%>
			<td><%=cust.getCountry()%>

		</tr>
	</table>
	<br />
	<a href="/">Back to Menu</a>
	</br>
	<a href="customerEdit"><input class="btn btn-primary"
		value="Edit Profile" /> </a>
	<a href="hotel"><input class="btn btn-primary"
		value="Check Available Room" /> </a>
	 <form action="reservationList" method="POST">
  	<input type="hidden" value= <%=cust.getCustId()%> name="custId"/></br>
   <input  type="submit" class="btn btn-primary" value="Check reservation status" /> 
   </form>
		

</body>
</html>