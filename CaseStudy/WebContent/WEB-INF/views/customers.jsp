<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--  form error -->	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers</title>
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
     }
     
     #email {
      width:100%;
      padding: 4px;
      margin:0px;
      }
      
      #password {
       width:100%;
       padding: 4px;
       margin:0px;
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
            h5 a{
              color:#00838f;	
            }
   
</style>
</head>
<body>

<!-- Navigation -->
	
 	<%@ include file ="header.jsp"%>
<!-- End Navigation -->
 <!-- Main Body -->
 <h2>Customers</h2>
 <div align="center">
 <h3>Search here!</h3>
 <p>
 	<form action="search" method="post">
		<input type="text" name="firstName" placeholder="First Name">&nbsp;
		<input type="text" name="lastName" placeholder="Last Name">&nbsp;
		<button >Search</button>
	</form>
 <p><br>
	<h4 style="color:red">${noRecord}</h4>
	<h4 style="color:#00838f;">${recordFound}</h4>
	<h5 style="color:#00838f;">${customerDisplay}</h5>
 </div>	
 <table align="center" style="width:80%" class="table table-hover table-dark">
  <thead>
    <tr style="background:#000; color:#fff">
      <th scope="col" >ID</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Email</th>
      <th scope="col">Street</th>
      <th scope="col">State</th>
      <th scope="col">Zip</th>
     
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${customerList}" var="customer">
    <tr>
      <td scope="row">${customer.id}</th>
      <td>${customer.firstName}</td>
      <td>${customer.lastName}</td>
      <td>${customer.email}</td>
      <td>${customer.street}</td>
      <td>${customer.state}</td>
      <td>${customer.zip}</td>
     
   </tr>
   
    </c:forEach>
  </tbody>
</table>
<!-- Footer -->
<%@ include file ="footer.jsp"%>
<!-- Footer -->
</body>
</html>