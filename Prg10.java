package assignment4;
import java.util.*;

public class Prg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		 try (Scanner sc = new Scanner(System.in)) {
			int a, b, sum;
			 do {
			 System.out.println("Enter two numbers");
			 a = sc.nextInt();
			 b = sc.nextInt();
			 sum = a + b;
			 System.out.println("The sum is:" + sum);
//			 System.out.println("Do u want to continue with this operation":if 0 press yes if 0 press no);
			 ch = sc.nextInt();
			 }
			 while (ch == 1);
		}

	}

}
