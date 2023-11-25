package vehicle;

import employee.Employee;

public class Vehicle {
    private String make;
    private String plate;
    private String color;
    private VehicleType category;

    private VehicleCategory v_category;
    public Vehicle(String make,String plate,String color, VehicleType category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    public Vehicle(String make,String plate,String color, VehicleCategory v_category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.v_category = v_category;
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getCategory() {
        return this.category;
    }

    public void setCategory(VehicleType category) {
        this.category = category;
    }

    public VehicleCategory getVehicleCategory() {
        return this.v_category;
    }
}
