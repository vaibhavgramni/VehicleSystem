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

/**
 * Servlet implementation class UpdateformServlet
 */
@WebServlet("/UpdateformServlet2")
public class UpdateformServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateformServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
System.out.println("inside do updateServlet post");
		
PreparedStatement pstmt=null;
ResultSet rs=null;
		
		Connection con=null;
		
		
		//PrintWriter out = response.getWriter();
		String s1=null;
		
		try {

			PrintWriter out = response.getWriter();
			boolean found = false;
			con=Util1.getConnection();
			String vehicleno=(String)request.getParameter("vehicleno");
			//String vehicleno=(String)request.getSession().getAttribute("vehicleno");
			 pstmt=con.prepareStatement("select vehicleno from vehicleinfo1");
             System.out.println("after getting connection");
             rs=pstmt.executeQuery();
			System.out.println(vehicleno);
			while(rs.next()) {
			if(vehicleno.equals(rs.getString(1)))
			{
				found=true;
				break;
			}
			
		}
			if(found==true) {
			s1 = "update vehicleinfo1 set branch=?,vehicletype=?,insurancedate=?,lastservicedate=?,serviceduedate=? where vehicleno='"+vehicleno+"'";
			//s1 = "update vehicleinfo1 set branch=? where vehicleno='"+vehicleno+"'";
            //  	String vehicleno=request.getParameter("vehicleno");
			String branch=request.getParameter("branch");
			//System.out.println("branch="+branch);
			String vehicletype=request.getParameter("vehicletype");
			String insurancedate=request.getParameter("insuranceexpirydate");
			String lastservicedate=request.getParameter("lastservicedate");
			String serviceduedate=request.getParameter("serviceduedate");
			
			pstmt = con.prepareStatement(s1);
           
            System.out.println(s1);
            pstmt.setString(1, branch);
            pstmt.setString(2, vehicletype);
            pstmt.setString(3, insurancedate);
            pstmt.setString(4, lastservicedate);
            pstmt.setString(5, serviceduedate);
            System.out.println(s1);
			System.out.println(pstmt.executeUpdate());
			System.out.println("data updated");
			 out.write("<html><script type=\"text/javascript\">");
	         out.write("alert('Updation Successful');");
	         out.write("</script></html>");
			RequestDispatcher rd=request.getRequestDispatcher("MainMenuAdmin.jsp");
            rd.include(request, response);  
			}
			else
			{
				 out.write("<html><script type=\"text/javascript\">");
		         out.write("alert('Entered Vehicle No. is Incorrect');");
		         out.write("</script></html>");  	
				RequestDispatcher rd=request.getRequestDispatcher("MainMenuAdmin.jsp");
	            rd.include(request, response);  	
			}
		}
		catch(SQLException e)
		{
			System.out.println("inside catch");
			e.printStackTrace();
		}
		finally
		{
			
			Util1.closeAll(null, pstmt, con);
		}
         
	}
}


