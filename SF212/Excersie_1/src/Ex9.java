import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch = str.charAt(0);
		System.out.println(ch);
		if(Character.isDigit(ch)) {
			System.out.println("False");
		}
		else {
			if(Character.isLetter(ch) || ch=='_' || ch=='$')
				System.out.println("True");
			else
				System.out.println("False");
		}
	
	}
}
