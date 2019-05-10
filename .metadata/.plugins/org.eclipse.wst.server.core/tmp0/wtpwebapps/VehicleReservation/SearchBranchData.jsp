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

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="VehicleR.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="icon" href="Capture5.PNG" type="image/gif" sizes="70x70">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="Stylesheet" href="tablebranch.css">
<title>Branch Search Details</title>
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
<button type="Logout" name="Logout">Logout</button>
      </form>
      
<!--<a href="#contact" class="w3-bar-item w3-button">
<i class="fa fa-envelope"></i> CONTACT</a>-->
    </div>
    </div>
</div>
<%
Connection con=null;
PreparedStatement pstmt=null;
ResultSet rs=null;
String branch = (String)request.getParameter("branch");
String role = (String)session.getAttribute("role");
%><br>
	<br>
	<br>	
		<br>
		<br>
		<br>
		<br>
		<table>
			<tr>
			
			</tr>
			<tr> 
				<th><b>Vehicle No</b></th>
				<th><b>Branch</b></th>
				<th><b>Vehicle Type</b></th>
				<th><b>Insurance Date</b></th>
				<th><b>Last Service Date</b></th>
				<th><b>Service Due Date</b></th>
				</tr>
				<%
				try {
		               con=Util1.getConnection();
		               System.out.println("before stmt");
		               System.out.println(branch);
		               pstmt=con.prepareStatement("select * from vehicleinfo1 where branch='"+branch+"'");
		               System.out.println("after stmt");
		               rs=pstmt.executeQuery();
		               System.out.println("Inside try search page");
		               while(rs.next())
		               {
		            	   System.out.println("inside while next");
		            	   String d = rs.getString("insurancedate");
		            	    String servicedate = rs.getString("serviceduedate");
		            	    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		           			Date date = format.parse(d);
		           			Date dateservice = format.parse(servicedate);
		           		 	System.out.println(date);
		            	   Date datetoday = Calendar.getInstance().getTime();
		         	       int diffInDays = (int) ((datetoday.getTime() - date.getTime()) / (1000 * 60 * 60 * 24));
		         	       int diffInDaysService = (int) ((datetoday.getTime() - dateservice.getTime()) / (1000 * 60 * 60 * 24)); 	
		         	        System.out.println(diffInDays);
		            	   if(role.equals("admin"))
		            	   {
		            		   %>
		            		   	<tr>
					<td><a href="UpdateAgain.jsp" id="vehicleno"><%=rs.getString("vehicleno") %></a></td>
					<td><%=rs.getString("branch") %></td>
					<td><%=rs.getString("vehicletype") %></td>
					<%  if(diffInDays<=15)
		         	        				{  %>
		    									<td style="color:red;"><%=rs.getString("insurancedate") %></td>
		    								<% }
		    								else
		    								{  %>
		    									<td><%=rs.getString("insurancedate") %></td>
		    							<% 	}  %>
		    								<td><%=rs.getString("lastservicedate") %></td>
		    								<%  if(diffInDaysService<=15)
		         	        				{  %>
		    									<td style="color:red;"><%=rs.getString("serviceduedate") %></td>
		    								<% }
		    								else
		    								{  %>
		    									<td><%=rs.getString("serviceduedate") %></td>
		    							<% 	}  %>	
					
				</tr>
						<% 
		            	   }
		            	   else
		            	   {
		            		  %>
		            		  <tr>
					<td><%=rs.getString("vehicleno") %></td>
					<td><%=rs.getString("branch") %></td>
					<td><%=rs.getString("vehicletype") %></td>
					<%  if(diffInDays<=15)
		         	        				{  %>
		    									<td style="color:red;"><%=rs.getString("insurancedate") %></td>
		    								<% }
		    								else
		    								{  %>
		    									<td><%=rs.getString("insurancedate") %></td>
		    							<% 	}  %>
		    								<td><%=rs.getString("lastservicedate") %></td>
		    								<%  if(diffInDaysService<=15)
		         	        				{  %>
		    									<td style="color:red;"><%=rs.getString("serviceduedate") %></td>
		    								<% }
		    								else
		    								{  %>
		    									<td><%=rs.getString("serviceduedate") %></td>
		    							<% 	}  %>	
					
				</tr>
				<%  
		            	   }
				
				
		               }
		             } 
		             catch (SQLException e) {       
		                      e.printStackTrace();
		               }
		               finally {
		                      Util1.closeAll(rs, pstmt, con);
		               }
				%>
		</table>
		<br>
		<p style = "color:white"><center><h1>Fig: Search on the basis of Branch</h1></center></p>
		
</body>
</html>
