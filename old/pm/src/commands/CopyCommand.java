package commands;

import main.CurrentPathWrapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by amour on 12.04.2017.
 */
public class CopyCommand implements Command{
    private String from;
    private String destination;

    @Override
    public void execute() {

        Path path = Paths.get(destination + "/" + from);
        if (!path.isAbsolute()) {
            path = Paths.get(CurrentPathWrapper.getPath() + "/" + destination + "/" + from);
        }

        try {
            Files.copy(Paths.get(CurrentPathWrapper.getPath() + "/" + from),
                    path.normalize(), StandardCopyOption.REPLACE_EXISTING
            );
        } catch (IOException ex) {
            System.out.println("Произошла ошибка");
            ex.printStackTrace();
        }

    }

    public CopyCommand(String from, String destination) {
        this.from = from;
        this.destination = destination;
    }
}


