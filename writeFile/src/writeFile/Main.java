package writeFile;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("C:\\Users\\MSI\\Downloads\\note.txt")) {
			writer.write("What's your name");
			System.out.println("Successfully");
		} catch (IOException e) {
			System.out.println("Fail");
		}
	}

}

