package employee;

import contracts.Contract;

public class PermanentEmployee  extends Employee implements Contract {
    private int accumulatedDays;
    private int noOfWorkingDaysPerMonth = 20;
    private double MonthlySalary;
    private int noOfChildren;
    private String civilStatus;
    private int bonusPerChildPerMonth;

    private boolean isMarried;

public PermanentEmployee(int noOfChildren,boolean isMarried, double MonthlySalary, int bonusPerChildPerMonth, int accumulatedDays) {
    super();
    this.noOfChildren = noOfChildren;
    this.isMarried = isMarried;
    this.MonthlySalary = MonthlySalary;
    this.bonusPerChildPerMonth = bonusPerChildPerMonth;
    this.accumulatedDays = accumulatedDays;
}


    // Getters and Setters

    @Override
    public int getDaysWorked() {
        return accumulatedDays;
    }

    public void setDaysWorked(int daysWorked) {
        this.accumulatedDays = accumulatedDays;
    }

    @Override
    public double getFixedMonthlySalary() {
        return MonthlySalary;
    }
    @Override
    public int getHourlySalary () {
        return  0;
    }

    public void setFixedMonthlySalary(double fixedMonthlySalary) {
        this.MonthlySalary = MonthlySalary;
    }

    @Override
    public boolean getIsMarried () {
    return this.isMarried;
    }

    @Override
    public int getNumberOfChildren() {
        return this.noOfChildren;
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
        return bonusPerChildPerMonth;
    }

    public int setMonthlyChildAllowance(int bonusPerChildPerMonth) {
        return this.bonusPerChildPerMonth = bonusPerChildPerMonth;
    }

    @Override
    public int getAccumulatedHours() {
        return  0;
    }

     @Override
    public double accumulatedSalary(Employee employee) {
         System.out.println("permenant emp accumulatedSal invoked");
         return  (12 * getFixedMonthlySalary() ) * employee.getRate();
}

    @Override
    public void signContract(Contract contract) {

    }
}
