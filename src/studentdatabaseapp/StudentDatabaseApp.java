package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student(); 
		stu1.enroll();	
		stu1.payTution();	
		System.out.println(stu1.showInfo());// Titibits - Since we are returning something fromt he corr method, we need to print something. Hence adding Sysout. 
		//From more number of students we need to initialize this objects again and again. The below way is a better way. 
		
		
		//Ask how many new users we need to run. 
		System.out.println("Enter how many students you want to enroll:");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents]; //Array of Objects based on differrent size.
		
		
		//Create n number of new Students. 
	//	for(int n=0;n<numOfStudents;n++) {
	//		Student stu = new Student();
	//		stu.enroll();	
	//		stu.payTution();	
	//		System.out.println(stu.showInfo());
	//	}
		
		
		
		////Since we need to retain this info in an array, we need to write the below line. 
		for(int n=0;n<numOfStudents;n++) {
		students[n]= new Student(); 
		students[n].enroll();	
		students[n].payTution();	
		
	}
		for(int n=0;n<numOfStudents;n++) {
			System.out.println(students[n].showInfo());
		}
		
	}
	
}
