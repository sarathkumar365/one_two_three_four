package employee;

import vehicle.Car;
import vehicle.Motorcycle;

public class Programmer extends Employee{
    private int nbProjects;
    private int GAIN_FACTOR_PROJECTS = 200;
    public Programmer(String name,int birth_year,double monthly_income, double rate, int nbProjects) {
        super(name,birth_year,monthly_income,rate);
        this.nbProjects = nbProjects;
    }

    public Programmer(String name, int birth_year, double monthly_income, double rate, Motorcycle motorcycle) {
        super(name,birth_year,monthly_income,rate);
        setVehicle(motorcycle);
    }

    public Programmer(String name, int birth_year, double monthly_income, double rate, Car car) {
        super(name,birth_year,monthly_income,rate);
        setVehicle(car);
    }

    public Programmer(String name, int birth_year, int nbProjects, int rate) {
        super(name, birth_year, nbProjects, rate);
        displayInitializationMessage();
    }

    public Programmer(String name, int birth_year, int nbProjects, Car car) {
        super(name, birth_year, nbProjects, 0);
        displayInitializationMessage();
        setVehicle(car);
    }


    public void displayInitializationMessage() {
        System.out.println("We have a new employee: " + getName() + ", a programmer");
    }
}
