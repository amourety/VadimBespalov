package mainplayer.utils;

/**
 * Created by amour on 24.02.2017.
 */
public class UserInteractorFactory {
    public static UserInteractor getProduct(String type) {
        UserInteractor ui = null;
        if (type.equals("GUI")) {
            ui = new GUIUserInteractor();
        }
        else if (type.equals("Console")) {
            ui = new ConsoleUserInteractor();
        }
        return ui;
    }
}