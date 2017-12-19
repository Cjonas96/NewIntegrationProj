public class condAndRela {
    public static void cond() {
        int num1 = 3;
        int num2 = 6;
        System.out.println("Your two variables are 3 and 6");
        if (num1 > num2) {
            System.out.println("3 is larger than 6.");
        } else if (num1 < num2) {
            System.out.println("3 is not larger than 6.");
        }

        else {
            System.out.println("Error");
        }
    }

    public static void rela() {
        int num90 = 90;
        int num91 = 91;
        if ((num90 == 90) && (num91 == 91)) {
            System.out.println("90 is 90 and 91 is 91");
        }
        if ((num90 == 90) || (num91 == 91)) {
            System.out.println("90 is 90 or 91 is 91");
        }
    }
}