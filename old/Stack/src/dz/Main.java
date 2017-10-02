package dz;

/**
 * Created by amour on 14.02.2017.
 */
public class Main {

    public static void main(String[] args) {
	    Stack a = new Stack(100);
        a.push(1);
        a.push(2);
        a.push(3);
        System.out.println(a.toString());
        System.out.println(a.size());
        a.pop();
        System.out.println(a.toString());
    }
}
