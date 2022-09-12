import java.util.Scanner;

public class Ex1 {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		String p1 = new String();
		p1 = sc.nextLine();
		String p2;
		p2 = sc.nextLine();
		System.out.println(p1.charAt(1));
		System.out.println(p2);
		
		
		if(p1.length() < p2.length()) {
			System.out.println(p1.length());
		}
		else{
			System.out.println(p2.length());
		}
		
		//System.out.println(p1.length() < p2.length() ? p1.length() : p2.length());
		
		
	}
}
