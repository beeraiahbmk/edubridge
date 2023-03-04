package assignment4;
import java.util.Scanner;

public class Prg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int sum = 0, r;
		 while (n > 0) {
		 r = n % 10;
		 System.out.println(r);
		 sum = (sum * 10) + r;
		 n = n / 10;
		 }
		 System.out.println(sum);

	}

}
