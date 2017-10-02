package mainplayer.data;

/**
 * Created by amour on 24.02.2017.
 */
import java.io.File;
import java.net.URI;

public class CDDataReader {

    public File readFileFromCD(URI uri) throws DataReaderException{
        System.out.println("Скоро я смогу получать файлы с CD-диска!");
        return new File(uri);
    }

    public void scanFilesOnCD(URI uri) throws DataReaderException {
        System.out.println("Скоро я смогу сканировать файлы c CD-диска!");
    }
}
