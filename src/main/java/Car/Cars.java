package Car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars = new ArrayList<Car>();

    public void Cars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void play() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> cars() {
        return this.cars;
    }
}
