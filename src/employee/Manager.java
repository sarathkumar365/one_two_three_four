package employee;

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

    public double calcAnnualIncome(int nbTravelDays, int nbClients) {
        double normal_salary = (12 * getMonthly_income() ) * getRate()  ;
        return normal_salary + GAIN_FACTOR_CLIENT + GAIN_FACTOR_TRAVEL;
    }



}
