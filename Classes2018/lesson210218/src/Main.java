import Task1.Point;
import Task1.Segment;

/**
 * Created by amour on 21.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        Segment segment = new Segment(new Point(0,0),new Point(1,-1));
        System.out.println(segment.isTop(new Point(0,1)));
        System.out.println(segment.isBottom(new Point(-1,-1)));

    }
}
