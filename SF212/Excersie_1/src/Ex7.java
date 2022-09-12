import java.util.Random;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();
		int n1 = rand1.nextInt(51);
		int n2 = rand2.nextInt(51);
		int n3 = rand3.nextInt(51);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		double avg = (n1+n2+n3)/3;
		System.out.println(avg);
		
	}

}
