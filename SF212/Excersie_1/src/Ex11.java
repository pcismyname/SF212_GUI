import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String web = sc.nextLine();
		String begin = web.substring(web.indexOf('.')+1);
		String end = begin.substring(begin.indexOf('.')+1);
		System.out.println(end);

	}

}
