
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		try{
			System.out.print("Enter number : ");
			int num = scanner.nextInt();
			System.out.print("Your number is " + num);
		}catch(InputMismatchException e){
			System.out.print("Must be number");
		}finally {
			scanner.close();
		}
		
		
	}

}
