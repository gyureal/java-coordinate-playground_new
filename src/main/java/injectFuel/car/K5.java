package injectFuel.car;

public class K5 extends Car{
    private static long FUEL_EFFICIENCY = 13;

    public K5(long distance) {
        super(distance);
        calculateFuel();
    }

    @Override
    long calculateFuel() {
        this.fuel = distance / FUEL_EFFICIENCY;
        return this.fuel;
    }
}
