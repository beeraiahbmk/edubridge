package assignment4;
import java.util.Scanner;

public class Prg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the set of integers");
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int sum2 = 0, sum1 = 0;
		 for (int i = 0; i <= a; i++) {
		 if (i % 2 == 0) {
		 // int temp1=i;
		sum1 = sum1 + i;
		 } else
		 sum2 = sum2 + i;
		 }
		 System.out.println("sum of even numbers:" + sum1);
		 System.out.println("sum of odd numbers:" + sum2);

	}

}
