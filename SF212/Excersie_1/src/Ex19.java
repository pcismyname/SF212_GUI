import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int deci = sc.nextInt();
		String bit = "";
		while(deci> 0) {
			bit += (char)deci%2;
			deci /= 2;
		}
		for(int i=bit.length()-1;i>=0;i--) {
			System.out.print(bit.charAt(i));
		}
		
	}

}
