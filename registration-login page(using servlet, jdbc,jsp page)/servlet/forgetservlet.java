package registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class forgetservlet
 */
@WebServlet("/forgetservlet")
public class forgetservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uemail=request.getParameter("email");
		String upwd=request.getParameter("password");
		RequestDispatcher rd=null;
		Connection 	con=null;
		HttpSession s=request.getSession();
		try {
			//jdbc code........
			 String url = "jdbc:mysql://localhost:3306/java";
	 		 String user1 = "root";
	 		 	String pass1 = "root";
			 	con=DriverManager.getConnection(url,user1,pass1);//connection.....
	String sql = "update users set upwd=? where uemail=?";//sql query.....
	 		 	
	 		 	PreparedStatement ps = con.prepareStatement(sql);
	 		 	ps.setString(1,upwd);
	 			ps.setString(2, uemail);
	 		ps.executeUpdate();
      //request to open forget jsp file
		rd=request.getRequestDispatcher("forget.jsp");
		rd.forward(request, response);
	
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}
}
