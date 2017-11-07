 /**Christian Jonas
 Demonstrating for the Integration Project
 */

 import java.util.Scanner;

 public class Project {

 public static void main(String[] args) {
 demonstrateVar(); // calls
 integerDiv();
 personSpeak();
 }
 private static int add(int x, int y) { // Int x and Int y are parameters
 return x + y;
 }
 private static void demonstrateVar() { //header
 int x = 99;
 //A variable is a space of memory that can contain a data value
 int y = 1;
 int result = add(x, y); //x and y are now arguments
 System.out.println(result);
 }
 private static void integerDiv() {
 int x = 8;
 int y = 3;
 int div = x / y;
 //dividing by int wont work because java cannot process it.
 System.out.println(div);
 }
 public static void personSpeak() {
 Scanner input = new Scanner(System.in);
 Person personObj = new Person(); //Object
 System.out.println("Enter your name here: ");
 String name = input.nextLine();
 personObj.message(name); //Parameter = (name)
 }
}

