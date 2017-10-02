package commands;

import main.CurrentPathWrapper;

import java.io.File;

/**
 * Created by amour on 12.04.2017.
 */
public class SetDirectoryCommand implements Command {
    private String path;

    @Override
    public void execute() {
        if (path.equals("~")) {
            CurrentPathWrapper.setPath(System.getProperty("user.home"));
            return;
        }

        File file = new File(path);

        if (file.isAbsolute()) {
            CurrentPathWrapper.setPath(path);
        }
        else {
            file = new File(CurrentPathWrapper.getPath() + "/" + path);
            if (file.exists())
                CurrentPathWrapper.setPath(file.toPath().normalize().toString());
        }
    }

    public SetDirectoryCommand(String path) {
        this.path = path;
    }
}