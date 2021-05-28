<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
  <form action="reservation" method="POST">
  	
      Total Nights   : <input type="text" name="totalNights"/> </br>
      Total Guest  : <input type="text" name="totalGuest"/></br>
      Customer ID  : <input type="text" name="custId"/></br>
      Room ID  : <input type="text" name="roomId"/></br>
      <input type="submit" name="reservation"/>
   </form>
</body>
</html>