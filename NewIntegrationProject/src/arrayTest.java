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
    public static int getMaxValue(int[] arrayList) {
        int maxValue = arrayList[0];
        for(int i = 1; i < arrayList.length; i++) {
            if (arrayList[i] > maxValue) {
                maxValue = arrayList[i];
            }
        }
        return maxValue;
    }
    public static int getMinValue(int[] arrayList) {
        int minValue = arrayList[0];
        for(int i = 1; i < arrayList.length; i++) {
            if (arrayList[i] > minValue) {
                minValue = arrayList[i];
            }
        }
        return minValue;
    }
}