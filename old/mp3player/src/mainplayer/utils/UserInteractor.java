package mainplayer.utils;

/**
 * Created by amour on 24.02.2017.
 */

public interface UserInteractor {
  public String readCommand() throws UserInteractorReadException;
  public void write(String msg) throws UserInteractorWriteException;
}
