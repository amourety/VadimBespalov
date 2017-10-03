package task1.using;

/**
 * Created by amour on 03.10.2017.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }
    public Human(){
        this.age = 0;
        this.name = "DEFAULT_NAME";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        else {
            System.err.println("NOT TRUE");
            this.age = 0;
        }
    }

}
