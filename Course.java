package project2;

//Course Class
public class Course extends AndreyKiselyov_002_Project3 {

int CourseID;
String CourseName;

//Course Object
public  Course(int CID, String CName){
	
	CourseID = CID;
	CourseName = CName;
	
	}


//Course Methods 
public void getCourseInfo() {
	
System.out.println("Enter Course ID: ");
CourseID = inputDevice.nextInt();

System.out.println("Enter Course Name: ");
CourseName = inputDevice.next();


}

public void confirmation() {
System.out.println("Confirmation: New Course " + CourseID + " has been added");
	}



public String toString() {
	
	return
	 CourseID + " "
     + CourseName +
     "\r\n";

	}

public void getCourseID() {
	System.out.println("Enter Course ID: ");
	
	CourseID = inputDevice.nextInt();
}

public int printCourseID() {
	return
	CourseID;
}

public String getCourseName() {
	return
	CourseName;
}
	
	
}
