package task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final String FILE_PATH = "input.txt";

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] words = bufferedReader.readLine().split(" ");
            Map<String, Integer> map = new HashMap<>();
            int counter;

            for (String word : words) {
                word = word.toLowerCase();

                if (!map.containsKey(word)) {
                    map.put(word, 1);
                } else {
                    counter = map.get(word);

                    map.replace(word, counter, counter + 1);
                }
            }

            for (String key : map.keySet()) {
                System.out.println(key + " : " + map.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
