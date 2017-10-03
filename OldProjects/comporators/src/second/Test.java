package second;

/**
 * Created by amour on 01.03.2017.
 */
public class Test
{
    public static void main(String[] args){
        Track t1 = new Track();
        t1.setName("Vadim");
        t1.setAuthor("Vadim");
        t1.setDuration(10);
        System.out.println(t1.getAuthor() + "-" + t1.getName() + " " + t1.getDuration());
    }
}
