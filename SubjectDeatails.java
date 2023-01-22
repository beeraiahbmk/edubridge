package assignment3;
import java.util.Scanner;

public class SubjectDeatails {
	public static void main(String args[]) {
		Scanner data= new Scanner(System.in);
		System.out.println("enter a roll number:");
		int rollNo = data.nextInt();
		System.out.println("Name of the student:");
		String studentName =data.next();
		System.out.println("enter marks of physics,chemistry and computer applications:");
		int physicsMarks = data.nextInt();
		int chemistryMarks = data.nextInt();
		int computerAppMarks = data.nextInt();
		double totalMarks= physicsMarks+chemistryMarks+computerAppMarks;
		double percentage = (totalMarks/300)*100;
		System.out.println("RollNo:"+rollNo);
		System.out.println("Name of Student:"+studentName);
		System.out.println("Marks in physics:"+physicsMarks);
		System.out.println("Marks in chemistry:"+chemistryMarks);
		System.out.println("Marks in physics:"+computerAppMarks);
		System.out.println("Total Marks:"+totalMarks);
		System.out.println("percentage:"+percentage);
		if(percentage>=90) {
		System.out.println("Division= first");
		}
		else if(percentage>=60) {
		System.out.println("Division= second");
		}
		else if(percentage>=40) {
		System.out.println("Division= Third"); 
		}
		else {
		System.out.println("you are failed !!");
		}
	}

}
