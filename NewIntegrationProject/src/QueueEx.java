import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueEx {
    public static void Que() {
        Queue<Integer> A1 = new ArrayBlockingQueue<Integer>(5);
        A1.add(5);
        A1.add(10);
        A1.add(15);
        A1.add(20);
        A1.add(25);
        for (Integer value : A1) {
            System.out.println("The value is " + value);
        }
        Integer value;
        value = A1.remove();
        System.out.println("Removed: " + value);
    }
}
