package employee;

import contracts.Contract;
import vehicle.Motorcycle;

import java.lang.module.Configuration;

public class Tester extends Employee {
    private int nbBugs;

    private int GAIN_FACTOR_ERROR = 10;

    public Tester(String name,int birth_year,double monthly_income, double rate, int nbBugs) {
        super(name,birth_year,monthly_income,rate);
        this.nbBugs = nbBugs;
        displayInitializationMessage();
    }

//    public Tester(String name, int birth_year, double monthly_income, double rate, Motorcycle m2) {
//        super(name,birth_year,monthly_income,rate);
//        setVehicle(m2);
//        displayInitializationMessage();
//    }

    public Tester(String name, int birth_year, int nbBugs, double rate, Motorcycle m2) {
        super(name,birth_year,0,rate);
        this.nbBugs = nbBugs;
        setVehicle(m2);
        displayInitializationMessage();
    }

    public Tester(String name, int birth_year, int nbBugs, int rate) {
        super(name, birth_year, nbBugs, rate);
        displayInitializationMessage();
    }

    public void displayInitializationMessage() {
        System.out.println("We have a new employee: " + getName() + ", a tester");
    }

    public int getNbBugs() {
        return  this.nbBugs;
    }

    public double calcAnnualIncome() {
//        int accumulatedSalary = Contract.
        return (GAIN_FACTOR_ERROR * getNbBugs());
    }
}
