/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-05-07 09:43:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SearchPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("        <link rel=\"icon\" href=\"Capture5.PNG\" type=\"image/gif\" sizes=\"70x70\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("         <link rel='stylesheet'  href=\"style1.css\">\r\n");
      out.write("         <script src=\"search.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <title>Search Vehicle Details</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>   \r\n");
      out.write("\r\n");
      out.write("\t\t");

	String name=(String)session.getAttribute("name");

      out.write("\r\n");
      out.write("\r\n");
      out.write("       <script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction checkVehicleNo()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar no=prompt(\"Please enter Vehicle No:\", \"Proper format\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"vehicleno\").value=no;\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("    </head>\r\n");
      out.write("            <body>\r\n");
      out.write("                               \r\n");
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
      out.write("<img src=\"Capture1.PNG\">\r\n");
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
      out.write("      \r\n");
      out.write("<!-- <form action=\"#\" class=\"w3-bar-item w3-button\">\r\n");
      out.write("<input type=\"submit\" href=\"#contact us\" value=\"Logout\" style=\"color:darkcyan;\"></input>\r\n");
      out.write("      </form> -->\r\n");
      out.write("      <form action=\"logout.jsp\" class=\"w3-bar-item w3-button\">\r\n");
      out.write("<button type=\"Logout\" name=\"Logout\">Logout</button>\r\n");
      out.write("      </form>\r\n");
      out.write("      \r\n");
      out.write("<!--<a href=\"#contact\" class=\"w3-bar-item w3-button\">\r\n");
      out.write("<i class=\"fa fa-envelope\"></i> CONTACT</a>-->\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("                <!--<header>\r\n");
      out.write("                   \r\n");
      out.write("                    <ul id=\"left-nav\">\r\n");
      out.write("                        <li>Vehicle Resevation</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul id=\"right-nav\">\r\n");
      out.write("                        <li><a href=\"\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"\">About Us</a></li>\r\n");
      out.write("                        <li><a href=\"\">Contact Us</a></li>\r\n");
      out.write("                        <li><a href=\"\">Logout</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </header>--> <br>\r\n");
      out.write("<br><br>\r\n");
      out.write("<h4 align=\"right\">Hi ");
      out.print(name);
      out.write(", you are logged in. </h4>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <h1>Search Vehicle Details</h1>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <h3><div class=\"first\">Search by Branch</h3></div>\r\n");
      out.write("\t\t\t\t<select id=\"sbranch\">\r\n");
      out.write("\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t<option value=\"A11\">A11</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"A12\">A12</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"A13\">A13</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"A14\">A14</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"A15\">A15</option>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"search-box1\">\r\n");
      out.write("                 \r\n");
      out.write("                        \r\n");
      out.write("                        <form action=\"SearchBranchData.jsp\" onsubmit=\"return searchbranch()\"  class=\"search-txt1\">\r\n");
      out.write("                        <button class=\"button1\" type=\"submit\"  >Search</button>\r\n");
      out.write("                        <input type=\"hidden\" id=\"branch\" name=\"branch\" value=\"\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <a class=\"search-btn1\">                       \r\n");
      out.write("                            <i class=\"fas fa-search\"></i></a>\r\n");
      out.write("                        \r\n");
      out.write("                     \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <h3><div class=\"second\">Search by Vehicle Type</h3></div>\r\n");
      out.write("\t\t\t\t<select id=\"svehicle\">\t\r\n");
      out.write("\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t<option value=\"two wheeler\">Two wheeler</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"four wheeler\">Four wheeler</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("                <div class=\"search-box2\">\r\n");
      out.write("                 \r\n");
      out.write("                        \r\n");
      out.write("                         <form action=\"SearchVehicleTypeData.jsp\" onsubmit=\"return searchvehicletype()\" class=\"search-txt2\">   \r\n");
      out.write("                        <button class=\"button2\" type=\"submit\"  >Search</button>\r\n");
      out.write("                        <input type=\"hidden\" id=\"vehicletype\" name=\"vehicletype\" value=\"\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <a class=\"search-btn2\">                       \r\n");
      out.write("                            <i class=\"fas fa-search\"></i></a>\r\n");
      out.write("                        \r\n");
      out.write("                     \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <h3><div class=\"third\">Search by Insurance Expiry Month</h3></div>\r\n");
      out.write("\t\t\t\t<select id=\"Ivehicle\">\t\r\n");
      out.write("\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t<option value=\"0\">January</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">February</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">March</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"3\">April</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"4\">May</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"5\">June</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"6\">July</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"7\">August</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"8\">September</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"9\">October</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"10\">November</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"11\">December</option>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<!--  -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("                <div class=\"search-box3\">\r\n");
      out.write("                 \r\n");
      out.write("                        \r\n");
      out.write("                        <form action=\"SearchInsuranceDate.jsp\" onsubmit=\"return searchInsuranceDate()\" class=\"search-txt3\">  \r\n");
      out.write("                        <button class=\"button3\" type=\"submit\"  >Search</button>\r\n");
      out.write("                        <input type=\"hidden\" id=\"insurancedate\" name=\"insurancedate\" value=\"\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <a class=\"search-btn3\">                       \r\n");
      out.write("                            <i class=\"fas fa-search\"></i></a>\r\n");
      out.write("                        \r\n");
      out.write("                     \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <h3><div class=\"fourth\">Search by Service Due Month</h3></div>\r\n");
      out.write("\t\t\t\t<select id=\"Servehicle\">\t\r\n");
      out.write("\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t<option value=\"0\">January</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">February</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">March</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"3\">April</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"4\">May</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"5\">June</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"6\">July</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"7\">August</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"8\">September</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"9\">October</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"10\">November</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"11\">December</option>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<!--  -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("                 <div class=\"search-box4\">\r\n");
      out.write("                 \r\n");
      out.write("                        \r\n");
      out.write("                        <form action=\"SearchServiceDate.jsp\" onsubmit=\"return searchServiceDate()\" class=\"search-txt4\">    \r\n");
      out.write("                        <button class=\"button4\" type=\"submit\"  >Search</button>\r\n");
      out.write("                        <input type=\"hidden\" id=\"servicedate\" name=\"servicedate\" value=\"\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <a class=\"search-btn4\">                       \r\n");
      out.write("                            <i class=\"fas fa-search\"></i></a>\r\n");
      out.write("                        \r\n");
      out.write("                     \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
