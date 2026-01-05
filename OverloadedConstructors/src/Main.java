
public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("Toyota"); 
			System.out.println(car1.name);
			
		
		Car car2 = new Car();
			System.out.println(car2.model);
		
			
		Car car3 = new Car("Toyota","BMW");
		System.out.println(car3.name);
		System.out.println(car3.model);
	}
	
	

}
