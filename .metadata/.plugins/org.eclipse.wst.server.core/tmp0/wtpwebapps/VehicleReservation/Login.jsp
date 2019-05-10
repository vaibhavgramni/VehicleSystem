<%
       response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
       response.setHeader("Pragma","no-cache"); //HTTP 1.0
       response.setDateHeader ("Expires", 0); //prevents caching at the proxy server

              System.out.println("\nLogin.jsp");
              
              System.out.println("Attribute ID : "+request.getSession().getAttribute("Id"));
              System.out.println("Parameter Username : "+request.getParameter("username"));

              if(request.getParameter("username") == null && request.getSession().getAttribute("Id")!=null && request.getSession().getAttribute("Logged")!="false")
              {
                     
                     System.out.println("Backed while logged in");
                     request.getSession().setAttribute("Id",null);
              request.getSession().setAttribute("Logged", "false");
               response.sendRedirect("Login.jsp");
                     return;
                
              }

              if(request.getSession().getAttribute("Id")!="-2" && request.getSession().getAttribute("Logged")=="false")
              {
                     System.out.println("Changing Logged");
                     request.getSession().setAttribute("Id","-1");
                     System.out.println("Attribute ID : "+request.getSession().getAttribute("Id"));
                     System.out.println("Parameter Username : "+request.getParameter("username"));
                     
              }

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    
<link rel="icon" href="Capture5.png" type="image/gif" sizes="70x70">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<head>
		<meta charset="utf-8">
        <link rel='shortcut icon' type='image/x-icon' href='favicon.ico'/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
       <!--  <script type="text/javascript" src="vehicleregis.js"></script> -->
        <link rel='stylesheet' type="text/css" href="Login.css">
		<link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
</head>
<body>
    
<!-- Navbar (sit on top) -->

<div class="w3-top">
 
 <div class="w3-bar w3-white w3-card" id="myNavbar">
    
<a href="#home" class="w3-bar-item w3-button w3-wide">
        
<div class="logo-image">
            
<img src="Capture1.PNG" >
      
</div>
    
</a>
    
    
<div class="w3-right w3-hide-small">
      
<a href="h1.html" class="w3-bar-item w3-button">HOME</a>
      
<a href="aboutus.html" class="w3-bar-item w3-button">ABOUT US</a>
     
<a href="contactus.html" class="w3-bar-item w3-button">CONTACT US</a>
      
<a href="Login.html" class="w3-bar-item w3-button">LOGIN</a>
      
<!--<a href="#contact" class="w3-bar-item w3-button">
<i class="fa fa-envelope"></i> CONTACT</a>-->
    </div>
    </div>
</div>
        <br />    <br />    <br />    <br />    <br />
                <div class="registration"><br>

                    <form  align="left" action="LoginUser" method="Post">
                    <br><h1 align="center">Login<br></h1><br><br />
                    
                    <span class="number">1</span> Username
                    <input type="text" name="empid" placeholder="Enter your Employee Id" required> 
                    <label id="lvehicleno" style="color:grey; visibility:visible">Max 10 characters</label>
                    
                    <br>
                    
                    <span class="number">2</span> Password
                    <input type="password" name="password" placeholder="Enter your password" required> 
                    <label id="lpassword" style="color:grey; visibility:visible">Please use alphanumeric characters and symbols</label>
                    
                        
                    <br>
                    <br>
                        <div class="wrapper">
                    <button type="submit">Login</button> 
                            <br/>
                    <a href="Register.html">Create Account</a>
                            <br />
                    </form>

                </div>

</body>
</html>