import entities.Car;
import entities.ParkingPlace;

public class Main {
    public static void main(String[] args) {
        ParkingPlace parking1 = new ParkingPlace("Parking #1");
        ParkingPlace parking2 = new ParkingPlace("Parking #2");
        Car car1 = new Car("MATIZ","G023QD");
        Car car2 = new Car("BMW", "A666AA");
        car1.toParking(parking1);
        car2.toParking(parking2);
        car1.fromParking(car1.getParking());
    }
}
