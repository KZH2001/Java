
public class Car {

	String name;
	String color;
	
	Car(String name,String color){
		this.name = name;
		this.color = color;
	}
	
	void drive() {
		System.out.println("You drive" + name + " and the color is " + color);

	}

}
