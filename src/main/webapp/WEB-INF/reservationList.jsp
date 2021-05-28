<%@ page import="com.spring.boot.Reservation"%>
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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>

<h1>Reservations</h1>  


<%
	Reservation res = (Reservation) request.getAttribute("CustomerKey");
	%>
	
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Reservation ID</th>
			<th>Total Nights</th>
			<th>Total Guest</th>
		</tr>
		<tr>
			<td><%=res.getReservationId()%></td>
			<td><%=res.getTotalNights()%></td>
			<td><%=res.getTotalGuest()%></td>
			<td>
			<form action="reservationDelete" method="POST">
	<input type="hidden" value= <%=res.getReservationId()%> name="resId"/>
			<button type="submit" class="btn btn-primary btn-sm" >Cancel</button>
	</form>
	
   </td>
		</tr>
	</table>
	
	<br />
   
  
  <br/>
   
   	  <a href="reservationEdit"><input class="btn btn-primary" value="Modify Reservation"/> </a>
   	   <br/>
   	<a href="/">Back to Main Menu</a> </br>
   	<a href="/profile">Back to Profile</a> </br>

</body>
</html>