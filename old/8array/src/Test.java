/**
 * Created by amour on 01.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        EndlessArrayContainer<String> dd = new EndlessArrayContainer<String>();
        dd.add("11111111111");
        dd.add("22222222222");
        System.out.println(dd.get(0));
        System.out.println(dd.get(1));
    }
}
