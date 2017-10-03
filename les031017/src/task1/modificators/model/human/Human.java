package task1.modificators.model.human;

import task1.modificators.model.car.Car;

/**
 * Created by amour on 03.10.2017.
 */
public class Human {
    private int age;
    private String name;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private Car car;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void go(){
        System.out.println(name + " is going.");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
