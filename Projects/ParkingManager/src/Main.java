import entities.Car;
import entities.ParkingPlace;

public class Main {
    public static void main(String[] args) {
        ParkingPlace parking1 = new ParkingPlace("Parking #1");
        ParkingPlace parking2 = new ParkingPlace("Parking #2");
        Car car1 = new Car("MATIZ","G023QD");
        Car car3 = new Car("MATIZ","J111QD");
        Car car4 = new Car("MATIZ","B063QD");
        Car car5 = new Car("MATIZ","Q023SW");
        Car car2 = new Car("BMW", "A666AA");
        car1.toParking(parking1);
        car2.toParking(parking2);
        car3.toParking(parking1);
        car4.toParking(parking1);
        car5.toParking(parking1);
        car1.fromParking(car1.getParking());
        car2.fromParking(car2.getParking());
        car1.toParking(parking1);
    }
}
