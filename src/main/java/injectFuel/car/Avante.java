package injectFuel.car;

public class Avante extends Car {

    private static long FUEL_EFFICIENCY = 15;

    public Avante(long distance) {
        super(distance);
        calculateFuel();
    }

    @Override
    long calculateFuel() {
        this.fuel = distance / FUEL_EFFICIENCY;
        return this.fuel;
    }
}
