public class demonstrateVar {
    private static int add(int x, int y) { // Int x and Int y are parameters
        return x + y;
    }

    public static void demonstrateVariable() { // header
        int x = 99;
        // A variable is a space of memory that can contain a data value
        int y = 1;
        int result = add(x, y); // x and y are now arguments
        System.out.println(result);
    }
}
