package employee;

public class PermanentEmployee extends Employee {
    private int daysWorked;
    private int noOfWorkingDays = 20;
    private double fixedMonthlySalary ;
    private int noOfChildren;
    private String civilStatus;
    private int monthlyPremium;

    public PermanentEmployee(String name, int birth_year, double monthly_income, double rate,int daysWorked,double fixedMonthlySalary, int noOfChildren,String civilStatus,int monthlyPremium) {
        super(name, birth_year, monthly_income, rate);
        this.daysWorked = daysWorked;
        this.fixedMonthlySalary = fixedMonthlySalary;
        this.noOfChildren = noOfChildren;
        this.civilStatus = civilStatus;
        this.monthlyPremium = monthlyPremium;
    }

    // Getters and Setters
    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public double getFixedMonthlySalary() {
        return fixedMonthlySalary;
    }

    public void setFixedMonthlySalary(double fixedMonthlySalary) {
        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    public int getNumberOfChildren() {
        return noOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.noOfChildren = numberOfChildren;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public double getMonthlyChildAllowance() {
        return monthlyPremium;
    }

    public int setMonthlyChildAllowance(double monthlyChildAllowance) {
        return this.monthlyPremium = (int) monthlyChildAllowance;
    }
}
