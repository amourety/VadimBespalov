package main.utils;
import java.util.Scanner;
/**
 * Created by amour on 15.03.2017.
 */
public class UserInteractor implements UserInteractorInterface {
    Scanner scanner;
    public String readCommand(){
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public void print(String a){
        System.out.println(a);
    }

}
