<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
System.out.println("inside search jsp");
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<script src="search.js" type="text/javascript"></script>

</head>
<body>
	<h1>Search Vehicle Details</h1>
			
				<h3>Search by Branch</h3>
				<select id="sbranch">
					<option value=""></option>
					<option value="A11">A11</option>
					<option value="A12">A12</option>
					<option value="A13">A13</option>
					<option value="A14">A14</option>
					<option value="A15">A15</option>
					
				</select>
				<form action="SearchBranchData.jsp" onsubmit="return searchbranch()">
					<input type="submit" value="search">
					<input type="text" id="branch" name="branch" value="">	
				</form>
				
				<h1>...OR....</h1>
				
				<h3>Search by Vehicle type</h3>
				<select id="svehicle">	
					<option value=""></option>
					<option value="two wheeler">Two wheeler</option>
					<option value="four wheeler">Four wheeler</option>
				</select>
				<form action="SearchVehicleTypeData.jsp" onsubmit="return searchvehicletype()">
					<input type="submit" value="search">
					<input type="text" id="vehicletype" name="vehicletype" value="">	
				</form>
				
				<h1>...OR....</h1>
				
				<h3>Search by Insurance Expiry Month</h3>
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
				<form action="SearchInsuranceDate.jsp" onsubmit="return searchInsuranceDate()">
					<input type="submit" value="search">
					<input type="text" id="insurancedate" name="insurancedate" value="">	
				</form>
				
				<h1>...OR....</h1>
				
				
				<h3>Search by Service Due Month</h3>
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
				<form action="SearchServiceDate.jsp" onsubmit="return searchServiceDate()">
					<input type="submit" value="search">
					<input type="text" id="servicedate" name="servicedate" value="">	
				</form>
				
				
				
						

</body>
</html>

