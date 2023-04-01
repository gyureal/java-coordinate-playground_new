package injectFuel;

import injectFuel.car.Car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private List<Car> cars = new ArrayList<>();
    private static RentCompany rentCompany;

    private RentCompany() {
    }

    public static RentCompany create() {
        if (rentCompany == null) {
            rentCompany = new RentCompany();
        }
        return rentCompany;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {

        String result = "";
        for (Car car: cars) {
            result +=  car.getClass().getSimpleName() + " : "+ car.getFuel() + " \n\r";
        }
        return result;
    }

}
