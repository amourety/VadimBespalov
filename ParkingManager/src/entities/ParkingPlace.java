package entities;

import java.time.LocalTime;

public class ParkingPlace {
    private String parkingName;
    private int maxCount = 10;
    private int count = 0;
    private Car[] parkingCars = new Car[maxCount];
    private LocalTime openTime = LocalTime.of(6, 00, 00, 00);
    private LocalTime closeTime = LocalTime.of(22, 00, 00, 00);
    public ParkingPlace(String name) {
        setParkingName(name);
    }
    public void addCarToParking(Car car) {
        if (LocalTime.now().isBefore(closeTime) && LocalTime.now().isAfter(openTime)) {
            if (count < maxCount) {
                int i = 0;
                while (parkingCars[i] != null) {
                    i++;
                }
                parkingCars[i] = car;
                car.setParking(this);

                System.out.println(car.getCarName() + " " + car.getCarNumber() + " parked in parking lot <" + getParkingName() + " " + i + ">");
                count++;

            } else {
                System.err.println("Parking " + getParkingName() + "  is full");
            }
        }
            else{
                System.err.println("Parking " + getParkingName() + " does not work");
            }
        }

    public void removeCarFromParking(Car car) {
        if (LocalTime.now().isBefore(closeTime) && LocalTime.now().isAfter(openTime)) {
            for (int i = 0; i < count; i++) {
                if (parkingCars[i] == car) {
                    parkingCars[i] = null;
                    car.setParking(null);
                    System.out.println(car.getCarName() + " " + car.getCarNumber() + " removed from parking lot <" + getParkingName() + " " + i + ">");
                }
                count--;
            }
        } else {
            System.err.println("Parking " + getParkingName() + " does not work");
        }
    }
    public String getParkingName() {
        return parkingName;
    }
    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

}
