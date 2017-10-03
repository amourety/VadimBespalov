/**
 * Created by amour on 06.09.2017.
 */
import java.util.Random;
public class Randomizer {
    public int random(int x){
       Random rand = new Random();
        return rand.nextInt(x);
    }
}
