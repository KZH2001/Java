package getterSetter;

public class Car {
	private String name;
	private String color;
	
	Car(String name,String color){
		this.name = name;
		this.color = color;
	}


String getName() {
	return this.name;
}

String getColor() {
	return this.color;
}

public void setName(String name) {
	this.name = name;
}


public void setColor(String color) {
	this.color = color;
}

}

