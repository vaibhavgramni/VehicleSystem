<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader ("Expires", 0); //prevents caching at the proxy server

System.out.println("Session Attribute ID: "+request.getSession().getAttribute("Id")+"\n");

if (request.getSession().getAttribute("Id") == "-1") 
{   
       System.out.println("Login Error. Redirecting");
       
       request.getSession().setAttribute("Id","-2");
     response.sendRedirect("Login.jsp");
     return;
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <link rel="icon" href="Capture5.PNG" type="image/gif" sizes="70x70">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<head>
		<meta charset="utf-8">
        <link rel='shortcut icon' type='image/x-icon' href='favicon.ico'/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Update Vehicle Details</title>
   <%
	String vehicleno=(String)request.getAttribute("vehicleno");
  
%>
        <script type="text/javascript" src="UpdatePageValidation.js"></script>
        <link rel='stylesheet' type="text/css" href="UpdateVehicleInfo.css">
		<link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
</head>
<body>
           
<!-- Navbar (sit on top) -->

<div class="w3-top">
 
 <div class="w3-bar w3-white w3-card" id="myNavbar">
    
<a href="h1.html" class="w3-bar-item w3-button w3-wide">
        
<div class="logo-image">
            
<img src="Capture1.PNG" >
      
</div>
    
</a>
    
    
<div class="w3-right w3-hide-small">
      
<a href="h1.html" class="w3-bar-item w3-button">HOME</a>
      
<a href="aboutus.html" class="w3-bar-item w3-button">ABOUT US</a>
     
<a href="contactus.html" class="w3-bar-item w3-button">CONTACT US</a>
      
<form action="logout.jsp" class="w3-bar-item w3-button">
<button type="Logout" name="Logout" class="ll">Logout</button>
      </form>
      
<!--<a href="#contact" class="w3-bar-item w3-button">
<i class="fa fa-envelope"></i> CONTACT</a>-->
    </div>
    </div>
</div>
                <br />
                <div class="registration"><br>

                    <form  align="left" action="UpdateformServlet2" onsubmit="return Validate()" method="Post">
                    <br><h1 align="center">Update Vehicle Details<br></h1><br>
                    
                    <span class="number">1</span> Vehicle Number
                    
                    <input type="text" name="vehicleno" id="vehicleno" placeholder="Enter Vehicle Number" required> 
                    <label id="lvehicleno" style="color:grey; visibility:visible">Alphanumeric with max 10 characters</label>
                    
                    <br>
                    
					<span class="number">2</span> Branch
                    <select name="branch" id="userv" placeholder="Enter Branch" onchange="userVehicle()" required>
                        <option value=""></option>
                        <option name="A11">A11</option>
                        <option name="A11">A12</option>
                        <option name="A11">A13</option>
                        <option name="A11">A14</option>
                        <option name="A11">A15</option>
                    </select>
                    <input type="hidden" name="branch" value="" id="branch">
                    <label id="lbranch" style="color:grey; visibility:visible">Select one option</label>
                    
                    <br>
                    
                    <span class="number">3</span> Vehicle Type
                    <select name ="vehicletype" id="userv" placeholder="Enter Vehicle Type" onchange="userVehicle()" required>
                        <option value=""></option>
                        <option name="two Wheeler">two Wheeler</option>
                        <option name="four Wheeler">four Wheeler</option>
                    </select>
                    <input type="hidden" name="vehicletype" value="" id="vehicletype">
                    <label id="lvehicletype" style="color:grey; visibility:visible">Select one option</label>
                    
                    <br>
                    
                    <span class="number">4</span> Insurance Expiry
                    <input type="date" name="insuranceexpirydate" id="insuranceexpirydate" placeholder="MM-DD-YYYY" onblur="insuranceexpirydateonblur()" required>
                    <label id="linsuranceexpirydate" style="color:grey; visibility:visible">Enter Insurance Expiry Date(MM-DD-YYYY)</label>
                    
                    <br>
                    
					<span class="number">5</span> Last Service
                    <input type="date" name="lastservicedate" id="lastservicedate" placeholder="MM-DD-YYYY" onblur="lastservicedateonblur()" required>
                    <label id="llastservicedate" style="color:grey; visibility:visible">Enter Last Serviced Date(MM-DD-YYYY)</label>
                    
                    <br>
                    
                    <span class="number">6</span> Service Due
                    <input type="date" name="serviceduedate" id="serviceduedate" placeholder="MM-DD-YYYY" onblur="serviceduedateonblur()" required>
                    <label id="lserviceduedate" style="color:grey; visibility:visible">Enter Service Due Date(MM-DD-YYYY)</label>
                    
                    <br>
                    <br>
                        <div class="wrapper">
                    <button type="submit" class = "op">Register</button> 
                    </form>

                </div>

</body>
</html>