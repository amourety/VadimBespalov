package main;

/**
 * Created by amour on 12.04.2017.
 */
public class CurrentPathWrapper {
    private static String path = System.getProperty("user.home");

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        CurrentPathWrapper.path = path;
    }
}
