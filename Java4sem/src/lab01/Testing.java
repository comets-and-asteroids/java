import java.util.Arrays;
import java.util.function.Consumer;

public class Testing {
    public static void main(String[] args) {
        int[]arr = {7, 5, 2, 5, 7, 9, 11, 0};
        Consumer<int[]> consumer = (a) -> {
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        };
        consumer.accept(arr);
    }
}

