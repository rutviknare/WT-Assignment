<?php
include "connect.php";

if(isset($_GET['deleteid'])){
    $id=$_GET['deleteid'];
    $sql="delete from crud where id=$id";
    $result=mysqli_query($con,$sql);
    if($result){

        echo '<script type="text/javascript">';
        echo ' alert("Deleted Succussfully..")';  //not showing an alert box.
        echo '</script>';
        header("location:display.php");
        // echo "Deleted Successfully...";
    }
    else{
        die(mysqli_error($con));
    }
}
?>