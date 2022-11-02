import java.util.Scanner;

public class Ex15 {
	
	public static boolean checkBit(String bits) {
		boolean flag = true;
		for(int i=0;i<bits.length();i++) 
			if(bits.charAt(i) != '0' && bits.charAt(i) != '1')
			flag = false;
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		 
		System.out.println(checkBit(input) ? "valid bit" : "invalid bit");
		int count = 0;
		if(checkBit(input)) {
			for(int i=0;i<input.length();i++) {
				if(input.charAt(i) == '1') count++;
			}
			System.out.println(count);
		}
		
		
		
	}
}
