import java.util.Iterator;

/**
 * Created by amour on 17.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("1");
        ls.addAfter("2", "1");
        System.out.println(ls.has("2"));
        ls.remove("2");
        System.out.println(ls.has("2"));
        ls.add("zzz");
        ls.addAfter("zsz", "zzz");
        ls.add("zzz");
        ls.add("zzz");
        ls.add("zzz");
        ls.addAfter("2","1");
        MyIterator it = ls.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().getData());
        }
    }
}
