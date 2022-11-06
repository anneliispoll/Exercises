package vehicle;

public class Car extends Vehicle {

    boolean airConditioner;

    public Car (float fuel, float fuelUsage, int passenger, boolean airConditioner){
        super(fuel, fuelUsage, passenger);
        this.airConditioner = airConditioner;
    }

    @Override
    public float maxDistance() {
        float airConditionerAdd;

        if(airConditioner){
            airConditionerAdd = 1.1f;
        } else {
            airConditionerAdd = 1f;
        }

        float usage = fuelUsage + fuelUsage * (passenger * 0.05f);
        float maxDistance = fuel / (usage * airConditionerAdd) * 100;
        return maxDistance;
    }
}
