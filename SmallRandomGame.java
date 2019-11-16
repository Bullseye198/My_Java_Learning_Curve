import java.util.Random;
public class SmallRandomGame {

	public static void main(String[] args) {
		
		String[] name = {"Martin", "Krispin", "Joshua"};
		String[] strength = {"strong", "weak", "wuss"};
		String[] object = {"car", "pen", "world"};
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(3);
		
		System.out.println("if " + name[randomNumber] + " is " + strength[randomNumber] + ",");
		System.out.println("then he can lift the " + object[randomNumber] + ".");
	}
}