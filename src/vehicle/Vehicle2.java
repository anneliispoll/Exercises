package vehicle;

public class Vehicle2 {

    protected float fuel;
    protected float fuelUsage;
    protected int passenger;

    public Vehicle2(float fuel, float fuelUsage, int passenger) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passenger = passenger;
    }

    public float maxDistance2(float fuel, float fuelUsage, int passenger) {
        return fuel / (fuelUsage * (1 + passenger * 0.05f)) * 100;
    }

    public float maxDistance2() {
        return fuel / (fuelUsage * (1 + passenger * 0.05f)) * 100;
}
}
