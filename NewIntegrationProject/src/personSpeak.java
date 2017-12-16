import java.util.Scanner;

public class personSpeak {
	private static Scanner input;

	public static void personTalk() {
		input = new Scanner(System.in);
		Person personObj = new Person(); // Object
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		personObj.message(name); // Parameter = (name)
	}
}
