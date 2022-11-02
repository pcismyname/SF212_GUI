import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner file = new Scanner(new File("C:\\Users\\chids\\OneDrive\\Desktop\\SF212_GUI\\SF212\\Excersie_1\\src\\input.txt"));
		
		System.out.println("Find average");
		double total = 0;
		int c = 0;
		
		if(!file.hasNext()) {
			System.out.println("No value in file");
		}
		else {
			total += file.nextDouble();
			c++;
		}
		
		while(file.hasNext()) {
			c++;
			total+= file.nextDouble();
			//System.out.println(c);
		}
		System.out.println(total/c);
	}
}
