public class arrayTest {
    // creates an array list
    public static void arrayList() {
        int sum = 0;
        int[] arrayList = { 5, 10, 15, 20, 25, 30, 35, 40 };
        for (int i = 0; i < arrayList.length; i++) {
            System.out.println(arrayList[i]);
        }
        for (int i = 0; i < arrayList.length; i++) {
            sum = sum + arrayList[i];
            System.out.println("The sum of the array is " + sum);
        }
    }
}