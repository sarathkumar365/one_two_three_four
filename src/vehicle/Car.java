package vehicle;

public class Car extends  Vehicle{

    private GearType gear;
    private CarType type;

    // Constructor
    public Car(String make, int plate,String color, VehicleCategory category,GearType gear, CarType type) {
        super(make, plate,color, category);
        this.gear = gear;
        this.type = type;
    }

}
