/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-05-07 09:44:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import VehicleR.*;
import java.util.*;
import java.text.*;

public final class SearchServiceDate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("       \r\n");
      out.write("<link rel=\"icon\" href=\"Capture5.PNG\" type=\"image/gif\" sizes=\"70x70\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"Stylesheet\" href=\"tablebranch.css\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Service Search Details</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("      \r\n");
      out.write("<!-- Navbar (sit on top) -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"w3-top\">\r\n");
      out.write(" \r\n");
      out.write(" <div class=\"w3-bar w3-white w3-card\" id=\"myNavbar\">\r\n");
      out.write("    \r\n");
      out.write("<a href=\"h1.html\" class=\"w3-bar-item w3-button w3-wide\">\r\n");
      out.write("        \r\n");
      out.write("<div class=\"logo-image\">\r\n");
      out.write("            \r\n");
      out.write("<img src=\"Capture1.PNG\" >\r\n");
      out.write("      \r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("</a>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<div class=\"w3-right w3-hide-small\">\r\n");
      out.write("      \r\n");
      out.write("<a href=\"h1.html\" class=\"w3-bar-item w3-button\">HOME</a>\r\n");
      out.write("      \r\n");
      out.write("<a href=\"aboutus.html\" class=\"w3-bar-item w3-button\">ABOUT US</a>\r\n");
      out.write("     \r\n");
      out.write("<a href=\"contactus.html\" class=\"w3-bar-item w3-button\">CONTACT US</a>\r\n");
      out.write("\r\n");
      out.write("<form action=\"logout.jsp\" class=\"w3-bar-item w3-button\">\r\n");
      out.write("<button type=\"Logout\" name=\"Logout\">Logout</button>\r\n");
      out.write("      </form>\r\n");
      out.write("      \r\n");
      out.write("<!--<a href=\"#contact\" class=\"w3-bar-item w3-button\">\r\n");
      out.write("<i class=\"fa fa-envelope\"></i> CONTACT</a>-->\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");

Connection con=null;
PreparedStatement pstmt=null;
ResultSet rs=null;
String indate=(String)request.getParameter("servicedate");
String y =""+Calendar.getInstance().get(Calendar.YEAR);
String role = (String)session.getAttribute("role");

      out.write("<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\t\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th><b>Vehicle No</b></th>\r\n");
      out.write("\t\t\t\t<th><b>Branch</b></th>\r\n");
      out.write("\t\t\t\t<th><b>Vehicle Type</b></th>\r\n");
      out.write("\t\t\t\t<th><b>Insurance Date</b></th>\r\n");
      out.write("\t\t\t\t<th><b>Last Service Date</b></th>\r\n");
      out.write("\t\t\t\t<th><b>Service Due Date</b></th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

				try {
		               con=Util1.getConnection();
		               System.out.println("before stmt");
		               System.out.println(indate);
		               System.out.println(y);
		               
		               pstmt=con.prepareStatement("select * from vehicleinfo1");
		               System.out.println("after stmt");
		               rs=pstmt.executeQuery();
		               System.out.println("Inside try search page");
		               while(rs.next())
		               {
		            	    String d = rs.getString("serviceduedate");
		            	    String servicedate = rs.getString("insurancedate");
		            	    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		           			Date date = format.parse(d);
		           			Date dateservice = format.parse(servicedate);
		           		 	System.out.println(date);
		           		// below code is for difference in days..//
		           		 	Date datetoday = Calendar.getInstance().getTime();
		         	        int diffInDays = (int) ((datetoday.getTime() - date.getTime()) / (1000 * 60 * 60 * 24));
		         	        int diffInDaysService = (int) ((datetoday.getTime() - dateservice.getTime()) / (1000 * 60 * 60 * 24)); 	
		         	        System.out.println(diffInDays);
		           		//top code is for difference in days...//	
		           			Calendar calendar = Calendar.getInstance();
		           			calendar.setTime(date);
		           			System.out.println("date");
		           			String month = ""+calendar.get(Calendar.MONTH);
		           			String year =""+calendar.get(Calendar.YEAR);
		           			if(month.equals(indate) && year.equals(y))
		           			{
		           				if(role.equals("admin")) 
		           				{
		           				
      out.write("\r\n");
      out.write("\t\t           \t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t<td><a href=\"UpdateAgain.jsp\">");
      out.print(rs.getString("vehicleno") );
      out.write("</a></td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString("branch") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString("vehicletype") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t");
  if(diffInDaysService<=15)
		         	        				{  
      out.write("\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t\t<td style=\"color:red;\">");
      out.print(rs.getString("insurancedate") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t");
 }
		    								else
		    								{  
      out.write("\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString("insurancedate") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t");
 	}  
      out.write("\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString("lastservicedate") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t");
  if(diffInDays<=15)
		         	        				{  
      out.write("\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t\t<td style=\"color:red;\">");
      out.print(rs.getString("serviceduedate") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t");
 }
		    								else
		    								{  
      out.write("\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString("serviceduedate") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t");
 	}  
      out.write("\t\t\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t    \t\t\t\t\t");
 
		           				}
		           				else
		           				{ 
		           				
      out.write("\r\n");
      out.write("\t\t           \t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString("vehicleno") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString("branch") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString("vehicletype") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t");
  if(diffInDaysService<=15)
		         	        				{  
      out.write("\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t\t<td style=\"color:red;\">");
      out.print(rs.getString("insurancedate") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t");
 }
		    								else
		    								{  
      out.write("\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString("insurancedate") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t");
 	}  
      out.write("\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString("lastservicedate") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t");
  if(diffInDays<=15)
		         	        				{  
      out.write("\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t\t<td style=\"color:red;\">");
      out.print(rs.getString("serviceduedate") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t");
 }
		    								else
		    								{  
      out.write("\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t\t\t<td>");
      out.print(rs.getString("serviceduedate") );
      out.write("</td>\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t");
 	}  
      out.write("\t\t\r\n");
      out.write("\t\t    \t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t           \t\t\t\t");
  
		           				}
		            	   }
		             }
				}
		             catch (SQLException e) {       
		                      e.printStackTrace();
		               }
		               finally {
		                      Util1.closeAll(rs, pstmt, con);
		               }
				
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<p style = \"color:white\"><center><h1>Fig: Search on the basis of date</h1></center></p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
