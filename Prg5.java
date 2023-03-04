package assignment4;
import java.util.*;

public class Prg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the fisrt number");
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 System.out.println("Enter second number");
		 int b = sc.nextInt();
		 System.out.println(+a + "," + b);
		 int value = 1;
		 for (; b != 0; --b)

		 {
		 value *= a;
		 }
		 System.out.println(value);


	}

}
