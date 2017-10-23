import java.util.Scanner;

/**
 * Created by amour on 23.10.2017.
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number1 = scanner.next();
        String number2 = scanner.next();

        if (number1.length() == 4 && number2.length() == 4) {

            int[] numbers1 = new int[4];
            for (int i = 0; i < 4; i++) {
                numbers1[i] = number2.charAt(i) - '0';
            }

            int[] numbers2 = new int[4];
            for (int i = 0; i < 4; i++) {
                numbers2[i] = number2.charAt(i) - '0';
            }

            int count = 0;

            if (numbers1[0] == numbers2[0]) {
                count++;
            }
            if (numbers1[1] == numbers2[1]) {
                count++;
            }
            if (numbers1[2] == numbers2[2]) {
                count++;
            }
            if (numbers1[3] == numbers2[3]) {
                count++;
            }

            System.out.println("Количество быков: " + count);
        } else {
            System.err.println("Введите два четырёхзначных числа!");
        }
    }
}
