package employee;

import vehicle.Car;

import java.security.PublicKey;

public class Manager extends Employee {
    private int nbTravelDays;
    private int nbClients;

    private int GAIN_FACTOR_CLIENT = 500;
    private int GAIN_FACTOR_TRAVEL = 100;

    public Manager(String name,int birth_year,double monthly_income, double rate, int nbTravelDays,int nbClients) {
        super(name,birth_year,monthly_income,rate);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    public Manager(String name, int birth_year, int  nbClients, int nbTravelDays,int rate) {
        super(name,birth_year,0,rate);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        displayInitializationMessage();
    }

    public Manager(String name, int birth_year, int  nbClients, int nbTravelDays, Car car) {
        super(name,birth_year,0,0);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        setVehicle(car);
        displayInitializationMessage();
    }

//    public Manager(String name, int birth_year, int  monthly_income, int rate,int nbTravelDays, Car car) {
//        super(name,birth_year,0,0);
//        this.nbTravelDays = nbTravelDays;
//        setVehicle(car);
//        displayInitializationMessage();
//    }

    public Manager(String name, int birth_year, int  nbClients, int nbTravelDays,int rate, Car car) {
        super(name,birth_year,0,rate);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        setVehicle(car);
        displayInitializationMessage();
    }

    @Override
    public void displayInitializationMessage() {
        System.out.println("We have a new employee: " + getName() + ", a manager");
    }

    public int getNbTravelDays() {
        return this.nbTravelDays;
    }

    public int getNbClients() {
        return this.nbClients;
    }

    public double calcAnnualIncome(int nbTravelDays, int nbClients) {

        double normal_salary = (12 * getMonthly_income() ) * getRate();
        return normal_salary + (GAIN_FACTOR_CLIENT * nbClients) + (GAIN_FACTOR_TRAVEL * nbTravelDays);
    }


}
