
public class Main {

	public static void main(String[] args) {
		
		car c = new car();
		bike b = new bike();
		boat boat = new boat();
		
		vehicle[] vehicles = {c,b,boat};
		
		for (vehicle vehicle : vehicles) {
			vehicle.go();
		}

	}

}
