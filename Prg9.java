package assignment4;
import java.util.*;
public class Prg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the first number:");
		 int a = sc.nextInt();
		 System.out.println("Enter the second number:");
		 int b = sc.nextInt();
		 int hcf=0;
		 for(int i=1;i<=a||i<=b;i++) {
		 if(a%i==0 && b%i==0)
		 hcf=i;
		 }
		 System.out.println("The HCF of the given numbers is:"+hcf );

	}

}
