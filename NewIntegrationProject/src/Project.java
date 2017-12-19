import java.util.Scanner;

/**
 * Christian Jonas Demonstrating for the Integration Project
 */
// Checkstyle does not work with google guidelines in most classes
// This is the index where you can call what you want to see.
public class Project {
    private static Scanner input;

    public static void main(String[] args) {
        int meme = 1;
        while (meme == 1) {
            System.out.println("Enter the index: ");
            try {
                input = new Scanner(System.in);
                int index = input.nextInt();
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
                } else if (index == 8) {
                    twoDArray.twoDTest();
                    break;
                } else if (index == 9) {
                    Inheritance.sum();
                    break;
                } else if (index == 10) {
                    polyArr.polyArray();
                    break;
                } else if (index == 11) {
                    QueueEx.Que();
                    break;
                } else if (index == 12) {
                        arrayTest.arrayList();
                        break;
                    
                } else {
                    System.out.println("Please enter a number 1-12.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter an integer.");
            }
        }
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