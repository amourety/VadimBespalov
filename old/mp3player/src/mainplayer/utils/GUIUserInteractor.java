package mainplayer.utils;

/**
 * Created by amour on 24.02.2017.
 */
public class GUIUserInteractor implements UserInteractor {

    public GUIUserInteractor() {}

    @Override
    public String readCommand() throws UserInteractorReadException {
        return "Скоро будет реализация";
    }

    @Override
    public void write(String msg) throws UserInteractorWriteException {
        System.out.println("Скоро будет реализация");
    }
}