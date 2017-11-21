import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by amour on 14.11.2017.
 */
public class MyScanner {
    FileInputStream input;
    InputStream consoleInput = System.in;

    public MyScanner(String name) {
        try {
            input = new FileInputStream(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public MyScanner(){
        try {
            input = new FileInputStream("");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void printFile(String name) throws Exception{
        input = new FileInputStream(name);
        byte bytes[] = new byte[100];
        int length = input.read(bytes);
        for(byte b: bytes){
            System.out.print((char)b);
        }
    }
    public String nextLine() throws Exception {
        String line = "";
        byte bytes[] = new byte[100];
        int length = consoleInput.read(bytes);
        for (int i = 0; i < length; i++) {
            line += (char) bytes[i];
        }
        return line;
    }

    public int nextInt() throws Exception {
        String line = this.nextLine();
        boolean plus = true;
        if (line.charAt(0) == '-'){
            plus = false;
        }
        int source = 0;
        if (plus) {
            for (int i = 0; i < line.length() - 1; i++) {
                source *= 10;
                source += line.charAt(i) - '0';
            }
        }
        else {
            for (int i = 1; i < line.length() - 1; i++) {
                source *= 10;
                source += line.charAt(i) - '0';
            }
            source*=-1;
        }
        return source;
    }
}
