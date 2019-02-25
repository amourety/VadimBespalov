package HomeTask;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by amour on 13.02.2018.
 */
public class Main {
    public static final int NEXT = 10;
    public static void main(String[] args) {
        int[] a = {1, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {3, 0, 0, 0, 0, 0, 0, 0};

        int[] result = sum(a, b);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();

        result = mul(a, b);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
    }
    static int[] mul(int a[], int b[]){
        if (b.length > a.length){
            int[] c = b;
            b = a;
            a = c;
        }
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> allRes = new ArrayList<>();
        int oneCount = 0;
        int tenDegree = 0;
        for (int i = b.length - 1; i >= 0; i--){
            for (int k = a.length - 1; k >= 0; k--){
                int p = b[i] * a[k];
                p += oneCount;
                oneCount = 0;

                if (p >= NEXT){
                    res.add(p % NEXT);
                    oneCount += p / NEXT;
                }else {
                    res.add(p);
                }
            }

            Collections.reverse(res);
            if (oneCount > 0){
                res.add(0, oneCount);
            }
            for (int j = 0; j < tenDegree; j++){
                res.add(0);
            }
            tenDegree++;
            oneCount = 0;
            allRes.add(res);
            res = new ArrayList<>();
        }


        int sum[] = null;
        int previous[] = new int[]{0};
        for (ArrayList<Integer> item : allRes) {
            int[] arr = new int[item.size()];
            for (int k = 0; k < item.size(); k++) {
                arr[k] = item.get(k);
            }

            sum = sum(previous, arr);

            previous = sum;
        }
        return sum;

    }
    static int[] sum(int a[], int b[]){
        if (b.length > a.length){
            int[] c = b;
            b = a;
            a = c;
        }
        b = addZeros(b,a.length);
        int[] res = new int[a.length];
        int oneCount = 0;
        int index = b.length - 1;
        while (index >= 0){
            int s = a[index] + b[index];

            s += oneCount;
            oneCount = 0;

            if (s >= NEXT){
                res[index] = s % NEXT;
                oneCount += s / NEXT;
            }else {
                res[index] = s;
            }

            index--;
            if (index < 0 && oneCount > 0){
                int[] newRes = new int[b.length + 1];
                newRes[0] = 1;
                for (int i = 0; i < res.length; i++){
                    newRes[i+1] = res[i];
                }
                res = newRes;
            }
        }

        return res;
    }

    static int[] addZeros(int[] arr, int len){
        int[] res = new int[len];

        int resIndex = len - 1;
        int arrIndex = arr.length - 1;

        while (arrIndex >= 0){
            res[resIndex] = arr[arrIndex];
            arrIndex--;
            resIndex--;
        }
        return res;
    }
}
