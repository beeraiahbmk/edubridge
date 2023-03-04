package assignment4;
import java.util.Scanner;

public class Prg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the positive integer");
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 System.out.println(((a % 2) > 0) ? ("It is a prime number") : ("It is not a prime"));

	}

}
