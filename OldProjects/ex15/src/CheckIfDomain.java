
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by amour on 02.05.2017.
 */
public class CheckIfDomain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^([a-zA-Z\\-]+\\.)*([a-zA-Z\\-]+)$");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        if (matcher.matches())
            System.out.println("Доменное имя");
        else
            System.out.println("Не доменное имя");
    }
}
