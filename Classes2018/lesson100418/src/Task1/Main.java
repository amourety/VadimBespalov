package Task1;

import java.util.Scanner;

/**
 * Created by amour on 10.04.2018.
 */
public class Main {
    public static void main(String[] args) {
        //dz
        int n = 9;
        int k = 3;
        int result = 0;
        int[] nodes = {8,0,0,0,0,0,0,0,0};
        result = optimize(nodes,3);
        System.out.println(result);

    }
    static int optimize(int[] nodes, int k) {
        if (k <= 1) {
            for (int i : nodes) {
                if (i > k)
                    throw new IllegalArgumentException("Невозможно оптимизировать дерево");
            }
        }

        int result = 0;

        for (int i = 0; i < nodes.length; i++) {
            while (nodes[i] > k) {
                result += nodes[i] / k;
                nodes[i] -= (nodes[i] / k) * (k - 1);
            }
        }


        return result;
    }
}
