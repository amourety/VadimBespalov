import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by amour on 02.05.2017.
 */
public class CheckIfEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]([-._]*[0-9a-zA-Z])*)@([a-zA-Z]+\\.)+([a-zA-Z])+$");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        if (matcher.matches())
            System.out.println("email адрес");
        else
            System.out.println("Не email адрес");
    }
}
