/**
 * Created by amour on 09.06.2017.
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        for (int i = 0; i < n; i++){
            System.out.println(list.get(i));
        }
    }
}