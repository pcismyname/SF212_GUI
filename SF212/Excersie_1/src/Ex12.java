import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value greate than 10");
		double num = sc.nextDouble();
		double result = num;
		do {
			System.out.println("Pleas value greate than 10");
			num = sc.nextDouble();
		}
		while(num <= 10);
		
		int count = 0;
		while(num >= 1.01) {
			num = Math.sqrt(num);
			count++;
		}
		System.out.println(count);
		
	}

}
