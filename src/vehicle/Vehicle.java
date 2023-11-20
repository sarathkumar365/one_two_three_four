package vehicle;

public class Vehicle {
    private String make;
    private int plate;
    private String color;
    private VehicleCategory category;
    public Vehicle(String make,int plate,String color, VehicleCategory category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleCategory getCategory() {
        return category;
    }

    public void setCategory(VehicleCategory category) {
        this.category = category;
    }
}
