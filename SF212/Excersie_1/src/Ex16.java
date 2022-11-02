import java.util.Scanner;

public class Ex16 {

	public static boolean checkBit(String bits) {
		boolean flag = true;
		for(int i=0;i<bits.length();i++) 
			if(bits.charAt(i) != '0' && bits.charAt(i) != '1')
				flag = false;
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input binary");
		String input = sc.nextLine();
		
		while(!checkBit(input)) {
			System.out.println("Please in binary!!!");
			input = sc.nextLine();
		}
		int count = 0;
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) == '1') count++;
		}
		System.out.println(count);
	}
	
}
