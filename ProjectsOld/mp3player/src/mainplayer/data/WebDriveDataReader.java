package mainplayer.data;

/**
 * Created by amour on 24.02.2017.
 */
import java.io.File;
import java.net.URI;

public class WebDriveDataReader implements DataReader {
    @Override
    public File read(URI uri) throws DataReaderException{
        System.out.println("Скоро я смогу получать файлы из сети!");
        return new File(uri);
    }

    @Override
    public void scan(URI uri) throws DataReaderException {
        System.out.println("Скоро я смогу сканировать файлы из сети!");
    }
}