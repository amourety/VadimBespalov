/**
 * Created by amour on 09.06.2017.
 */
import java.util.Comparator;
public class Numbers {
    int number;
    int quantity;
    public void Number(int number){
        this.number = number;
        int q = 0;
        while (number > 0){
            if(number % 10 == 5){
                q++;
            }
            number /= 10;
        }
        this.quantity = q;
    }

    public int getNumber() {
        return number;
    }

    public int getQuantity() {
        return quantity;
    }

    public static Comparator<Numbers> quantityComparator = new Comparator<Numbers>() {
        @Override
        public int compare(Numbers numbers, Numbers t1) {
            return t1.getQuantity() - numbers.getQuantity();
        }
    };
}
