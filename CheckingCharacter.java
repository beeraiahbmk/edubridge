package assignment3;
import java.util.*;

public class CheckingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a character : ");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e' || ch == 'f' || ch == 'g' || ch
		== 'h'|| ch == 'i' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' ||ch == 'o' || ch == 'p'
		|| ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'u' || ch == 'v' ||
		ch == 'w' || ch == 'x'|| ch == 'y' || ch == 'z') {
		System.out.println(" it is a alphabet character !!");}
		else if (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'E' || ch == 'F' || ch ==
		'G' || ch == 'H'|| ch == 'I' || ch == 'J' || ch == 'K' || ch == 'L' || ch == 'M' || ch == 'N'|| ch == 'O' || ch == 'P'
		|| ch == 'Q' || ch == 'R' || ch == 'S' || ch == 'T' || ch == 'U' || ch == 'V'|| ch == 'W' || ch == 'X'
		|| ch == 'Y' || ch == 'Z') {
		System.out.println(" it is a alphabet character !!");}
		else if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch ==
		'7' || ch == '8'|| ch == '9' || ch == '0') {
		System.out.println(" it is digit character !!");}
		else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch =='&' || ch == '*'
		|| ch == '(' || ch == ')' || ch == '_' || ch == '-' || ch == '+') {
		System.out.println("it is Special Character !!");}
		else {
		System.err.println(" it is not a alphabet or digit or special character !");}
		
	

	}

}
