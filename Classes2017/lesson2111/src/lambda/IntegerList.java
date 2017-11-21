package lambda;

/**
 * Created by amour on 21.11.2017.
 */
public class IntegerList{
    private static final int MAX_COUNT = 10;
    private int[] list = new int[MAX_COUNT];

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;

    public int[] getList() {
        return list;
    }
    public void addElement(int i){
        list[count] = i;
        count++;
    }
    public void add(int ... a){
        for (int i = 0; i < a.length; i++){
            list[i] = a[i];
            setCount(i + 1);
        }
    }
    public IntegerList(){
    }
    public void printList(){
        for (int i = 0; i < count; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public IntegerList map(Function function) {
        IntegerList listMap = new IntegerList();
        for(int i =0 ; i < count; i++){
            listMap.addElement(function.apply(list[i]));
        }
        return listMap;
    }
    public  IntegerList filter(Predicate predicate){
        IntegerList listTest = new IntegerList();
        for(int i =0 ; i < count; i++){
            if(predicate.test(list[i])){
                listTest.addElement(list[i]);
            }
        }
        return listTest;
    }
}
