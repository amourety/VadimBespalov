package mainplayer.utils;
/**
 * Created by amour on 24.02.2017.
 */
import java.util.Scanner;

public class ConsoleUserInteractor implements UserInteractor {
    private Scanner reader;

    public ConsoleUserInteractor() {
        reader = new Scanner(System.in);
    }

    @Override
    public String readCommand() throws UserInteractorReadException {
        return reader.nextLine();
    }

    @Override
    public void write(String msg) throws UserInteractorWriteException {
        System.out.println(msg);
    }
}

