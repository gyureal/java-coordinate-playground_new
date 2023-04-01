package injectFuel.car;

public abstract class Car {

    protected long distance;
    // private Integer fuelEfficiency;
    protected long fuel;

    public Car(long distance) {
        this.distance = distance;
    }

    abstract long calculateFuel();

    public long getFuel() {
        return this.fuel;
    }
}
