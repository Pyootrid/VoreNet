import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		System.out.println("VoreNet");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
