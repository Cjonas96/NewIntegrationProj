import java.util.Scanner;

/**
 * Christian Jonas Demonstrating for the Integration Project
 */
public class Project {
  private static Scanner input;

  public static void main(String[] args) {
    System.out.println("Enter the index: ");
    input = new Scanner(System.in);
    int index = input.nextInt();
    int meme = 1;
    while (meme == 1) {
      if (index == 1) {
        demonstrateVar.demonstrateVariable();
        break;
      } else if (index == 2) {
        integerDiv.integerDivide();
        break;
      } else if (index == 3) {
        personSpeak.personTalk();
        break;
      } else if (index == 4) {
        condAndRela.cond();
        break;
      } else if (index == 5) {
        condAndRela.rela();
        break;
      } else if (index == 6) {
        switchStat.switchYear();
        break;
      } else if (index == 7) {
        hashMap.database();
        break;
      } else {
        System.out.println("Not found.");
        break;
      }
    }
    // demonstrateVar.demonstrateVariable(); // calls
    // integerDiv.integerDivide();
    // personSpeak.personTalk();
    // arrayTest.arrayList();
    // condAndRela.cond();
    // condAndRela.rela();
    // hashMap.database();
    // switchStat.switchYear();
  }
}
