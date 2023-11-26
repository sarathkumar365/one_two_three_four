package vehicle;

public class Car extends  Vehicle{

    private GearType gear;
    private CarType carType;

    // Constructor
    public Car(String make, String plate,String color, VehicleCategory category,GearType gear, CarType carType) {
        super(make, plate,color, category);
        this.gear = gear;
        this.carType = carType;
    }

    public GearType getGearType() {
        return this.gear;
    }

    public CarType getCarType() {
        return this.carType;
    }
}
