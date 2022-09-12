import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		Random rand = new Random();
		n1 = rand.nextInt(41) +60;
		n2 = rand.nextInt(41) +60;
		System.out.printf("%d %d\n", n1, n2);
		System.out.println(n1 < n2 ? n1 : n2);
		
	}

}
