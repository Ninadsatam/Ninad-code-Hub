<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>DigiMart</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="Home.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<form action="AddProduct" method="get">
<div>
<ul>
<li class="active"><a href="#">Digimart</a></li>
<li><a href="#"><i class="fa fa-user-circle fa-2x black" aria-hidden="true"></i></a></li>
</ul>
</div>
<div class="rightcomp">
<ul>
<li><a href="#">Contact</a></li>
<li><a href="#">Return Order</a></li>
<li><a href="#">Login</a></li>
</ul>
</div>
<div class="product">

<h2>Add Your Product for Sale</h2>
<br/>
<input type="text" placeholder=" Enter product id..." name="id" class="prod">
<br/>
<br/>


<input type="text" placeholder=" Enter product name..." name="name" class="prod">
<br/>
<br/>


<input type="text" placeholder=" Enter product price..." name="price" class="prod">
<br/>
<br/>


<input type="text" placeholder=" Enter product Features..." name="features" class="prod">

<br/>
<br/>


<input type="text" placeholder=" Enter product count..." name="count" class="prod">
<br/>
<br/>


<!--  <input type="text" placeholder=" Enter product addition date..." name="date" class="prod">
<br/>
<br/>

<b>Select Image</b><input type="file" placeholder=" Enter product Features..." name="img" class="prod">

<br/>
<br/>-->




<input type="submit" value="Add Product" class="butn" name="sub">


</div>

</form>



</body>
</html>