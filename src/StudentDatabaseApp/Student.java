package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private String tutionBalance;
	private int costOfCourse = 600;
	private static int id = 1000;
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name:");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name:");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Fresher\n 2 - Sophmore\n3 - Junior\n4 - Senior\n Enter student class level:");
		this.gradeYear = in.nextInt();
		
		
		
		setStudentID();
		System.out.println(firstName+""+lastName+""+gradeYear+""+studentID);
		
	}
	//Constructor : prompt user to enter student's name and year
	
	//Generate ID 
	private void setStudentID() {
		
		id++;
		
		this.studentID =  gradeYear + "" + id;
		
		
	}
	// Enroll courses
	//View balance
	
	//Show status

}
