/**
 * Created by amour on 22.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        SmoothSorter sm = new SmoothSorter();
        int[] a = {4,3,2,1};
        SmoothSorter.sort(a);

        for(int x: a){
            System.out.print(x + " ");
        }
    }
}
