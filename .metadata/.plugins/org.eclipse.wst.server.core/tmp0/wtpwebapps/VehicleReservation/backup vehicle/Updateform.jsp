<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Vehicle Update form</title>
  <%
	String vehicleno=(String)request.getAttribute("vehicleno");
  
%>
        <script type="text/javascript" src="updatevalidation.js"></script>
        <link rel='stylesheet' type="text/css" href="#">

</head>
<body>
	                <h1 align="center">Vehicle Updation Form <br></h1>

                <div class="registration">

                    <form align="center" action="UpdateformServlet" onsubmit="return Validate()" method="Post">
                    <%  session.setAttribute("vehicleno",vehicleno);  %>
                        
                    <input type="text" name="vehicleno" id="vehicleno" placeholder="<%=vehicleno%>" value="<%=vehicleno%>" disabled> 
                    <br>
                    <br>
						
					   Branch<select id="userb" onchange="userbranch()">
                    	<option value=""></option>
                    	<option value="A11">A11</option>
                    	<option value="A12">A12</option>
                    	<option value="A13">A13</option>
                    	<option value="A14">A14</option>
                    	<option value="A15">A15</option>      	
                    </select>
                    <input type="text" name="branch" value="" id="branch">
						
                    <!-- <input type="text" name="branch" id="branch" placeholder="Enter Branch" onblur="branchonblur()" required>
                    <label id="lbranch" style="color:grey; visibility:visible">Alphabetic with max 5 characters</label>
                     -->
                    <br>
                    <br>
                    
                       Vehicle Type<select id="userv" onchange="userVehicle()">
                    	<option value=""></option>
                    	<option value="two wheeler">Two wheeler</option>
                    	<option value="four wheeler">four wheeler</option>
                    </select>
                    <input type="text" name="vehicletype" value="" id="vehicletype">
                    
                    
					<!-- 
                    <input type="text" name="vehicletype" id="vehicletype" placeholder="Enter Vehicle Type" onblur="vehicletypeonblur()" required>
                    <label id="lvehicletype" style="color:grey; visibility:visible">Alphabetic with max 15 characters</label>
                     -->
                     
                     
                    <br>
                    <br>
                    <input type="date" name="insuranceexpirydate" id="insuranceexpirydate" placeholder="MM-DD-YYYY" onblur="insuranceexpirydateonblur()" required>
                    <label id="linsuranceexpirydate" style="color:grey; visibility:visible">Enter Insurance Expiry Date(MM-DD-YYYY)</label>
                    
                    <br>
                    <br>

                    <input type="date" name="lastservicedate" id="lastservicedate" placeholder="MM-DD-YYYY" onblur="lastservicedateonblur()" required>
                    <label id="llastservicedate" style="color:grey; visibility:visible">Enter Last Serviced Date(MM-DD-YYYY)</label>
                    
                   <br>
                   <br>
                   
                   <input type="date" name="serviceduedate" id="serviceduedate" placeholder="MM-DD-YYYY" onblur="serviceduedateonblur()" required>
                   <label id="lserviceduedate" style="color:grey; visibility:visible">Enter Service Due Date(MM-DD-YYYY)</label>
                    
                   <br>
                   <br>
                    <input type="submit" value="submit"> 
                    </form>

                </div>
	
</body>
</html>


