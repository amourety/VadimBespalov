package commands;

import main.CurrentPathWrapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by amour on 12.04.2017.
 */
public class ListFilesCommand implements Command{
    private String path;
    private String parameter;

    @Override
    public void execute() {
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            print(files, parameter);
        }
        else {
            System.out.println("Такой папки не существует");
        }
    }

    public ListFilesCommand(String parameter) {
        this.path = CurrentPathWrapper.getPath();
        this.parameter = parameter;
    }

    private String generateInfo(File file) {
        String info = " ";

        if (file.canRead())
            info += "r";
        if (file.canWrite())
            info += "w";
        if (file.canExecute())
            info += "x";
        try {
            info += " Владелец: " + Files.getOwner(file.toPath());
        } catch (IOException ex) {
            System.out.println("Ошибка");
        }
        return info + " " + file.length;
    }

    private void print(File[] files, String parameter) {
        boolean l = false;
        if (parameter.contains("l"))
            l = true;


        for (File file : files) {
            System.out.println(file + (l ? generateInfo(file) : ""));
        }
    }
}
