
<%

response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader ("Expires", 0); //prevents caching at the proxy server

if (request.getSession().getAttribute("Id") == "-1" ) 
{                               
    response.sendRedirect("Login.jsp");
    return;
}

System.out.println("logout.jsp");

System.out.println("Removing ID");

request.getSession().removeAttribute("Id");

request.getSession(false).invalidate();
request.getSession().setAttribute("Id","-1");

response.sendRedirect("Login.jsp");
 
 
%>
 
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>