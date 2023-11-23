package vehicle;

public class Motorcycle extends Vehicle{

//    private hasSidecar sidecar;

    private boolean sidecar;
//    public Motorcycle(String make,int plate,String color, VehicleCategory category,boolean sidecar) {
//        super(make,plate,color,category);
//        this.sidecar = sidecar;
//    }

    public Motorcycle(String make, String plate, String color, VehicleType category, boolean sidecar) {
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }
}
