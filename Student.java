package project2;

//Random class from the java utility package is imported. 
import java.util.Random;
import java.util.Scanner;


//Student Class. 
public class Student implements StudentInterface
{
	
static Scanner inputDevice = new Scanner(System.in);

//Variables
	int Student_ID;
	String Student_First_Name;
	String Student_Last_Name;
	String Level;
	boolean Status;

//Student Object is created. 
	public  Student(String FN, String LN, String Grade, int id, boolean active){
		
	Student_First_Name = FN;
	Student_Last_Name = LN;
	Level = Grade;
	Student_ID = id;
	Status = active;
	
	}

//Methods

//Method used to obtain student info. 
	public void getStudent() {
	
	Random random = new Random();
	
	System.out.println("Enter First Name: ");
	Student_First_Name = inputDevice.next();

	System.out.println("Enter Last Name: ");
	this.Student_Last_Name = inputDevice.next();

	System.out.println("Enter Grade Year: ");
	this.Level = inputDevice.next();

	this.Student_ID = random.nextInt(100);
	System.out.println(Student_First_Name + " " + Student_Last_Name + " " + "has been added as a " + Level + " " + "with ID " + Student_ID);
	this.Status = true;	
	
	}
	
//Method used to change student status. 
	public void changeStudentStatus() {
	Status = !Status;
	System.out.println(Student_First_Name + " " + Student_Last_Name + " " + "has been deactivated." );
	}

//Method Getters
	public int getID() {
		return Student_ID;
	}
	
	public String getFirst() {
		return Student_First_Name;
	}
	
	public String getLast() {
		return Student_Last_Name;
	}
	
	public String getLevel() {
		return Level;
	}
	public boolean getStatus() {
		return Status;
	}
	
	
//Method used to convert the object array into string. 
public String toString() {
	
	String Activity;
	
	if(Status == true ){
	Activity = "Active";
	}
	else {
	Activity = "Inactive";
	}
	
	return
		  
	 Student_First_Name + " "
     + Student_Last_Name +
     "\r\n" +
     "ID: " + Student_ID +
     "\r\n" +
     "Level: " + Level +
     "\r\n" +
     "Status: " + Activity
      + System.getProperty("line.separator");

	}

}
