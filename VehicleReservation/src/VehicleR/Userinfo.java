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

import VehicleR.Util1;

/**
 * Servlet implementation class Userinfo
 */
@WebServlet("/Userinfo")
public class Userinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Userinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("inside do get");
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
		String empid=request.getParameter("empid");
		System.out.println(empid);
		String fname=request.getParameter("fname");
		System.out.println(fname);
		String lname=request.getParameter("lname");
		System.out.println(lname);
		int age=Integer.parseInt(request.getParameter("age"));
		System.out.println(age);
		String gender=request.getParameter("gender");
		System.out.println(gender);
		String mobileNo=request.getParameter("number").trim();
	    long number=Long.parseLong(mobileNo);
	    System.out.println(number);
		String email=request.getParameter("email");
		System.out.println(email);
		String password = request.getParameter("password");
		System.out.println(password);
		String branch = request.getParameter("branch");
		System.out.println(branch);
		String role="user";
	    //System.out.println(branch);
		
		try {
			PrintWriter out = response.getWriter();
			con=Util1.getConnection();
			stmt=con.createStatement();
			String s1="insert into userinfo values('"+empid+"','"+fname+"','"+lname+"',"+age+",'"+gender+"',"+number+",'"+email+"','"+password+"','"+branch+"','"+role+"')";
			stmt.executeUpdate(s1);
			System.out.println("done");
			System.out.println("data submitted");
			out.write("<html><script type=\"text/javascript\">");
	         out.write("alert('Registered Successfully');");
	         out.write("</script></html>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
            rd.include(request, response);
			}			
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			Util1.closeAll(null, stmt, con);
		}
}
}
