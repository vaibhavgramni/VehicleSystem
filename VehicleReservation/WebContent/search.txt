function searchbranch()
{
	
	var s=document.getElementById("sbranch");
	var b=s.options[s.selectedIndex].value;
	
	document.getElementById("branch").value=b;
		
}

function searchvehicletype()
{
	
	var s=document.getElementById("svehicle");
	var vt=s.options[s.selectedIndex].value;

	document.getElementById("vehicletype").value=vt;	 
}

function searchInsuranceDate()
{
	
	var s=document.getElementById("Ivehicle");
	var vt=s.options[s.selectedIndex].value;

	document.getElementById("insurancedate").value=vt;	
}

function searchServiceDate()
{
	
	var s=document.getElementById("Servehicle");
	var vt=s.options[s.selectedIndex].value;

	document.getElementById("servicedate").value=vt;	
}