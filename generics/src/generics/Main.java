package generics;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		box.setItem("Book");
		System.out.println(box.getItem());
	}

}
