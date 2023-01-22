package assignment3;
import java.util.Scanner;
public class GradeDiscription {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter your Grade : ");
		char grade = sc.next().charAt(0);
		switch (grade) {
		case 'A', 'a':
		System.out.println("Average");
		break;
		case 'G', 'g':
		System.out.println("Good");
		break;
		case 'V', 'v':
		System.out.println(" Very Good");
		break;
		case 'E', 'e':
		System.out.println("EXcellent ");
		break;
		case 'F', 'f':
		System.out.println("Fail");
		break;
		default:
		System.err.println("Inavlid Input");
		}

	}

}
