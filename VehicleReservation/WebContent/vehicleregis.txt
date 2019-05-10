var count=0;

function vehiclenoonblur()
{
    var vehicleno=document.getElementById("vehicleno").value;
    var regx=/^[0-9a-zA-Z]{1,9}$/;
    var lvehicleno=document.getElementById("lvehicleno");
    
    if(regx.test(vehicleno))
    {
        document.getElementById('vehicleno').style.border = "";
        document.getElementById('vehicleno').style.fontSize = "14px";
        document.getElementById('vehicleno').style.color = "#000";

        count += 1;
    }
    else 
    {
        document.getElementById('vehicleno').style.border = "2px solid red";
    }
}

function branchonblur()
{
    var branch=document.getElementById("branch").value;
    var lbranch=document.getElementById("lbranch");
    var regx1=/^[a-zA-Z]{1,5}$/;
        if(regx1.test(branch))
        {
            document.getElementById('branch').style.border = "";
            document.getElementById('branch').style.fontSize = "14px";
            document.getElementById('branch').style.color = "#000";

            count+=1;    
        }
        else
        {
            
            document.getElementById('branch').style.border = "";
        }
}

function vehicletypeonblur()
{
    var vehicletype=document.getElementById("vehicletype").value;
    var lvehicletype=document.getElementById("lvehicletype");
    var regx2=/^[a-zA-Z]{1,15}$/;
        if(regx2.test(vehicletype))
        {
            document.getElementById('vehicletype').style.border = "";
            document.getElementById('vehicletype').style.fontSize = "14px";
            document.getElementById('vehicletype').style.color = "#000";

            count+=1;     
        }
        else
        {
            document.getElementById('vehicletype').style.border = "";
        }
}

function insuranceexpirydateonblur()
{
    var insuranceexpirydate=document.getElementById("insuranceexpirydate").value;
    var linsuranceexpirydate=document.getElementById("linsuranceexpirydate");
    var regx3=/^([0-9]{4})-([0-9]{2})-([0-9]{2})$/;
        if(regx3.test(insuranceexpirydate))
        {
            document.getElementById('insuranceexpirydate').style.border = "";
            document.getElementById('insuranceexpirydate').style.fontSize = "14px";
            document.getElementById('insuranceexpirydate').style.color = "#000";

            count+=1;                 
        }
        else
        {
            document.getElementById('insuranceexpirydate').style.border = "2px solid red";
        }
}


function lastservicedateonblur()
{
    var lastservicedate=document.getElementById("lastservicedate").value;
    var llastservicedate=document.getElementById("llastservicedate");
    var regx4 =/^([0-9]{4})-([0-9]{2})-([0-9]{2})$/;
    //var regx=/abc/;
        if(regx4.test(lastservicedate))
        {
            document.getElementById('lastservicedate').style.border = "";
            document.getElementById('lastservicedate').style.fontSize = "14px";
            document.getElementById('lastservicedate').style.color = "#000";

            count+=1;                 
        }
        else
        {
            document.getElementById('lastservicedate').style.border = "2px solid red";
        }
}
function userbranch()
{
	 var selectBox = document.getElementById("userb");
	    var selectedValue = selectBox.options[selectBox.selectedIndex].value;
	    document.getElementById("branch").value=selectedValue;
	    count+=1;
}

function userVehicle()
{	
	 var selectBox = document.getElementById("userv");
	    var selectedValue = selectBox.options[selectBox.selectedIndex].value;
	   
	    document.getElementById("vehicletype").value=selectedValue;
	    count+=1;
}


function serviceduedateonblur()
{
    var serviceduedate=document.getElementById("serviceduedate").value;
    var lserviceduedate=document.getElementById("lserviceduedate");
    var regx5=/^([0-9]{4})-([0-9]{2})-([0-9]{2})$/;
    if(regx5.test(serviceduedate))
    {
        document.getElementById('serviceduedate').style.border = "";
        document.getElementById('serviceduedate').style.fontSize = "14px";
        document.getElementById('serviceduedate').style.color = "#000";

        count+=1;    
    }
    else
    {
        document.getElementById('serviceduedate').style.border = "2px solid red";
    }
}

function Validate()
{
    if(count==6)
    {
        return true;
    }
    else{
        alert("Please update the highlighted mandatory field(s).");
    }
}

