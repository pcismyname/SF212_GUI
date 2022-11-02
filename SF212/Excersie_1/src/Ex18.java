import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double num,max = 0,min = 0;
		double sum=0;
		int c = 0;
		do {
			num = sc.nextDouble();
			if(num>=0 && num<=100) {
				if(c==0) {
					max = num;
					min = num;
				}
				if(max<num)max=num;
				if(min>num)min=num;
				c++;
				sum+=num;
			}
		}while(c<10);
		System.out.println("Avg = " + sum/10 + " Max =  " + max + " Min = " + min);
		
		
	}

}
