import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String[] questions = {
						"What does CPU stand for?",
						"Which of the following is a programming language?",
						"What is the correct file extension for a Java source file?",
						"Which symbol is used to end a statement in Java?"
						};
		
		String[][] options = {
				{"1. Central Processing Unit", "2. Computer Personal Unit", "3. Central Program Utility", "4. Control Processing Unit"},
				{"1. HTML", "2. Java", "3. CSS", "4. SQL"},
				{"1. .class", "2. .java", "3. .js", "4. .jar"},
				{"1. :", "2. .", "3. ;", "4. ,"},
				
						};
		
		int[] answer = {1,2,2,3};
		
		int score = 0;
		int guess;
	
		for(int i = 0; i < questions.length; i++) {
			System.out.println();
			System.out.println(questions[i]);
			
			for (int j = 0 ; j < options.length; j++) {
				System.out.println(options[i][j]);
			}		

//			for(String option : options[i]) {
//				System.out.println(option);
//			}
			System.out.print("Enter your guess : ");
			guess = scanner.nextInt();
			if (guess == answer[i]) {
				score++;
				System.out.println("Correct");
				
			}else {
				System.out.println("Wrong");
			}

		}
		System.out.printf("Your final score %d of %d ", questions.length);
		scanner.close();

		}
	


}
