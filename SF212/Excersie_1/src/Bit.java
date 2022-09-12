import java.util.Scanner;

public class Bit {
	//index  0123 
	//bit    1100    deci 8+4 = 12  
	//length  4
	//i+=1  == i
	// 2^3 + 2^2 + 2^1 + 2^0 =  1111
	//2^3 + 2^0 = 1001 = 9
	public static int  bitToDeci(String bits) {
		int deci = 0;
		int c = 0;
		for(int i = 0; i<bits.length(); i++) {
			if(bits.charAt(i) == '1') deci += Math.pow(2, bits.length()-1-c);
			c++;
		}
		return deci;
	}
	
	
	
	
	public static void main(String []args) {
		System.out.println(bitToDeci("1100"));
	}
}
