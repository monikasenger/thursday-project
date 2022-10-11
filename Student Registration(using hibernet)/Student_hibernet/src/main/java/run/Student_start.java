package run;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import student_dao.StudentDao;
import student_dao.StudentDaoImpl;




public class Student_start extends StudentDaoImpl
{
	//globally declared
	static int ch,choice;
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	
	/******************************************************/
	//main method
    public static void main( String[] args )
    {
        while(true) {
        	try {
                System.out.println("=============REGISTRATIONS FORM==============");
                System.out.println("1. Create a new student ");
                System.out.println("2. See a student detail");
                System.out.println("3. See all the students details");
                System.out.println("4. Update a student information");
                System.out.println("5. Delete a student");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                 choice = Integer.valueOf(input.readLine());

                switch(choice) {
        	        case 1://insert data
        	        {
        	        	StudentDao.insertdata();
        	        	break;
        	        }
        	        case 2:
        	        {//search data
        	        StudentDao.searchdata();
        	        	break;
        	        }
        	        case 3:
        	        	//show all
        	        {
        	        	 StudentDao.showall();
        	        	break;
        	        }
        	        case 4:
        	        {
        	        	//update
        	        	 StudentDao.update();
        	               }
        	       break; 
        	        case 5:
        	        {
        	        	//delete 
        	        	 StudentDao.delete();
        	        	break;
        	        }
        	        case 6://exit
        	        	System.exit(0);
                }
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
        }
    }
}
