package itis.lesson260917;

/**
 * Created by amour on 26.09.2017.
 */
public class MainHuman {
    public static void main(String[] args){
        Human h1 = new Human();
        h1.name = "Vadim";
        h1.age = 19;
        h1.height = 1.80;
        Human h2 = new Human();
        h2.name = "Guzel";
        h2.age = 25;
        System.out.println(h1.age);
        System.out.println(h1.grow());

    }
}
