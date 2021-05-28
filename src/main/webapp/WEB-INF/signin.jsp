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

<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<title>Sign in Page</title>
</head>
<body>
 <h2 class="text-center">Sign in</h2>
      
    
  <form action="profile" method="POST">
  
    <div class="form-group">
  <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-user"></i>   </span> <input
                        type="text" class="form-control" th:field="userName" name="userName"
                        placeholder="Username" />
                     
   </div>
     </div>
     
        <div class="form-group">
    <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-user"></i>  </span> <input
                        type="text" class="form-control" th:field="pw" name="pw"
                        placeholder="Password" />
                      
   </div>
    </div>
    
    <div class="form-group">
   
                    
         <input type="submit" name="signin"  class="btn btn-primary login-btn btn-block"/>
           
            
    </div>
    
     </form>
   
    
</body>
</html>