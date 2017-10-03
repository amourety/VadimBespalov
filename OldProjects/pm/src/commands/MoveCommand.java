package commands;

import main.CurrentPathWrapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by amour on 12.04.2017.
 */
public class MoveCommand implements Command {
    private String fileName;
    private String toDirectory;

    @Override
    public void execute() {
        File file = new File(fileName);
        try {
            Files.move(Paths.get(CurrentPathWrapper.getPath() + "/" + fileName).normalize(),
                    Paths.get(toDirectory + "/" + fileName).normalize(), java.nio.file.StandardCopyOption.ATOMIC_MOVE,
                    java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            System.out.println("Произошла ошибка");
            ex.printStackTrace();
        }
    }

    public MoveCommand(String fileName, String toDirectory) {
        this.fileName = fileName;
        this.toDirectory = toDirectory;
    }
}
