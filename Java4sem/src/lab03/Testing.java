package lab03;

import java.util.HashMap;
import java.util.HashSet;

public class Testing {
    public static void main(String[] args) throws InterruptedException {
        SemaphoreSet<String> semaphoreSet = new SemaphoreSet<>(new HashSet<>());

        Thread thread1 = new Thread(() -> {
            semaphoreSet.add("One");
            semaphoreSet.add("Two");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println(semaphoreSet.add("one"));
            System.out.println(semaphoreSet.contains("one"));
        });
        thread1.start();
        thread2.start();
    }
}
