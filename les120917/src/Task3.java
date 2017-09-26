/**
 * Created by amour on 12.09.2017.
 */
//разворот массива
public class Task3 {
    public static void main(String[] args){
        int a[] = {1,6,7,9,10};
        for (int i = 0; i < a.length/2; i++){
            int t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
