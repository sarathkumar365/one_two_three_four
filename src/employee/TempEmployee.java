package employee;

import contracts.Contract;

import java.security.PublicKey;

public class TempEmployee extends Employee implements Contract {

    private int hourlySalary;
    private int accumulatedHours;

    private boolean isPermanant;
    public TempEmployee(int hourlySalary,int accumulatedHours) {
        super();
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    @Override
    public double accumulatedSalary(Employee employee
    ){
        return hourlySalary * accumulatedHours;
    }

    @Override
    public int getHourlySalary () {
        return  this.hourlySalary;
    }

    @Override
    public int getAccumulatedHours() {
        return  this.accumulatedHours;
    }
    @Override
    public void signContract(Contract contract) {

    }

    @Override
    public boolean getIsMarried () {
        return  false;
    }

    @Override
    public int getNumberOfChildren() {
        return  0;
    }

    @Override
    public int getDaysWorked() {
        return 0;
    }

    public double getFixedMonthlySalary(){
        return 0;
    }
}
