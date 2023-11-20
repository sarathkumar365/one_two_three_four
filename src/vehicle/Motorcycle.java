package vehicle;

public class Motorcycle extends Vehicle{

    private hasSidecar sidecar;
    public Motorcycle(String make,int plate,String color, VehicleCategory category,hasSidecar sidecar) {
        super(make,plate,color,category);
        this.sidecar = sidecar;
    }
}
