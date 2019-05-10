package VehicleR;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Updatevehicle
 */
@WebServlet("/Updatevehicle")
public class Updatevehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updatevehicle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		System.out.println("inside do update post");
		
		String vehiclenocheck=request.getParameter("vehicleno");
		
		System.out.println(vehiclenocheck);
		
		Connection con=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
		
		PrintWriter out = response.getWriter();
		String s1=null;
		
		try {
		
			con=Util1.getConnection();
			stmt=con.createStatement();
			String s="select vehicleno from vehicleinfo1 where vehicleno='"+vehiclenocheck+"'";
			System.out.println("Query execution");
			ResultSet rs=stmt.executeQuery(s);
			if(rs.next())
				s1=rs.getString(1);	
			System.out.println(s1);
			if(vehiclenocheck.equals(s1))
			{
				 request.setAttribute("vehicleno",vehiclenocheck);
				 RequestDispatcher rd=request.getRequestDispatcher("UpdateVehicleInfo.jsp");
                 rd.forward(request, response);
			}
			else
			{
				System.out.println("inside else wrong update vehicle no");
				 out.write("<html><script type=\"text/javascript\">");
		         out.write("alert('Wrong Vehicle Number');");
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
			
			Util1.closeAll(null, stmt, con);
		}
         
	}

}


