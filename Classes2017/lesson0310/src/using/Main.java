package task1.using;

/**
 * Created by amour on 03.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Vadim");
        human.setAge(19);
        System.out.println(human.getName() + " " + human.getAge());
        Human human1 = new Human("Vadim", 20);
        System.out.println(human1.getName() + " " + human1.getAge());
    }
}
