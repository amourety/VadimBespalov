import java.util.Scanner;


/** ИСКЛЮЧЕНИЯ */

public class Main {

    /*
    stack over flow err
        */
    public static void rec(){
        System.out.println("123");
        rec();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()/sc.nextInt()); //ArithmeticEx by zero
        int a [] = new int[Integer.MAX_VALUE]; //OutOfMemoryEr
    }
}
