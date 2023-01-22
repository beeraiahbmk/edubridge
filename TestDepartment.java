package assignment3;
import java.util.Scanner;

public class TestDepartment {

	public static void main(String[] args) {
		//creating object
		Scanner sc=new Scanner(System.in);
		Department department;
		department=new Department();
		System.out.println("the name of the department:");
		department.departmentName=sc.next();
		System.out.print("the head of the department:");
		department.departmentHead=sc.next();
		System.out.println("the noof students:");
		department.numofStudent=sc.nextInt();
		System.out.println(department.departmentName);
		System.out.println(department.departmentHead);
		System.out.println(department.numofStudent);
		
		
		
		
		
		
		

	}

}
