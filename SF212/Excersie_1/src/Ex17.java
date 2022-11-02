import java.util.Scanner;

public class Ex17 {
	
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
		String input = sc.nextLine();

		if(checkBit(input)) {
			int count = 0;
			boolean flag =false;
			for(int i=0;i<input.length();i++) {
				if(input.charAt(i) == '1') count++;
				else count = 0;
				if(count == 3)flag = true;
			}
			System.out.println(flag ? "accepted": "rejected");
		}
		else {
			System.out.println("invalid bit");
		}
	}

}
