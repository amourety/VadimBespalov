package task1.modificators.model.car;

/**
 * Created by amour on 03.10.2017.
 */
public class Car {
    public static final String DEFAULT = "DEFAULT_CAR";
    String carModel = DEFAULT;
    String carNumber = DEFAULT;
    int carHorsePower = 0;
    String carColour = DEFAULT;
    int carMileage = 0;

    public Car() {
        this.carModel = DEFAULT;
        this.carNumber = DEFAULT;
        this.carColour = DEFAULT;
        this.carHorsePower = 0;
        this.carMileage = 0;
    }

    public Car(String carModel, int carHorsePower) {
        setCarModel(carModel);
        setCarHorsePower(carHorsePower);
    }

    public Car(String carModel, String carNumber, String carColour, int carHorsePower) {
        setCarHorsePower(carHorsePower);
        setCarModel(carModel);
        setCarNumber(carNumber);
        setCarColour(carColour);
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        if (carNumber.length() == 6) {
            this.carNumber = carNumber;
        } else {
            System.out.println("WRONG NUMBER X000XX " + this.getCarModel() + "\n");
            this.carNumber = "A000AA";
        }
    }

    public int getCarHorsePower() {
        return carHorsePower;
    }

    public void setCarHorsePower(int carHorsePower) {
        if (carHorsePower >= 0) {
            this.carHorsePower = carHorsePower;
        } else {
            System.out.println("WRONG HORSEPOWER " + this.getCarModel() + "\n");
            this.carHorsePower = 0;
        }
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public int getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(int carMileage) {
        if (carMileage >= 0) {
            this.carMileage = carMileage;
        } else {
            System.out.println("WRONG MILEAGE " + this.getCarModel() + "\n");
            this.carMileage = 0;
        }
    }

    public void isGoing(int n) {
        setCarMileage(this.carMileage + n);
    }

    public void showInfo(Car car) {
        System.out.println(car.carModel);
        System.out.println("CAR MODEL: " + car.getCarModel() + "\n" + "CAR NUMBER: " + car.getCarNumber() + "\n" + "CAR COLOUR: " + car.getCarColour() + "\n" + "CAR HORSEPOWER: " + car.getCarHorsePower() + "\n" + "CAR MILEAGE: " + car.getCarMileage() + "\n");
    }
}
