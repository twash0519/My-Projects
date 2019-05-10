<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home</title>

<link href="https://useiconic.com/open/css/iconic-glyphs-legacy.css" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"> 
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<!-- 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
 -->


<style>
body, html {
  height: 100%;
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-image {
  /* The image used */
  background-image: url("./images/thumbnail_IMG_7005.jpg");
  
  /* Add the blur effect */
  filter: blur(8px);
  -webkit-filter: blur(8px);
  
  /* Full height */
  height: 100%; 
  
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}

/* Position text in the middle of the page/image */
.bg-text {
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
  color: white;
  font-weight: bold;
  border: 3px solid #f1f1f1;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 2;
  width: 40%;
  padding: 20px;
  /*text-align: center;*/
}
#form{
                    width:65%;
                    display:flex;
                    justify-content: center;
                    align-items: center;
                    justify-content: space-around;
                    flex-wrap:wrap;
                    align:center:
                    
                    color:black;
                    background: #00838f;
                    border-radius:4%; 
                    
                }
                #username {
                    width:100%;
                    padding: 4px;
                    margin:0px;
                    color:#000;
                   
                    <!--   background:#660033;-->
                
                }
                  #password {
                    width:100%;
                    padding: 4px;
                    margin:0px;
                    color:#000;
                   <!-- background:#660033;-->
                
                }
                
                
                
				button {
                    width:100%;
                    padding: 4px;
                    margin:0px;
                  
                   background:#00838f; 
                   color:#fff; 
                   }
                   
                   button:hover  {
  					background-color: #22a8b5; /* Green */
					  color: white;
					}
                
                
                .container-fluid	{
                background:#660033;
                }
                
                h2{
                padding:20px;
                color:#fff;
                align:center:
                }
                
               .iconic[data-glyph=lock-unlocked]:before {content:'\e1de';} 
  
</style>
</head>
<body>

<div class="bg-image"></div>

<div class="bg-text" >
  
                   <div align="center">
                    <form style="padding:40px;" action="/CaseStudy/login" method="POST">
                    	  
                        <table width="100%"  style="padding:50px">
                        <tr>    
      					<td colspan="2" style="color:red">${message}</td>    
    					</tr>   
                        <tr><td align="center" style="padding-top:4; color:#fff; font-size:large">Login</td></tr>
                         <tr>
                                <td>
                                    <span><img src="./images/user-opti.png" /></span><label for="name" style="color:#fff;">User Name</label><br>
                                   
                                   <input id="username" type="text" name="username" placeholder="" class="glyphicon glyphicon-envelope" required autofocus/><br><p>
                                </td>
                                
                            </tr>
                            <tr>
                                <td>
                                	<span ><img src="./images/security-password1.png" /></span>
                                    <label for="password" style="color:#fff;">Password</label><br><input id="password" type="password" name="password" placeholder="" required  autofocus  />
                                </td>
                             </tr>
                   
                            <tr>
                              <td style="justify-content: right;"><p><br>
                                    <button >Sign In</button>
                                    <p>
                                </td>
                            </tr>
                            <tr>
                            	
                            	<td align="right">
                            	<a href="${pageContext.request.contextPath}/register"  style="text-decoration: ; color:#000; ">Forgot password?</a>
                            	</td>
                            </tr>
                            	
                        </table>
                     </form> 
 				
                  
                    </div>
                     <div style="text-align:center;">
                    	 <a href="${pageContext.request.contextPath}/newuser" style="color:#fff; font-size:small">Create a new account</a><p><br><p>
                     </div>
                     
</div>
<div>
<!-- Footer -->
<%@ include file ="footer.jsp"%>

<!-- Footer --></div>

</body>
</html>
