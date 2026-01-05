
public class Main {

	public static void main(String[] args) {
		
		Car[] arrCar = {new Car("BMW","White"),
						new Car("Toyota","Black")
		
		};
		
		Car car1 = new Car("BMW","red");
		Car car2 = new Car("Toyota","white");
		Car car3 = new Car("Suzuki","yellow");
		
		Car[] cars = {car1,car2,car3};
		Car[] Car = {car1,car2,car3};
		for(int i = 0; i < cars.length; i++) {
			 System.out.println(cars[i].name);
		}
		
		for(Car car : arrCar) {
			System.out.println(car.color);
			
		}
		
//		System.out.println(arrCar.name)
		
		
	}

}
