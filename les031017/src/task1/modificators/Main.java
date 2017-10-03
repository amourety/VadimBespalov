package task1.modificators;

import task1.modificators.model.car.Car;
import task1.modificators.model.human.Human;

/**
 * Created by amour on 03.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Vadim", 19);
        Car car = new Car("MATIZ", "F111E","YELLOW",-10);
        Car car1 = new Car("VAZ", 50);
        human.setCar(car);
        car1.isGoing(1);
        car.isGoing(50);
        car.isGoing(-100);
        car.showInfo(car);
        car.showInfo(car1);
    }
}
