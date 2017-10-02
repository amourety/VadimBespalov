package mainplayer.data;

/**
 * Created by amour on 24.02.2017.
 */
    public class DataReaderFactory{
        public static DataReader getProduct(String type) {
            DataReader dataReader = null;
            if (type.equals("Local")) {
                dataReader = new LocalDriveDataReader();
            }
            else if (type.equals("Web")) {
                dataReader = new WebDriveDataReader();
            }

            return dataReader;
        }
    }

