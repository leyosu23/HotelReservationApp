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

<title>Edit Customer</title>
</head>
<body>


<form action="customerEdit" method="POST"> 
	  Customer ID  : <input type="text" name="custId"/> </br>
      userName  : <input type="text" name="userName"/> </br>
      pw  : <input type="text" name="pw"/> </br>
      email  : <input type="text" name="email"/> </br>
      First Name  : <input type="text" name="firstname"/></br>
      Last Name : <input type="text" name="lastname"/></br>
      phone Number : <input type="text" name="phoneNumber"/></br>
      address : <input type="text" name="address"/></br>
      city : <input type="text" name="city"/></br>
      postalCode : <input type="text" name="postalCode"/></br>
      country : <input type="text" name="country"/></br>
     <input type="submit" name="edit"/>
     
</form>

</body>
</html>