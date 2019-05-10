/*
function empidonfocus()
{
    var id=document.getElementById("empid").value;
    var regx=/^[0-9]{1,6}$/;
    if(regx.test(id))
    {
        (document.getElementById("lempid")).innerHTML="Valid emp_id";
        (document.getElementById("lempid")).style.color="blue";
    }
    else{
        (document.getElementById("lempid")).innerHTML="InValid emp_id";
        (document.getElementById("lempid")).style.color="orange";  
    }
}
*/
var count=0;

function empidonblur()
{
    var name=document.getElementById("empid").value;
    var regx=/^[0-9a-zA-Z]{1,6}$/;
    var lemp_id=document.getElementById("lempid");
    
    if(regx.test(name))
    {
        lemp_id.innerHTML="Valid Data";
        lemp_id.style.visibility="visible";
        lemp_id.style.color="green";
        count+=1;
    }
    else 
    {
        lemp_id.innerHTML="Invalid Data";
        lemp_id.style.visibility="visible";
        lemp_id.style.color="red";
    }
}

function fnameonblur()
{
    var fname=document.getElementById("fname").value;
    var lfname=document.getElementById("lfname");
    var regx1=/^[a-zA-Z]{1,50}$/;
        if(regx1.test(fname))
        {
            lfname.innerHTML="Valid Data";
            lfname.style.visibility="visible";
            lfname.style.color="green";
            count+=1;    
        }
        else
        {
            lfname.innerHTML="Invalid Data";
            lfname.style.visibility="visible";
            lfname.style.color="red";
        }
}

function lnameonblur()
{
    var lname=document.getElementById("lname").value;
    var llname=document.getElementById("llname");
    var regx2=/^[a-zA-Z]{1,50}$/;
        if(regx2.test(lname))
        {
            llname.innerHTML="Valid Data";
            llname.style.visibility="visible";
            llname.style.color="green";
            count+=1;     
        }
        else
        {
            llname.innerHTML="Invalid Data";
            llname.style.visibility="visible";
            llname.style.color="red";    
        }
}

function ageonblur()
{
    var age=document.getElementById("age").value;
    var lage=document.getElementById("lage");
    var regx3=/^[0-9]{2}$/;
        if(regx3.test(age))
        {
            lage.innerHTML="Valid Data";
            lage.style.visibility="visible";
            lage.style.color="green";
            count+=1;                 
        }
        else
        {
            lage.innerHTML="Invalid Data";
            lage.style.visibility="visible";
            lage.style.color="red";    
        }
}


function numberonblur()
{
    var number=document.getElementById("number").value;
    var lnumber=document.getElementById("lnumber");
    var regx4 = /^[0-9]{10}$/;
    //var regx=/abc/;
        if(regx4.test(number))
        {
            lnumber.innerHTML="Valid Data";
            lnumber.style.visibility="visible";
            lnumber.style.color="green";
            count+=1;                 
        }
        else
        {
            lnumber.innerHTML="Invalid Data";
            lnumber.style.visibility="visible";
            lnumber.style.color="red";    
        }
}

function emailonblur()
{
    var email=document.getElementById("email").value;
    var lemail=document.getElementById("lemail");
    var regx5=/^([a-zA-Z0-9\.-]+)@([a-zA-Z0-9]+).([a-z]{2,20})$/ ;
    if(regx5.test(email))
    {
        lemail.innerHTML="Valid Data";
        lemail.style.visibility="visible";
        lemail.style.color="green";
        count+=1;    
    }
    else
    {
        lemail.innerHTML="Invalid Data";
        lemail.style.visibility="visible";
        lemail.style.color="red";    
    }
}

function passwordonblur()
{
    var password=document.getElementById("password").value;
    var lpassword=document.getElementById("lpassword");
    var regx6=/^[0-9a-zA-Z]{1,15}$/;
    if(regx6.test(password))
    {
        lpassword.innerHTML="Valid Data";
        lpassword.style.visibility="visible";
        lpassword.style.color="green";
        count+=1;    
    }
    else
    {
        lpassword.innerHTML="Invalid Data";
        lpassword.style.visibility="visible";
        lpassword.style.border="2px solid red";    
    }
}


function userbranch()
{
	
	/*var s=document.getElementById("userbranch");
	var b=s.options[s.selectedIndex].text;
	
	document.getElementById("branch").value=b;		
	*/
	
	 var selectBox = document.getElementById("userb");
	    var selectedValue = selectBox.options[selectBox.selectedIndex].value;
	    alert(selectedValue);
	    document.getElementById("branch").value=selectedValue;
	    count+=1;
	/*alert('inside');
	 document.getElementById("userbranch").value = document.getElementById("branch").value;*/
}


