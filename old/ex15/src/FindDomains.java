

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by amour on 02.05.2017.
 */
public class FindDomains {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\amour\\Desktop\\data.txt"))){
            Pattern pattern = Pattern.compile("([a-zA-Z]+\\.)+([a-zA-Z])+");
            String string = in.readLine();
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                System.out.println(string.substring(matcher.start(), matcher.end()));
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (PatternSyntaxException ex) {

        }
    }
}
