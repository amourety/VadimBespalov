package ex101;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by amour on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        final String PATH = "C:\\Users\\amour\\Desktop\\java\\101\\test.txt";
        try (OutputStream os = new FileOutputStream(PATH); InputStream is = new FileInputStream(PATH)) {
            byte b[] = generateByteArray(20);
            System.out.println(Arrays.toString(b));
            os.write(b);
            os.flush();
            byte c[] = new byte[b.length];
            is.read(c);
            System.out.println(Arrays.toString(c));
        } catch (FileNotFoundException ex) {
            System.out.println("Такого файла не существует");
        } catch (IOException ex) {
            System.out.println("Ошибка");
        }
    }

    public static byte[] generateByteArray(int size) {
        byte result[] = new byte[size];
        Random random = new Random();
        random.nextBytes(result);
        return result;
    }
}
