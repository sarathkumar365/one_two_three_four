package employee;

import java.time.LocalDate;

public class Employee {
    private String name;
    private  int birth_year;
    private double monthly_income;
    private  double rate;


    public Employee(String name,int birth_year,double monthly_income,double rate){
        this.name  = name;
        this.birth_year = birth_year;
        setMonthly_income(monthly_income);
        setRate(rate);
        displayInitializationMessage();

    }

    // GETTERS
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

    // SETTERS
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

    // annual income calculate method
    public double calcAnnualIncome() {
        return (12 * monthly_income ) * rate;
    }

}
