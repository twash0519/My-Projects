<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--  form error -->	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sales</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"> 
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<style>
	html,body{
	background: #fff;

	}
	 #form{
                    width:65%;
                    display:flex;
                    justify-content: center;
                    align-items: center;
                    justify-content: space-around;
                    flex-wrap:wrap;
                    padding: 4px;
                    align:center;
                    
                    
                    color:black;
                    background: #fff;
                   
                   /* border-radius:4%; */
                    
                }
                #email {
                    width:100%;
                    padding: 4px;
                    margin:0px;
                   
                    <!--   background:#660033;-->
                
                }
                  #password {
                    width:100%;
                    padding: 4px;
                    margin:0px;
                   <!-- background:#660033;-->
                
                }
                
                
               button {
                   width:10%; 
                   margin:0px;
                   background-color:#00838f; 
                   color:#fff
                   
                
                }
                
               button:hover  {
  					background-color: #22a8b5; 
					  color: white;
					}
                
                li:hover{
                	background-color: #22a8b5;
                }
                #applyButton{
                    width:100%;
                    padding-top: 4px;
                    margin-top:8px;
                   <!-- background:#660033;-->
                
                }
                
                .container-fluid	{
                background:#00838f;
                color:#fff;
                }
                
                h2{
                padding:20px;
                color:#00838f;
                align:center:
                }
                
                .navbar-brand {
                color:#fff;
                }
   
	</style>
</head>
<body>

<!-- Navigation -->
	
 <%@ include file ="header.jsp"%>
 <!-- End Navigation -->
 <!-- Main Body -->
 <h2>List All Sales</h2>
 <p><br>
 <div align="center">
 <h3>Search here!</h3>
 
 	<p><br>
 
	 <form action="search" method="post">
		<input type="text" name="orderDate" placeholder="Order Date">&nbsp;
		<input type="text" name="shippedDate" placeholder="Shipped Date">&nbsp;
		<input type="text" name="pointOfSale" placeholder="Point of Sales">&nbsp;
		<button >Search</button>
		

	</form>
	 
	<h4>${noRecord}</h4>
	<h4>${recordFound}</h4>
	<h4>${allApplications}</h1>
 </div>	
 <table align="center" style="width:80%" class="table table-hover table-dark">
  <thead>
    <tr style="background:#000; color:#fff">
      <th scope="col" >ID</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Address</th>
      <th scope="col">Order</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>222 Street</td>
      <td>candle</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>222 Street</td>
      <td>candle</td>
    </tr>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry</td>
      <td>Bird</td>
      <td>222 Street</td>
      <td>candle</td>
    </tr>
    <tr>
      <th scope="row">4</th>
      <td >David</td>
      <td >Wilson</td>
      <td>222 Street</td>
      <td>candle</td>
    </tr>
    <tr>
      <th scope="row">5</th>
      <td >Maria </td>
      <td >Brown </td>
      <td>222 Street</td>
      <td>candle</td>
    </tr>
    <tr>
      <th scope="row">6</th>
      <td >Lawrence</td>
      <td >White</td>
      <td>222 Street</td>
      <td>candle</td>
    </tr>
  </tbody>
</table>
<!-- Footer -->
<%@ include file ="footer.jsp"%>
<!-- Footer -->
</body>
</html>