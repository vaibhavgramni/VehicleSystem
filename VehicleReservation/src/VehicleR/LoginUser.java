package VehicleR;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VehicleR.Util1;

/**
 * Servlet implementation class LoginUser
 */
@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	   

		Connection con=null;
		HttpSession session=request.getSession();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String empid=request.getParameter("empid");
		String password=request.getParameter("password");
	    
		
        //RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/About.html");
    
      
        try {
        	
        	
        	PrintWriter out = response.getWriter();
        	 System.out.println("before getting connection");
             
        	 
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
        	 
        	 
        	 
               con=Util1.getConnection();
               System.out.println(empid);
               pstmt=con.prepareStatement("select employeeid,password,role from userinfo where employeeid='"+empid+"'");
               System.out.println("after getting connection");
               rs=pstmt.executeQuery();
               System.out.println("inside rs");
               if(rs.next()){
               System.out.println("Inside try of loginuser page");
                     if((rs.getString(1).equals(empid)) && (rs.getString(2).equals(password)) && (rs.getString(3).equals("admin"))) //Validates user input and password
                     {               	
                        /* RequestDispatcher rd=request.getRequestDispatcher("products.html");
                            rd.include(request, response);*/
                       System.out.println("data match");
                       pstmt=con.prepareStatement("select firstname , lastname , role from userinfo where employeeid='"+empid+"'");
                       rs=pstmt.executeQuery();
                       rs.next();
                       String role=rs.getString(3);
                       String name=rs.getString(1)+" "+rs.getString(2);
                   	   session.setAttribute("name",name);
                   	   session.setAttribute("role",role);
                   	   request.getSession().setAttribute("Id",empid);
                   	   RequestDispatcher rd=request.getRequestDispatcher("MainMenuAdmin.jsp");
                       rd.include(request, response);
                     }
                     else if((rs.getString(1).equals(empid)) && (rs.getString(2).equals(password)) && (rs.getString(3).equals("user")))
                     {
                    	 System.out.println("data match");
                         pstmt=con.prepareStatement("select firstname , lastname , role from userinfo where employeeid='"+empid+"'");
                         rs=pstmt.executeQuery();
                         rs.next();
                         String role=rs.getString(3);
                         String name=rs.getString(1)+" "+rs.getString(2);
                    	 session.setAttribute("name",name);
                    	 session.setAttribute("role",role);
                      	 RequestDispatcher rd=request.getRequestDispatcher("MainMenuUser.jsp");
                      	 request.getSession().setAttribute("Id",empid);
                         rd.include(request, response);
                     }
                     else
                     {
                    	 out.write("<html><script type=\"text/javascript\">");
        		         out.write("alert('Either Employee Id or Password is incorrect');");
        		         out.write("</script></html>");
        		         RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
                         rd.include(request, response);
                     }
               }
               else
               {
            	   
                   RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
                   rd.include(request, response);
               }
              
               
        } 
        catch (SQLException e) {
               
               e.printStackTrace();
        }
        finally {
               Util1.closeAll(rs, pstmt, con);
        }
	}
}
