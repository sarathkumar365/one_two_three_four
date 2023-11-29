package employee;

import contracts.Contract;
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
        super(name,birth_year,0,100);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        setVehicle(car);
        displayInitializationMessage();
    }


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

//    @Override
//    public boolean getIsMarried(){
//
//    }
    public int getNbTravelDays() {
        return this.nbTravelDays;
    }

    public int getNbClients() {
        return this.nbClients;
    }

//    public double calcAnnualIncome(int nbTravelDays, int nbClients) {
//        double normal_salary = (12 * getMonthly_income() ) * getRate();
//        System.out.println(normal_salary);
//        return normal_salary + (GAIN_FACTOR_CLIENT * nbClients) + (GAIN_FACTOR_TRAVEL * nbTravelDays);
//    }

        public double calcAnnualIncome(int nbTravelDays, int nbClients,Employee employee) {
//            double normal_salary = (12 * getMonthly_income() ) * getRate();
            double normal_salary = 0;
            if(getContract() != null) {
//                System.out.println(getContract().accumulatedSalary()+"-"+getRate());

//                System.out.println("acc-sal-" + getContract().accumulatedSalary());
                // get monthly income
                normal_salary = ( getContract().accumulatedSalary(employee) );

            }
            System.out.println(normal_salary);
            return normal_salary + (GAIN_FACTOR_CLIENT * nbClients) + (GAIN_FACTOR_TRAVEL * nbTravelDays);
        }

}
