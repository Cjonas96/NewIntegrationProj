
public class twoDArray {
    private static boolean check;

    public static void twoDTest() {
        check = false;
        int[][] arr = new int[3][3];
        {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = i + j;
                    System.out.println(arr[i][j]);
                    if (arr[i][j] == 4) {
                        check = true;
                    }
                }
            }
            if (check = true) {
                System.out.println("Highest number found");
            }
        }
    }
}