package VehicleR;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Vehicleinfo
 */
@WebServlet("/Vehicleinfo")
public class Vehicleinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Vehicleinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("inside do post");
		Connection con=null;
		Statement stmt=null;
		String vehicleno=request.getParameter("vehicleno");
		System.out.println(vehicleno);
		String branch=request.getParameter("branch");
		System.out.println(branch);
		String vehicletype=request.getParameter("vehicletype");
		System.out.println(vehicletype);
		
		String insurancedate=request.getParameter("insuranceexpirydate");
		System.out.println(insurancedate);
		
		String lastservicedate=request.getParameter("lastservicedate");
		System.out.println(lastservicedate);
		
		String serviceduedate=request.getParameter("serviceduedate");
		System.out.println(serviceduedate);
		
	    
		PrintWriter out = response.getWriter();
		
		try {
			System.out.println("inside try");
			con=Util1.getConnection();
			stmt=con.createStatement();
			System.out.println("connection established");
			String s1="insert into vehicleinfo1 values('"+vehicleno+"','"+branch+"','"+vehicletype+"','"+insurancedate+"','"+lastservicedate+"','"+serviceduedate+"')";
			System.out.println("stmt executed");
			//String s1="insert into vehicleinfo (vehicleno) values('"+vehicleno+"')";
			stmt.executeUpdate(s1);
			System.out.println("done");
			System.out.println("data submitted");
			out.write("<html><script type=\"text/javascript\">");
	         out.write("alert('Successfully Registered');");
	         out.write("</script></html>");
			 RequestDispatcher rd=request.getRequestDispatcher("MainMenuAdmin.jsp");
             rd.include(request, response);
		
			}			
		catch(SQLException e)
		{
			System.out.println("inside catch");
			e.printStackTrace();
		}
		finally
		{
			
			Util1.closeAll(null, stmt, con);
		}
	
	}

}
