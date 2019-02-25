package ThreadSum;

/**
 * Created by amour on 25.04.2018.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        int forSum = 0;

        for (int number : array) {
            forSum += number;
        }


        System.out.println("Посчитано циклом: " + forSum);

        int threadSum = 0;
        AddingThread[] threads = new AddingThread[k];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new AddingThread((n / k) * i, (n / k) * (i + 1), array);
            threads[i].start();
            threads[i].join();

            threadSum += threads[i].getSum();
        }

        System.out.println("Посчитано потоками: " + threadSum);
        System.out.println("Суммы " + (forSum == threadSum ? "" : "не ") + "равны");
    }
}
