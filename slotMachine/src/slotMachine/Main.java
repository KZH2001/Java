package slotMachine;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		showMessage("Welcome to Slot Game");
		int balance = 1000;
		int betAmt;
		int payout;
		String[] row;
		
		while(balance > 0) {
		System.out.printf("Current Your Balance is $%d ", balance);
		System.out.println();
		System.out.print("Place Your Bet Amount : ");
		betAmt = scanner.nextInt();
		if (betAmt > balance) {
			System.out.println("Insufficient Balance");
		}
		else if (betAmt <= 0) {
			System.out.println("Bet must be greater than 0");
		}else {
			balance -= betAmt;
		}
		row = spinRow();
		printRow(row);
		getPayout(row,betAmt);
		}
		
		
		scanner.close();	
		
	}
	
	public static void showMessage(String message) {
		System.out.println("----------------------");
		System.out.println(message);
		System.out.println("----------------------");

		}
	
	static String[] spinRow() {
		String[] symbols = {"🍑","🍟","🥐","🍒","🍄"};
			String[] row = new String[3];
		Random random = new Random();

		
		for (int i = 0;i < 3;i++) {
			row[i] = symbols[random.nextInt(symbols.length)];
		}
		
		return row;

	}
	
	static void printRow(String[] row) {
		System.out.println(" " + String.join(" | ", row));
			
	}
	
	static int getPayout(String[] row,int betAmt) {
		
		if(row[0].equals(row[1]) && row[1].equals(row[2])) {
			return switch(row[0]) {
			case "🍑" -> betAmt * 3;
			case "🍟" -> betAmt * 4;
			case "🥐" -> betAmt * 5;
			case "🍄" -> betAmt * 10;
			case "🍒" -> betAmt * 20;
			default -> 0;

			};
		}
		 
		return 0;
	}
	
}
