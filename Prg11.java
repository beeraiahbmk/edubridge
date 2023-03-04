package assignment4;
import java.util.Scanner;

public class Prg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		 char opt;int num;int pc=0,nc=0,zc=0;
		 do {
		 System.out.println("Enter the number");
		 num =sc.nextInt();
		 if(num>0)
		 pc++;
		 else if(num<0)
		 nc++;
		 else
		 zc++;
		 System.out.println("If u want to enter more type y");
		 opt=sc.next().charAt(0);
		 }
		 while(opt=='y');

		 System.out.println("the count of positive numbers is "+pc );
		 System.out.println("the count of negative numbers is "+nc );
		 System.out.println("the count of zeros numbers is "+zc );

	}

}
