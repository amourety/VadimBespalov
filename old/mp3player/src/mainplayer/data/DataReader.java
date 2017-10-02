package mainplayer.data;

/**
 * Created by amour on 24.02.2017.
 */
import java.io.File;
import java.net.URI;

public interface DataReader {
    public File read(URI uri) throws DataReaderException;
    public void scan(URI uri) throws DataReaderException;

}
