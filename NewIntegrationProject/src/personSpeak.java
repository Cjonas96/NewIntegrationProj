import java.util.Scanner;
 public class personSpeak {
  public static void personTalk() {
    Scanner input = new Scanner(System.in);
    Person personObj = new Person(); //Object
    System.out.println("Enter your name here: ");
    String name = input.nextLine();
    personObj.message(name); //Parameter = (name)
    }
}
