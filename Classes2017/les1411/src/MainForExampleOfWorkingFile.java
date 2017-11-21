import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by amour on 14.11.2017.
 */
public class MainForExampleOfWorkingFile {
    public static void main(String[] args) throws Exception {
        // Streams
        // Поток - последовательность байтов
        // При запуске программы на Java по умолчанию открываются три потока
        // System.out/err/in
        /*InputStream input = System.in;
        byte bytes[] = new byte[100];
        int length = input.read(bytes);
        for (int i = 0; i < length; i++){
            System.out.print((char)bytes[i]);
        }
        */
        /* FileInputStream inputStream = new FileInputStream("C:\\Users\\amour\\Desktop\\VadimBespalov\\Classes2017\\les1411\\src\\input.txt");
        byte bytes[] = new byte[100];
        int length = inputStream.read(bytes);
        for(byte b: bytes){
            System.out.print((char)b);
        }
        */

            MyScanner sc = new MyScanner("C:\\Users\\amour\\Desktop\\VadimBespalov\\Classes2017\\les1411\\src\\input.txt");
            sc.printFile("C:\\Users\\amour\\Desktop\\VadimBespalov\\Classes2017\\les1411\\src\\input.txt");
            System.out.println();
            System.out.println(sc.nextLine());
            System.out.println(sc.nextInt() + sc.nextInt());
    }
}
