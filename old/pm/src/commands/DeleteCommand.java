package commands;

import main.CurrentPathWrapper;

import java.io.File;

/**
 * Created by amour on 12.04.2017.
 */
public class DeleteCommand implements Command {
    private String parameter;
    private String path;

    @Override
    public void execute() {
        File file = new File(CurrentPathWrapper.getPath() + "/" + this.path);
        if (!file.exists()) {
            System.out.println("Такого файла не существует");
            return;
        }
        if (!parameter.contains("f")) {
            System.out.println("Вы действительно хотите удалить файл " + path + "? \n" +
                    "Это действие необратимо! Введите y/n для подтверждения/отмены");
            String c = new java.util.Scanner(System.in).next();
            switch (c) {
                case "n":
                    System.out.println("Удаление отменено");
                    return;
                case "y":
                    System.out.println("Файл был удален");
                    break;
                default:
                    System.out.println("Неопознанный символ. Повторите команду");
                    return;
            }
        }
        file.delete();
    }

    public DeleteCommand(String parameter, String path) {
        this.path = path;
        this.parameter = parameter;
    }

}