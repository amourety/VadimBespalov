package mainplayer.data;

/**
 * Created by amour on 24.02.2017.
 */
import java.io.File;
import java.net.URI;
import java.util.Arrays;

public class LocalDriveDataReader implements DataReader {

    @Override
    public File read(URI uri) throws DataReaderException{
        return new File(uri);
    }

    @Override
    public void scan(URI uri) throws DataReaderException{
        try {
            File[] files = new File(uri).listFiles();
            String names[] = new String[files.length];
            int length = uri.toString().length() - 7;

            for (int i = 0; i < names.length; i++)
                names[i] = files[i].toString().substring(length);

            System.out.println("В данной папке есть следующие файлы: " + Arrays.toString(names));
        }
        catch (NullPointerException ex) {
            System.out.println("Либо файлов нет, либо вы неверно ввели путь");
            System.exit(1);
        }
    }


}
