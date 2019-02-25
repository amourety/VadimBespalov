package Task1;

import static Task1.LinkedList.merge;

/**
 * Created by amour on 13.02.2018.
 */
public class Main{
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.addToBegin(4);
        list1.add(5);
        list2.add(1);
        list2.add(3);
        list2.add(10);
        list2.add(20);
        list2.add(111);
        LinkedList<Integer> listResult = merge(list1,list2);
        listResult.printAll();
        listResult.add(-100);
        listResult.add(-44);
        listResult.add(7);
        listResult = listResult.sort();
        listResult.printAll();
    }
}
