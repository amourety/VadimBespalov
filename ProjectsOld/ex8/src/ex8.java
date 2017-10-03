/**
 * Created by amour on 09.06.2017.
 */
import java.util.*;

public class ex8 {
    public static void main (String [] args){
        String string = "sdsdxc121sssssssscxcxcv";
        char[] chars = string.toCharArray();
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();
        for (char aChar : chars) {
            if (countMap.containsKey(aChar)) {
                countMap.put(aChar, countMap.get(aChar) + 1);
            } else {
                countMap.put(aChar,1);
            }
        }
        for (Map.Entry<Character, Integer> a: countMap.entrySet()) {
                System.out.println("Letter " + a.getKey() + " = " + a.getValue());
        }
    }
}
