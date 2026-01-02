package rockPaperScissors;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] choices = {"rock","paper","scissors"};
		String playerChoice;
		String computerChoice;
		String playAgain = "yes";
		
		do {
	 System.out.print("Enter your move (rock, paper, scissors) : ");
	 playerChoice = scanner.nextLine().toLowerCase();
	 if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
		 System.out.println("Invalid Choice");
	 }else {
		 System.out.printf("Player Choice : %s",playerChoice);
		 System.out.println();
	 }
	 
	 computerChoice = choices[random.nextInt(3)];
	 System.out.printf("Computer Choice : %s", computerChoice);
	 System.out.println();
			
	if(playerChoice.equals(computerChoice)) {
		System.out.println("It is draw");
	}else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
			(playerChoice.equals("paper") && computerChoice.equals("rock")) ||
			(playerChoice.equals("scissors") && computerChoice.equals("paper"))
			
			
			)
	{
		System.out.println("You win");
	}else {
		System.out.println("You lose");
	}
	
	System.out.print("do you want to play again? yes or no : ");
	playAgain = scanner.nextLine().toLowerCase();
	System.out.println();

	 
		}while(playAgain.equals("yes"));
	 
	 scanner.close();
	
	}

}
