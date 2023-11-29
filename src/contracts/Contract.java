package contracts;

import employee.Employee;

public interface Contract {
//    private PermenantContract permenantContract;
//    private TempContarct tempContarct;
//    public Contract(PermenantContract permenantContract , TempContarct tempContarct) {
//        this.permenantContract = permenantContract;
//        this.tempContarct = tempContarct;
//        displayInitializationMessage();
//    }

    double accumulatedSalary(Employee employee);

    void signContract(Contract contract);

    public boolean getIsMarried();

    public int getNumberOfChildren();

    public  int getDaysWorked();

    public double getFixedMonthlySalary();

    public int getHourlySalary();


    public int getAccumulatedHours();
}
