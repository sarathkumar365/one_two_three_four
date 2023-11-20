package employee;

public class Programmer extends Employee{
    private int nbProjects;

    public Programmer(String name,int birth_year,double monthly_income, double rate, int nbProjects) {
        super(name,birth_year,monthly_income,rate);
        this.nbProjects = nbProjects;
    }
}
