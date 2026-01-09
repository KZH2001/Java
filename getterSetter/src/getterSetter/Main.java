package getterSetter;

public class Main {

	public static void main(String[] args) {

		Car car = new Car("Toyota","white");
//		car.name = "China";
		car.setColor("red");
		System.out.print(car.getColor());
	}

}
