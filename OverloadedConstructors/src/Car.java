
public class Car {
	String name;
	String model;
	double speed;
	String factory;
	
Car(){
	this.name = "Swift";
	this.model = "Suzuki";
	this.speed = 120;
	this.factory = "Japan";
}

Car(String name){
		this.name = name;
		
	}

Car(String name,String model){
	this.model = model;
	this.name = name;
	
}

	
Car(String name,String model,double speed,String factory){
	this.name = name;
	this.model = model;
	this.speed = speed;
	this.factory = factory;
}
}
