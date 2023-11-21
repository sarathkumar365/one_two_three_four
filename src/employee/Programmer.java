package employee;

public class Programmer extends Employee{
    private int nbProjects;
    private int GAIN_FACTOR_PROJECTS = 200;
    public Programmer(String name,int birth_year,double monthly_income, double rate, int nbProjects) {
        super(name,birth_year,monthly_income,rate);
        this.nbProjects = nbProjects;
    }
}
