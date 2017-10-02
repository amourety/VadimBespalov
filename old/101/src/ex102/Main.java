package ex102;

import java.io.*;

/**
 * Created by amour on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        final String PATH = "C:\\Users\\amour\\Desktop\\java\\101\\test.txt";
        String string = new java.util.Scanner(System.in).nextLine();
        try (OutputStream os = new FileOutputStream(PATH); InputStream is = new FileInputStream(PATH)) {
            byte b[] = string.getBytes();
            for (int i = 0; i < b.length; i++)
                os.write(b[i]);
            os.flush();
            System.out.println(string);

            for (int i = 0; i < b.length; i++)
                System.out.print((char)is.read());

        } catch (FileNotFoundException ex) {
            System.out.println("Файла не существует");
        } catch (IOException ex) {
            System.out.println("Ошибка");
        }
    }
}
