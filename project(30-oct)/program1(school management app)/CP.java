package StudentManagementApp;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	 static Connection con; // declared global connection
	
public static Connection createC() {
	//load the driver 
	try {
		//create the connection
		  String url = "jdbc:mysql://localhost:3306/student_manage";
		 String user = "root";
		 	String pass = "root";
		con=DriverManager.getConnection(url,user,pass);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con; // return connection
}
}
