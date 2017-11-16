import java.util.Scanner;

public class switchStat {
  private static Scanner input;

  public static void switchYear() {
    System.out.println("Enter the year here: ");
    input = new Scanner(System.in);
    int year = input.nextInt();
    String yearString;
    switch (year) {
      case 2010:
        yearString = "This year is 2010";
        break;
      case 2011:
        yearString = "This year is 2011";
        break;
      case 2012:
        yearString = "This year is 2012";
        break;
      case 2013:
        yearString = "This year is 2013";
        break;
      case 2014:
        yearString = "This year is 2014";
        break;
      case 2015:
        yearString = "This year is 2015";
        break;
      case 2016:
        yearString = "This year is 2016";
        break;
      case 2017:
        yearString = "This year is 2017";
        break;
      default:
        yearString = "Invalid year";
        break;
    }
    System.out.println(yearString);
  }
}
