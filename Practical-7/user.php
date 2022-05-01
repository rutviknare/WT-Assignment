<?php 
include 'connect.php';
if(isset($_POST['submit'])){
    $name=$_POST['name'];
    $email=$_POST['email'];
    $mobile=$_POST['mobile'];
    $password=$_POST['password'];

    $sql="insert into crud (name,email,mobile,password) 
    values('$name','$email','$mobile','$password')";
    $result=mysqli_query($con,$sql);
    if($result){
        header("location:display.php");
    }else{
        die(mysqli_error($con));
    }

}   

?>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Practical No-7</title>
  </head>
  <body>
    <div class="container my-5">
    <h1 style="position:absolute; left:500pt; top:30pt; text-decoration:underline">Add Users Details</h1>

    <form method="post" style="position:absolute; top:100pt; width:500pt; left:300pt">
    <div class="form-group">
    <label>Name</label>
    <input type="text" class="form-control" placeholder="Enter your Name" name="name" autocomplete="off">
  </div>

  <div class="form-group">
    <label>E-Mail</label>
    <input type="email" class="form-control" placeholder="Enter your Email" name="email" autocomplete="off">
  </div>

  <div class="form-group">
    <label>Mobile No</label>
    <input type="text" class="form-control" placeholder="Enter your Mobile No" name="mobile" autocomplete="off">
  </div>

  <div class="form-group">
    <label>Password</label>
    <input type="password" class="form-control" placeholder="Enter your Password" name="password" autocomplete="off">
  </div>

  
  <button type="submit" class="btn btn-primary" name="submit">Submit</button>
</form>
    </div>
    
  </body>
</html>