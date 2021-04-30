package studentdatabaseapp;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tutionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 10000;

	//Constructor - prompt to enter student's name and year
	public Student(){ // We are not putting anything in the argument because we have to take in dynamic input  from the user
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student First Name:");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student Last Name:");
		this.lastName = in.nextLine();
		
		
		System.out.print(" 1) Freshman\n 2) Sophomore\n 3)Junior\n 4) Senior\n Enter Student Class level:");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		System.out.println(firstName+""+lastName+" "+gradeYear+studentID);
		
		//id++; -- Id increment could have been done within constructor also, but just doing it in Set. 
		
	}
	
	//Generate an ID.
	private void setStudentID() {
		//Grade Level + ID
		id++;
		this.studentID = gradeYear+""+id; 
		
	}
	//Enroll in courses 
	public void enroll() {
		do {
				//Get inside a loop, user hits 0 when they are done enrolling
				System.out.println("Enter course to enroll(Q to quit):");
				Scanner in = new Scanner(System.in);
				String course = in.nextLine();
				if(!course.equals("Q")){ // When I first put it under 'Q'(single quotes) it is taking under Char and hence type mismatch.
					courses = courses + "\n"+ course;
					tutionBalance = tutionBalance + costOfCourse;
				}
				else {
					System.out.println("Break");
					break;
				}
				
		}while(1!=0);		
		System.out.println("Enrolled in"+courses);
		System.out.println("Tution Balance:"+ tutionBalance);
	}
	
	//View Balance 
	public void viewBalance() {
		System.out.println("Your Balance is: $"+tutionBalance);
	}
	//Pay tution
	public void payTution() {
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment of: $"+payment);
		viewBalance();
	}
	
	//Show Status
	public String showInfo() { // We can use toString  method in place of ShowInfo method. 
//		System.out.println("Name"+firstName+" "+lastName+"\n Courses Enrolled:"+courses+"\nBalance: $"+tutionBalance);
		return "Name"+firstName+" "+lastName+"\n Courses Enrolled:"+courses+"\nBalance: $"+tutionBalance;
	}
	
	
}
