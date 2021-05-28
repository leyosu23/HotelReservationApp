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
  <form action="registration" method="POST">
  	
      User Name  : <input type="text" name="userName"/> </br>
      Email  : <input type="text" name="email"/></br>
      Password : <input type="text" name="pw"/></br>
      First name : <input type="text" name="firstname"/></br>
      Last name : <input type="text" name="lastname"/></br>
      Phone Number : <input type="text" name="phoneNumber"/></br>
      Address : <input type="text" name="address"/></br>
      City : <input type="text" name="city"/></br>
      Postal Code : <input type="text" name="postalCode"/></br>
      Country : <input type="text" name="country"/></br>
      <input type="submit"/>
   </form>
</body>
</html>