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


<!DOCTYPE html>
<html>
    
        <link rel="icon" href="Capture5.PNG" type="image/gif" sizes="70x70">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <head>
        <meta charset="utf-8">
         <link rel='stylesheet'  href="style1.css">
         <script src="search.js" type="text/javascript"></script>
        <title>Search Vehicle Details</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>   

		<%
	String name=(String)session.getAttribute("name");
%>

       <script type="text/javascript">
		function checkVehicleNo()
		{
			var no=prompt("Please enter Vehicle No:", "Proper format");
			document.getElementById("vehicleno").value=no;
			return true;
		}
	</script>
    </head>
            <body>
                               
<!-- Navbar (sit on top) -->

<div class="w3-top">
 
 <div class="w3-bar w3-white w3-card" id="myNavbar">
    
<a href="h1.html" class="w3-bar-item w3-button w3-wide">
        
<div class="logo-image">
            
<img src="Capture1.PNG">
      
</div>
    
</a>
    
    
<div class="w3-right w3-hide-small">
      
<a href="h1.html" class="w3-bar-item w3-button">HOME</a>
      
<a href="aboutus.html" class="w3-bar-item w3-button">ABOUT US</a>
     
<a href="contactus.html" class="w3-bar-item w3-button">CONTACT US</a>
      
<!-- <form action="#" class="w3-bar-item w3-button">
<input type="submit" href="#contact us" value="Logout" style="color:darkcyan;"></input>
      </form> -->
      <form action="logout.jsp" class="w3-bar-item w3-button">
<button type="Logout" name="Logout">Logout</button>
      </form>
      
<!--<a href="#contact" class="w3-bar-item w3-button">
<i class="fa fa-envelope"></i> CONTACT</a>-->
    </div>
    </div>
</div>
                <!--<header>
                   
                    <ul id="left-nav">
                        <li>Vehicle Resevation</li>
                    </ul>
                    <ul id="right-nav">
                        <li><a href="">Home</a></li>
                        <li><a href="">About Us</a></li>
                        <li><a href="">Contact Us</a></li>
                        <li><a href="">Logout</a></li>
                    </ul>
                </header>--> <br>
<br><br>
<h4 align="right">Hi <%=name%>, you are logged in. </h4>
				
                <h1>Search Vehicle Details</h1>
				
				
                <h3><div class="first">Search by Branch</h3></div>
				<select id="sbranch">
					<option value=""></option>
					<option value="A11">A11</option>
					<option value="A12">A12</option>
					<option value="A13">A13</option>
					<option value="A14">A14</option>
					<option value="A15">A15</option>
					
				</select>
				


                <div class="search-box1">
                 
                        
                        <form action="SearchBranchData.jsp" onsubmit="return searchbranch()"  class="search-txt1">
                        <button class="button1" type="submit"  >Search</button>
                        <input type="hidden" id="branch" name="branch" value="">
                        </form>
                        <a class="search-btn1">                       
                            <i class="fas fa-search"></i></a>
                        
                     
                </div>


                <h3><div class="second">Search by Vehicle Type</h3></div>
				<select id="svehicle">	
					<option value=""></option>
					<option value="two wheeler">Two wheeler</option>
					<option value="four wheeler">Four wheeler</option>
				</select>
				

                <div class="search-box2">
                 
                        
                         <form action="SearchVehicleTypeData.jsp" onsubmit="return searchvehicletype()" class="search-txt2">   
                        <button class="button2" type="submit"  >Search</button>
                        <input type="hidden" id="vehicletype" name="vehicletype" value="">
                        </form>
                        <a class="search-btn2">                       
                            <i class="fas fa-search"></i></a>
                        
                     
                </div>


                <h3><div class="third">Search by Insurance Expiry Month</h3></div>
				<select id="Ivehicle">	
					<option value=""></option>
					<option value="0">January</option>
					<option value="1">February</option>
					<option value="2">March</option>
					<option value="3">April</option>
					<option value="4">May</option>
					<option value="5">June</option>
					<option value="6">July</option>
					<option value="7">August</option>
					<option value="8">September</option>
					<option value="9">October</option>
					<option value="10">November</option>
					<option value="11">December</option>
					
				</select>
				<!--  -->
				

                <div class="search-box3">
                 
                        
                        <form action="SearchInsuranceDate.jsp" onsubmit="return searchInsuranceDate()" class="search-txt3">  
                        <button class="button3" type="submit"  >Search</button>
                        <input type="hidden" id="insurancedate" name="insurancedate" value="">
                        </form>
                        <a class="search-btn3">                       
                            <i class="fas fa-search"></i></a>
                        
                     
                </div>



                <h3><div class="fourth">Search by Service Due Month</h3></div>
				<select id="Servehicle">	
					<option value=""></option>
					<option value="0">January</option>
					<option value="1">February</option>
					<option value="2">March</option>
					<option value="3">April</option>
					<option value="4">May</option>
					<option value="5">June</option>
					<option value="6">July</option>
					<option value="7">August</option>
					<option value="8">September</option>
					<option value="9">October</option>
					<option value="10">November</option>
					<option value="11">December</option>
					
				</select>
				<!--  -->
				

                 <div class="search-box4">
                 
                        
                        <form action="SearchServiceDate.jsp" onsubmit="return searchServiceDate()" class="search-txt4">    
                        <button class="button4" type="submit"  >Search</button>
                        <input type="hidden" id="servicedate" name="servicedate" value="">
                        </form>
                        <a class="search-btn4">                       
                            <i class="fas fa-search"></i></a>
                        
                     
                </div>

                
            </body>
</html>


