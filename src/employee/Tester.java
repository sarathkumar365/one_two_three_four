package employee;

public class Tester extends Employee {
    private int nbBugs;

    public Tester(String name,int birth_year,double monthly_income, double rate, int nbBugs) {
        super(name,birth_year,monthly_income,rate);
        this.nbBugs = nbBugs;
    }
}
