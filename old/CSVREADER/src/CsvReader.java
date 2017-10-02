/**
 * Created by amour on 23.04.2017.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CsvReader implements Iterable<String[]> {
    private String storage[][];
    private String separator;

    public CsvReader() {

    }

    public void read(File file, String separator) throws NotCsvFileException {
        this.separator = separator;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){

            String content;

            int lastSize = 0, count = 0;
            List<String[]> list = new ArrayList<>();

            while ((content = reader.readLine()) != null) {
                String[] values = content.split(separator);
                list.add(values);

                if (lastSize != values.length && lastSize != 0)
                    throw new NotCsvFileException("Не CSV файл");

                lastSize = values.length;
                count++;
            }

            storage = new String[count][lastSize];

            Iterator<String[]> iterator = list.iterator();
            int j = 0;

            while(iterator.hasNext()) {
                String[] values = iterator.next();
                for (int i = 0; i < values.length; i++)
                    storage[j][i] = values[i];
                j++;
            }

        } catch (IOException ex) {
            System.out.println("Ошибка");
        }
    }

    public void read(File file) throws NotCsvFileException {
        read(file, ",");
    }

    public void write(File file, String separator) {
        try (PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < storage.length; i++) {
                for (int j = 0; j < storage[i].length; j++) {
                    pw.print(storage[i][j] + (j != storage[i].length - 1 ? separator : ""));
                }
                pw.println();
                pw.flush();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public void write(File file) {
        write(file, ",");
    }

    public Iterator<String[]> iterator() {
        return new Iterator<String[]>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i != storage.length;
            }

            @Override
            public String[] next() {
                return storage[i++];
            }
        };
    }

    public void print() {
        for (int i = 0; i < storage.length; i++) {
            for (int j = 0; j < storage[i].length; j++) {
                System.out.print(storage[i][j] + (j != storage[i].length - 1 ? separator : ""));
            }
            System.out.println();
        }
    }

    public void add(String... values) throws FileNotLoadedException, IncorrectElementCountException {
        if (storage == null)
            throw new FileNotLoadedException("CSV файл не загружен");

        if (values.length != storage[0].length)
            throw new IncorrectElementCountException("Неверное количество элеменов");

        String[][] newStorage = new String[storage.length + 1][storage[0].length];

        for (int i = 0; i < storage.length; i++)
            newStorage[i] = storage[i];

        newStorage[storage.length] = values;

        storage = newStorage;
    }
}
