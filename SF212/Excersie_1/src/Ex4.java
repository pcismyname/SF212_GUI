import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex4 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int quarter = sc.nextInt();
		int dime = sc.nextInt();
		int nickel = sc.nextInt();
		DecimalFormat dollar = new DecimalFormat("0000.000000$");
		double money = quarter*0.25 + dime*0.10 + nickel * 0.05;
		//System.out.printf("%.2f$\n",money);
		System.out.println(dollar.format(money));
	}
		
}
