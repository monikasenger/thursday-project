package StudentManagementApp;

public class Student {
	//declared variable as private
private int studentID;
private String StudentName;
private String StudentPhone;
private String StudentCity;

//constructor for all fields of the data in the student table
public Student(int studentID, String studentName, String studentPhone, String studentCity) {
	super();
	this.studentID = studentID;
	StudentName = studentName;
	StudentPhone = studentPhone;
	StudentCity = studentCity;
}
//constructor for all fields of the data in the student table except student id
public Student(String studentName, String studentPhone, String studentCity) {
	super();
	StudentName = studentName;
	StudentPhone = studentPhone;
	StudentCity = studentCity;
}
//constructor  for super class
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

//getter for student id
public int getStudentID() {
	return studentID;
}

//setter for student id
public void setStudentID(int studentID) {
	this.studentID = studentID;
}

//getter for student name
public String getStudentName() {
	return StudentName;
}

//setter for student name
public void setStudentName(String studentName) {
	StudentName = studentName;
}

//getter for student phone number
public String getStudentPhone() {
	return StudentPhone;
}

//setter for student phone number
public void setStudentPhone(String studentPhone) {
	StudentPhone = studentPhone;
}

//getter for student city
public String getStudentCity() {
	return StudentCity;
}

//setter for student city
public void setStudentCity(String studentCity) {
	StudentCity = studentCity;
}

//generate to string method for all the fields
@Override
public String toString() {
	return "Student [studentID=" + studentID + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone
			+ ", StudentCity=" + StudentCity + "]";
}

}
