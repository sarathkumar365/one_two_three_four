package employee;

public class Manager extends Employee {
    private int nbTravelDays;
    private int nbClients;

    public Manager(String name,int birth_year,double monthly_income, double rate, int nbTravelDays,int nbClients) {
        super(name,birth_year,monthly_income,rate);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }


}
