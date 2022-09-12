import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String fileName;
		
		fileName = sc.nextLine();
		int dotIndex = fileName.indexOf('.');
		System.out.println(fileName.substring(dotIndex+1));
	}

}
