package vehicle;

class Vehicle {

    protected float fuel;
    protected float fuelUsage;
    protected int passenger;

    public Vehicle(float fuel, float fuelUsage, int passenger) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passenger = passenger;
    }

    public float maxDistance() {

        fuelUsage = fuelUsage + fuelUsage * (passenger * 0.05f);
        float maxDistance = fuel / fuelUsage * 100;
        System.out.printf("%.2f", maxDistance);

        return maxDistance;
    }

public static void main(String[] args) {

        Vehicle vehicle = new Vehicle (55.5f, 5.5f, 5);
        vehicle.maxDistance();

    }

}
