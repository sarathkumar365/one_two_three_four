package employee;

import contracts.Contract;
import vehicle.Car;
import vehicle.Vehicle;

import java.time.LocalDate;

public class Employee {
    private String name;
    private  int birth_year;
    private double monthly_income;

    private int age;
    private  double rate;

    private Vehicle vehicle;

    private Contract contract;


    public Employee(String name,int birth_year,double monthly_income,double rate){
        this.name  = name;
        this.birth_year = birth_year;
        setMonthly_income(monthly_income);
        setRate(rate);
    }

    public Employee(String name,int birth_year,double rate){
        this.name  = name;
        this.birth_year = birth_year;
    }

    public Employee() {

    }


    // GETTERS

    // set contract
    public void signContract(Contract contract) {
        this.contract = contract;
    }

    public Contract getContract() {
        return contract;
    }

    public String getName () {
        return this.name;
    }
    public int getCurrentAge() {
        int age = calculateAge(this.birth_year);
        this.age = age;
        return  age;
    }
    public double getMonthly_income() {
        return monthly_income;
    }
    public double getRate() {
        return rate;
    }

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

    public double getBaseYearlyIncome () {
        return ( 12 * getMonthly_income() ) * getRate();
    }

    // Display initialization message
    public void displayInitializationMessage() {

        System.out.println("We have a new employee: " + this.name);
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

        if(employee.vehicle instanceof Car) {
            System.out.println("Employee has a Car");
        } else {
            System.out.println("Employee has a Motorcycle");
        }

        System.out.println("- make: " + employee.vehicle.getMake() );
        System.out.println("- plate: " + employee.vehicle.getPlate());
        System.out.println("- color: " + employee.vehicle.getColor());

        if(employee.vehicle instanceof Car) {
            System.out.println("- category: " + employee.vehicle.getVehicleCategory());
            System.out.println("- gear type: " +  ((Car) employee.vehicle).getGearType());
//            System.out.println("- type: " +  ((Car) employee.vehicle).getCarType());
            System.out.println("- type: " +  ((Car) employee.vehicle).getCarType());
        } else {
            System.out.println("- category: " + employee.vehicle.getCategory());
        }

        if(employee instanceof Manager) {
            System.out.println("Name: " + name + ",has an occupation rate: " + employee.getRate() + "%" +
                    " He/She travelled "+
                    ((Manager) employee).getNbTravelDays() + " days and has brought " +
                    ((Manager) employee).getNbClients() + " new clients");

            System.out.println("His/Her estimated annual income is " +
                    ((Manager) employee).calcAnnualIncome(((Manager) employee).
                            getNbTravelDays(),((Manager) employee).getNbClients(),employee));
        }

        if(employee instanceof Programmer) {
            System.out.println("Name: " + name + ",has an occupation rate: " + employee.getRate() + "%" +
                    " and completed "+ ((Programmer) employee).getNbProjects() + " projects.");

            System.out.println("His/Her estimated annual income is " + ((Programmer) employee).calcAnnualIncome());
        }

        if(employee instanceof Tester) {
            System.out.println("Name: " + name + ",has an occupation rate: " + employee.getRate() + "%" +
                    " and corrected "+ ((Tester) employee).getNbBugs() + " bugs");

            System.out.println("His/Her estimated annual income is " + ((Tester) employee).calcAnnualIncome());
        }

    }

    public void displayContractInfo(Employee employee) {

        boolean isMarried = employee.contract.getIsMarried();
        int noOfChildren = employee.contract.getNumberOfChildren();

        String str = isMarried ? "he is married and he/she has " + noOfChildren + " children." : "he is not married and he/she has "
                + noOfChildren + " children.";


        switch (employee) {
            case Manager manager -> {
                System.out.println(name + ",is a Manager." + str);
                System.out.println("He/She has worked for " + employee.contract.getDaysWorked() + " days and upon contract his/her monthly salary is " +
                        employee.contract.getFixedMonthlySalary());
            }
            case Tester tester -> {
                System.out.println(name + ",is a Tester." + (str));
                System.out.println("He/She has worked for " + employee.contract.getDaysWorked() + " days and upon contract his/her monthly salary is " +
                        employee.contract.getFixedMonthlySalary());
            }
            case Programmer programmer -> {
                if (employee.contract instanceof TempEmployee) {
                    System.out.println(name + ",is a Programmer. he is a  temporary employee with " + employee.contract.getHourlySalary() + " hourly salary " +
                            "and he has worked for " + employee.contract.getAccumulatedHours() + " hours");
                    return;
                }
                System.out.println(name + ",is a Tester." + (str));
                System.out.println("He/She has worked for " + employee.contract.getDaysWorked() + " days and upon contract his/her monthly salary is " +
                        employee.contract.getFixedMonthlySalary());
            }
            case null, default -> {
            }
        }

    }

    public void contractInfo (Employee employee) {
        displayContractInfo(employee);
    }

}