/*function branchonblur()
{
    var branch=document.getElementById("branch").value;
    var lbranch=document.getElementById("lbranch");
    var regx7=/^[a-zA-z0-9]{1,5}$/;
    if(regx7.test(branch))
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
*/

function Validate()
{
    /*
    var count=0;
    var emp_id=document.getElementById("empid").value;
    var lemp_id=document.getElementById("lempid");
    var regx=/^[0-9A-Za-z]{1,6}$/;
        if(regx.test(emp_id))
        {
            lemp_id.innerHTML="Valid";
            lemp_id.style.visibility="visible";
            lemp_id.style.color="green";
            count++;
        }
        else
        {
            lemp_id.innerHTML="Invalid";
            lemp_id.style.visibility="visible";
            lemp_id.style.color="red";
        }

    var fname=document.getElementById("fname").value;
    var lfname=document.getElementById("lfname");
    var regx1=/^[a-zA-Z]{1,50}$/;
        if(regx1.test(fname))
        {
            lfname.innerHTML="Valid";
            lfname.style.visibility="visible";
            lfname.style.color="green";
            count++;    
        }
        else
        {
            lfname.innerHTML="Invalid";
            lfname.style.visibility="visible";
            lfname.style.color="red";
        }

    var lname=document.getElementById("lname").value;
    var llname=document.getElementById("llname");
    var regx2=/^[a-zA-Z]{1,50}$/;
        if(regx2.test(lname))
        {
            llname.innerHTML="Valid";
            llname.style.visibility="visible";
            llname.style.color="green";
            count++;     
        }
        else
        {
            llname.innerHTML="Invalid";
            llname.style.visibility="visible";
            llname.style.color="red";    
        }

    var age=document.getElementById("age").value;
    var lage=document.getElementById("lage");
    var regx3=/^[0-9]{2}$/;
        if(regx3.test(age))
        {
            lage.innerHTML="Valid";
            lage.style.visibility="visible";
            lage.style.color="green";
            count++;                 
        }
        else
        {
            llname.innerHTML="Invalid";
            llname.style.visibility="visible";
            llname.style.color="red";    
        }
*/
    var male=document.getElementById("male");
    var female=document.getElementById("female");
        if(male.checked==true || female.checked==true)
        {
            count+=1;         
        }
/*
    var number=document.getElementById("number").value;
    var lnumber=document.getElementById("lnumber");
    var regx4 = /^[0-9]{10}$/;
    //var regx=/abc/;
        if(regx4.test(number))
        {
            lnumber.innerHTML="Valid";
            lnumber.style.visibility="visible";
            lnumber.style.color="green";
            count++;                 
        }
        else
        {
            lnumber.innerHTML="Invalid";
            lnumber.style.visibility="visible";
            lnumber.style.color="red";    
        }

    var email=document.getElementById("email").value;
    var lemail=document.getElementById("lemail");
    var regx5=/^([a-zA-Z0-9\.-]+)@([a-zA-Z0-9]+).([a-z]{2,20})$/ ;
    if(regx5.test(email))
    {
        lemail.innerHTML="Valid";
        lemail.style.visibility="visible";
        lemail.style.color="green";
        count++;    
    }
    else
    {
        lemail.innerHTML="Invalid";
        lemail.style.visibility="visible";
        lemail.style.color="red";    
    }

    var password=document.getElementById("password").value;
    var lpassword=document.getElementById("lpassword");
    var regx6=/^[0-9a-zA-Z]{1,15}$/;
    if(regx.test(password))
    {
        lpassword.innerHTML="Valid";
        lpassword.style.visibility="visible";
        lpassword.style.color="green";
        count++;    
    }
    else
    {
        lpassword.innerHTML="Invalid";
        lpassword.style.visibility="visible";
        lpassword.style.color="red";    
    }

    var branch=document.getElementById("branch").value;
    var lbranch=document.getElementById("lbranch");
    var regx7=/^[a-zA-z0-9]{1,5}$/;
    if(regx7.test(branch))
    {
        lbranch.innerHTML="Valid";
        lbranch.style.visibility="visible";
        lbranch.style.color="green";
        count++;    
    }
    else
    {
        lbranch.innerHTML="Invalid";
        lbranch.style.visibility="visible";
        lbranch.style.color="red";   
    }
*/
    if(count==9)
    {
        alert("Data submitted successfully");
        return true;
    }
    else{
        return false;
    }
}
