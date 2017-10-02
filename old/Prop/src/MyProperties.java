/**
 * Created by amour on 24.04.2017.
 */
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class    MyProperties {
    private Map<String, String> properties;

    public MyProperties() {
        properties = new HashMap<>();
    }

    public String getProperty(String key) {
        return properties.get(key);
    }

    public void list(PrintStream out) {
        Iterator<Map.Entry<String, String>> iterator = properties.entrySet().iterator();
        Map.Entry<String, String> entry;
        while (iterator.hasNext()) {
            entry = iterator.next();
            out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public void list(PrintWriter out) {
        Iterator<Map.Entry<String, String>> iterator = properties.entrySet().iterator();
        Map.Entry<String, String> entry;
        while (iterator.hasNext()) {
            entry = iterator.next();
            out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public void load(Reader reader) {
        try (BufferedReader myReader = new BufferedReader(reader)) {
            String line;
            while ((line = myReader.readLine()) != null) {
                String[] values = line.split("=");
                properties.put(values[0].trim(), values[1].trim());
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void setProperty(String key, String value) {
        properties.put(key, value);
    }

}