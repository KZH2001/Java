package arraylists;
import java.util.*;


public class Main {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> foods = new ArrayList<>();

		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(23);
//		list.add(3);
//		list.add(5);
//		
//		
//		
//		ArrayList<String> list1 = new ArrayList<>();
//		list1.add("Hello");
//		list1.add(" Boy");
//		
//		System.out.print(list1);
//		System.out.println(list1.size());
//		
//		
//		Collections.sort(list);
//		System.out.println(list);
		
		System.out.print("Enter the number food : ");
		int numOfFood = scanner.nextInt();
		scanner.nextLine();
//		??????
		for (int i = 1; i <= numOfFood; i++) {
			System.out.print("Enter food " + i + ":");
			String food = scanner.nextLine();
			foods.add(food);
			
		}
		
		System.out.print(foods);
		scanner.close();

		
		 
	}

}
