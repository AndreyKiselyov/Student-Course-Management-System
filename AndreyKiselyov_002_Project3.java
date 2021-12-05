// Andrey Kiselyov: Professor Khan

/* The purpose of this program is to serve as a student and course management system  */

package project2;


//Java packages are imported
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class



//Driver class. 
public class AndreyKiselyov_002_Project3 {

	//Scanner class is used to accept user input. 
	static Scanner inputDevice = new Scanner(System.in);
	
	//Main method
	public static void main(String[] args) throws Exception {
		
	
	//Variables
	int  Mainmenu = 5;
	int menu = 6;
	int menu2 =7;
	int numberOfStudents;
	int counter = 0;	
	
	
	
	//Main Menu
	System.out.println("Welcome to Student and Course Management System!");
	System.out.println("");
	System.out.println("This system will allow you to manage students and courses. Let’s start with the number of students this system will have: ");
	
	//Value of number of students is assigned through user input.
	numberOfStudents = inputDevice.nextInt();
	
	//Object array of students and employees is created. 
	Student[] obj = new Student[numberOfStudents];
	Student_Employee[] emp = new Student_Employee[numberOfStudents];
	
	//While Loop for the main menu 
	while(Mainmenu != 0) {
	System.out.println("***Welcome to Student and Course Management System***");
	System.out.println("");
	System.out.print("Press ‘1’ for Student Management System (SMS)");
	System.out.println("");
	System.out.print("Press ‘2’ for Course Management System (CMS)");
	System.out.println("");
	System.out.print("Press ‘0’ to exit");
	System.out.println("");
	
	Mainmenu = inputDevice.nextInt();
	
	//Switch Statement used for the main menu to move through student and class management systems
	switch(Mainmenu) {
	
	
	case 1:
	
		//While loop that is used for the switch statement.
		while(menu != 0) {
			
			//Student Management System Menu
			System.out.println("***Welcome to Student Management System***");
			System.out.println("Press ‘1’ to add a student");
			System.out.println("Press ‘2’ to deactivate a student");
			System.out.println("Press ‘3’ to display all students");
			System.out.println("Press ‘4’ to search for a student by ID");
			System.out.println("Press ‘5’ to assign on-campus job");
			System.out.println("Press ‘6’ to display all students with on-campus jobs");
			System.out.println("Press ‘0’ to exit the system");
			
		
		menu = inputDevice.nextInt();
			
		//Switch statement used for the menu. 
		switch(menu) {
			
		//Adding a student to the management system.
		case 1: 
				
		if(counter <= numberOfStudents-1) 
			
			{
			obj[counter] = new Student("string", "null", "null", 4, true);
			obj[counter].getStudent();
			counter++;
			}
				
		break;
			
		//Deactivating a student in the management system.
		case 2:
			
		System.out.println("Enter the ID for the Student you want to search for: ");
		int Stu_ID = inputDevice.nextInt();
			
			for( int c=0; c<numberOfStudents; c++) {
			
				if(obj[c].getID() == Stu_ID) {
				obj[c].changeStudentStatus();
				}
			}
			
		break;
			
		//Displaying all students in the system. 
		case 3:
		
		//Arrays.sort method makes it to where the student list is in order alphabetically by first name.
		Arrays.sort(obj, (a, b) -> a.Student_First_Name.compareTo(b.Student_First_Name));
			for(int d=0; d<numberOfStudents; d++) {
			System.out.println(obj[d].toString());
			
			}
			
		break;
			
		
		//Student search.
		case 4: 
			
		System.out.println("Enter the ID for the Student you want to search for: ");
		int ID = inputDevice.nextInt();
			
			for(int b=0; b<numberOfStudents; b++) {
				
				if (obj[b].getID() == ID){
				System.out.println(obj[b].toString());
				
				try {
						
					      FileWriter myWriter = new FileWriter("StudentReport.txt");
					      myWriter.write(obj[b].toString());
					      myWriter.close();
					    } catch (IOException e) {
					      System.out.println("An error occurred.");
					      e.printStackTrace();
					    }
			
				}
				
			}
			
			
		break;
		
		//Assigns student jobs
		case 5:
			
			System.out.println("Enter the ID for the Student you want to search for: ");
			int id = inputDevice.nextInt();
				
				for(int b=0; b<numberOfStudents; b++) {
					
					if (obj[b].getID() == id){
						
					emp[b] = new Student_Employee(obj[b].getFirst(), obj[b].getLast(), obj[b].getLevel(), obj[b].getID(), obj[b].getStatus(), "String", "String");
					emp[b].getStudentJob();
					
				
					}
					
				}
				
		
	
				
		break;
		
		//Displays Students with jobs
		case 6:
		
		Arrays.sort(emp, (a, b) -> a.Student_First_Name.compareTo(b.Student_First_Name));
		for(int d=0; d<numberOfStudents; d++) {
		System.out.println(emp[d].toString());
			
			}	
			
			
	
		
		break;
			
		//Exit SMS
		
		case 0:
		System.out.println("SMS Exited");
		
	
				}
			
			}
	
	break;
	
	
	//Course Management System Menu
	case 2:
		
	//While loop that is used for the switch statement.
			while(menu2 != 0) {
				
				System.out.println("***Welcome to CMS***");
				System.out.println("");
				System.out.println("Press ‘1’ to add a new course");
				System.out.println("Press ‘2’ to assign student a new course");
				System.out.println("Press ‘3’ to display student with assigned courses");
				System.out.println("Press ‘0’ to exit CMS");
				System.out.println("");
				
			
			menu2 = inputDevice.nextInt();
				
			//Switch statement used for the Course Management Menu
			switch(menu2) {
				
			//Adding a Course to the system
			case 1: 
			
				
				try {
					
					Course course = new Course(0, "string");
					course.getCourseInfo();
					course.confirmation();
					
				      FileWriter myWriter = new FileWriter("Courses.txt");
				      myWriter.write(course.toString());
				      myWriter.close();
				      
				      
				   
				      System.out.println("Successfully wrote to the file.");
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
			
			
			break;
			
			
			//Adding a student to a course
			case 2:
			
				System.out.println("Enter the ID for the Student you want to search for: ");
				int id = inputDevice.nextInt();
					
					for(int b=0; b<numberOfStudents; b++) {
						
						if (obj[b].getID() == id){
							
							try {
								
							Course courseAssignment = new Course(0, "string");
							courseAssignment.getCourseInfo();
								
							      FileWriter myWriter = new FileWriter("CourseAssignment.txt");
							      myWriter.write(obj[b].toString());
							      myWriter.write(courseAssignment.toString());
							      myWriter.close();
							      System.out.println(obj[b].getFirst() + " " + obj[b].getLast() + " " + "has been added to assigned course" + " " + courseAssignment.printCourseID());
							    } catch (IOException e) {
							      System.out.println("An error occurred.");
							      e.printStackTrace();
							    }	
					
	
						
					
						}
						
					}
					
					
				
		
			break;
			
			
			//Displaying Courses and Students
			case 3:
			
				try {
				      File myObj = new File("CourseAssignment.txt");
				      Scanner myReader = new Scanner(myObj);
				      while (myReader.hasNextLine()) {
				        String data = myReader.nextLine();
				        System.out.println(data);
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				
			
			
					}
				
				}
	
	
			}
		}
	
	
	
	}
	
}

	

