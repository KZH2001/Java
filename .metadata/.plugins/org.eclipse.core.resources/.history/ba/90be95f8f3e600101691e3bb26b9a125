package sumCalculation;

import java.util.Scanner;

public class Sum {
	
	private Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		
		
		Sum start = new Sum();
		start.launch();
	}
	
	
	//run
	private void launch() {
		showMessage("Welcomme");
		boolean again = true;
		while (again) {
			int input1 = getUserInput("Enter number 1 : ");
			int input2 = getUserInput("Enter number 2 : ");
			int result = input1 + input2;
			System.out.printf("Your result is %d ", result);
			System.out.println();
			
			again = askToDoAgain();
			showMessage("Good Byey");
		}
	}
	
//	show message ask to do again
	private boolean askToDoAgain() {
		System.out.println("Want to start again? y or others");
		var input = scanner.nextLine();
		return "y".equalsIgnoreCase(input);
		
	}
	
	
	//show message
	private void showMessage(String message) {
		System.out.println("--------------------");
		System.out.println(message);
		System.out.println("-----------------------");
	}
	
	//get user input
	private int getUserInput(String message) {
	System.out.print(message);
	var input = scanner.nextLine();
	return Integer.parseInt(input);
		
	}
	
	

}
