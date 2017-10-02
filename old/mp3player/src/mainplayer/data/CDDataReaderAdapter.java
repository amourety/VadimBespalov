package mainplayer.data;

/**
 * Created by amour on 24.02.2017.
 */

import java.io.File;
import java.net.URI;

public class CDDataReaderAdapter implements DataReader {
    private CDDataReader cdDataReader;

    public CDDataReaderAdapter(CDDataReader cdDataReader) {
        this.cdDataReader = cdDataReader;
    }

    @Override
    public File read(URI uri) throws DataReaderException{
        return this.cdDataReader.readFileFromCD(uri);
    }

    @Override
    public void scan(URI uri) throws DataReaderException{
        this.cdDataReader.scanFilesOnCD(uri);
    }
}