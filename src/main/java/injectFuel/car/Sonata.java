package injectFuel.car;

public class Sonata extends Car{

    private static long FUEL_EFFICIENCY = 10;

    public Sonata(long distance) {
        super(distance);
        calculateFuel();
    }
    @Override
    long calculateFuel() {
        this.fuel = distance / FUEL_EFFICIENCY;
        return this.fuel;
    }
}
