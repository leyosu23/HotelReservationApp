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

<title>Registration Page</title>
</head>
<body>
<H1>Hotel List</H1>
  <table border="2" width="70%" cellpadding="2">  
<tr><th>Room Id</th><th>Room Type</th><th>Price</th></tr>  
   <c:forEach var="hotel" items="${hotels}">   
   <tr>  
   <td>${hotel.roomId}</td>  
   <td>${hotel.roomType}</td>  
   <td>${hotel.price}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   
   <a href="/reservation"><input class="btn btn-primary" value="Make a reservation" /> </a>
		
</body>
</html>