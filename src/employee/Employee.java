package employee;

import vehicle.Car;
import vehicle.Vehicle;

import java.time.LocalDate;

public class Employee {
    private String name;
    private  int birth_year;
    private double monthly_income;
    private  double rate;

    private Vehicle vehicle;


    public Employee(String name,int birth_year,double monthly_income,double rate){
        this.name  = name;
        this.birth_year = birth_year;
        setMonthly_income(monthly_income);
        setRate(rate);
//        displayInitializationMessage();

    }

    public Employee(String name,int birth_year,double rate){
        this.name  = name;
        this.birth_year = birth_year;
//        displayInitializationMessage();

    }

    // GETTERS

    public String getName () {
        return this.name;
    }
    public int getCurrentAge() {
        int age = calculateAge(this.birth_year);

        return  age;
    }
    public double getMonthly_income() {
        return monthly_income;
    }
    public double getRate() {
        return rate;
    }

//    public String getVehicle() {
//        return vehicle.getMake();
//    }

    // SETTERS
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }
    public void setMonthly_income(double monthly_income) {
        this.monthly_income = monthly_income;
    }
    public void setRate(double rate) {
//        this.occupation_rate = occupation_rate;

        if(rate < 10) {
            this.rate = 10;
        } else if (rate > 100) {
            this.rate = 100;
        } else {
            this.rate = 100;
        }
    }

    // calculate birthdate
    public int calculateAge(int birthYear){
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        return currentYear - birthYear;
    }

    // Display initialization message
    public void displayInitializationMessage() {

        System.out.println("We have a new employee: " + this.name);
    }

    public void displayInitializationMessage(Employee employee) {

        System.out.println("We have a new employee: " + this.name + ", a manager");
    }
    // annual income calculate method
    public double calcAnnualIncome() {
        return (12 * monthly_income ) * rate;
    }

    public void displayData(Employee employee) {

        if (employee instanceof Manager) {
            System.out.println("Name: " + name + ",a Manager");
        } else if (employee instanceof Tester) {
            System.out.println("Name: " + name + ",a Tester");
        } else if (employee instanceof Programmer) {
            System.out.println("Name: " + name + ",a Programmer");
        }
        System.out.println("Age: " + getCurrentAge());
        System.out.println("Employee has a car");
        System.out.println("- make: " + employee.vehicle.getMake() );
        System.out.println("- plate: " + employee.vehicle.getPlate());
        System.out.println("- color: " + employee.vehicle.getColor());
        System.out.println("- category: " + employee.vehicle.getVehicleCategory());

        System.out.println("- gear type: " +  ((Car) employee.vehicle).getGearType());
        System.out.println("- type: " + ((Car) employee.vehicle).getGearType());

//        if(employee instanceof Manager){
//            System.out.println("Name: " + name + ",a Manager");
//            System.out.println("Age: " + getCurrentAge());
//            System.out.println("Employee has a car");
//            System.out.println("- make: " + employee.vehicle.getMake() );
//            System.out.println("- plate: " + employee.vehicle.getPlate());
//            System.out.println("- color: " + employee.vehicle.getColor());
//            System.out.println("- category: " + employee.vehicle.getVehicleCategory());
//
//            System.out.println("- gear type: " +  ((Car) employee.vehicle).getGearType());
//            System.out.println("- type: " + ((Car) employee.vehicle).getGearType());
//        }

//        if(employee instanceof Tester){
//            System.out.println("Name: " + name + ",a Tester");
//            System.out.println("Age: " + getCurrentAge());
//            System.out.println("Employee has a car");
//            System.out.println("- make: " + employee.vehicle.getMake() );
//            System.out.println("- plate: " + employee.vehicle.getPlate());
//            System.out.println("- color: " + employee.vehicle.getColor());
//            System.out.println("- category " + employee.vehicle.getVehicleCategory());
//            System.out.println("- gear type: " + ((Car) employee.vehicle).getGearType());
//
//
//        }

//        if(employee instanceof Programmer){
//            System.out.println("Name: " + name + ",a Programmer");
//            System.out.println("Age: " + getCurrentAge());
//            System.out.println("Employee has a car");
//            System.out.println("- make: " + employee.vehicle.getMake() );
//            System.out.println("- plate: " + employee.vehicle.getPlate());
//            System.out.println("- color: " + employee.vehicle.getColor());
//            System.out.println("- category " + employee.vehicle.getVehicleCategory());
//            System.out.println("- gear type: " + ((Car) employee.vehicle).getGearType());
//
//
//        }
    }
}
