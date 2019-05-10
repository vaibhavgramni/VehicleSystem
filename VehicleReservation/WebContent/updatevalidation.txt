var count=0;


function branchonblur()
{
    var branch=document.getElementById("branch").value;
    var lbranch=document.getElementById("lbranch");
    var regx1=/^[a-zA-Z]{1,5}$/;
        if(regx1.test(branch))
        {
            lbranch.innerHTML="Valid Data";
            lbranch.style.visibility="visible";
            lbranch.style.color="green";
            count+=1;    
        }
        else
        {
            lbranch.innerHTML="Invalid Data";
            lbranch.style.visibility="visible";
            lbranch.style.color="red";
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
function vehicletypeonblur()
{
    var vehicletype=document.getElementById("vehicletype").value;
    var lvehicletype=document.getElementById("lvehicletype");
    var regx2=/^[a-zA-Z]{1,15}$/;
        if(regx2.test(vehicletype))
        {
            lvehicletype.innerHTML="Valid Data";
            lvehicletype.visibility="visible";
            lvehicletype.style.color="green";
            count+=1;     
        }
        else
        {
            lvehicletype.innerHTML="Invalid Data";
            lvehicletype.style.visibility="visible";
            lvehicletype.style.color="red";    
        }
}

function insuranceexpirydateonblur()
{
    var insuranceexpirydate=document.getElementById("insuranceexpirydate").value;
    var linsuranceexpirydate=document.getElementById("linsuranceexpirydate");
    var regx3=/^([0-9]{4})-([0-9]{2})-([0-9]{2})$/;
        if(regx3.test(insuranceexpirydate))
        {
            alert("insurance : "+insuranceexpirydate);
            linsuranceexpirydate.innerHTML="Valid Data";
            linsuranceexpirydate.style.visibility="visible";
            linsuranceexpirydate.style.color="green";
            count+=1;                 
        }
        else
        {
            alert("insurance : "+insuranceexpirydate);
            linsuranceexpirydate.innerHTML="Invalid Data";
            linsuranceexpirydate.style.visibility="visible";
            linsuranceexpirydate.style.color="red";    
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
            llastservicedate.innerHTML="Valid Data";
            llastservicedate.style.visibility="visible";
            llastservicedate.style.color="green";
            count+=1;                 
        }
        else
        {
            llastservicedate.innerHTML="Invalid Data";
            llastservicedate.style.visibility="visible";
            llastservicedate.style.color="red";    
        }
}

function serviceduedateonblur()
{
    var serviceduedate=document.getElementById("serviceduedate").value;
    var lserviceduedate=document.getElementById("lserviceduedate");
    var regx5=/^([0-9]{4})-([0-9]{2})-([0-9]{2})$/;
    if(regx5.test(serviceduedate))
    {
        lserviceduedate.innerHTML="Valid Data";
        lserviceduedate.style.visibility="visible";
        lserviceduedate.style.color="green";
        count+=1;    
    }
    else
    {
        lserviceduedate.innerHTML="Invalid Data";
        lserviceduedate.style.visibility="visible";
        lserviceduedate.style.color="red";    
    }
}

function Validate()
{
    if(count==5)
    {
        return true;
    }
    else{
       return false;
    }
}

