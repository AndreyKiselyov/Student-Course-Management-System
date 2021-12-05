package project2;

//Student Employee Class is a subclass of Student Class
public class Student_Employee extends Student {

	String job;
	String type;
	
	public Student_Employee(String FN, String LN, String Grade, int id, boolean active, String job, String type) {
		
	super(FN, LN, Grade, id, active);
	
	}
	

//Student Employee Methods 
	public void getStudentJob() {
	
	System.out.println("Enter Job: ");
	job = inputDevice.next();
	System.out.println("Enter Job Type: ");
	type = inputDevice.next();
	
	System.out.println(" " + Student_First_Name + " " + Student_Last_Name + " " + Student_ID + " " + job + " " + type);
	
	}
	
	
	
	public String toString() {
		
		return
			  
		 Student_First_Name + " "
	     + Student_Last_Name +
	     "\r\n" +
	     "ID: " + Student_ID +
	     "\r\n" +
	     "Job:  " + job +
	     "\r\n" +
	     "Employement type: " + type
	      + System.getProperty("line.separator");

		}
	
	
}
