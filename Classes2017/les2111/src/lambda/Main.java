package lambda;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by amour on 21.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        IntegerList list = new IntegerList();
        list.add(12,12,44,55,4,10003,5555555,100,999,444);
        Function function = i -> {
            int a = 0;
            while (i > 0){
                a += i%10;
                i /=10;
            }
            return a;
        };

        IntegerList newList3 = list.map(function);
        Predicate predicate = i -> {
            if(i % 2 != 0){
                return true;
            }
            return false;
        };

        Predicate predicate2 = i -> {
            if(i % 2 == 0){
                return true;
            }
            return false;
        };

        IntegerList newList2 = newList3.filter(predicate2);
        IntegerList newList = newList3.filter(predicate);
        list.printList();
        newList3.printList();
        newList.printList();
        newList2.printList();

    }
}
