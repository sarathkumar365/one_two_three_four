import contracts.Contract;
import employee.*;
import vehicle.Car;
import vehicle.Motorcycle;

import java.util.ArrayList;
import java.util.List;

public class allTests {

    //        static double workingDaysPerMonth = 20.0;
    double workingDaysPerMonth = 20.0;
    static List<Employee> employees = new ArrayList<>();

    //    Employee constructors
    // Manager: name, birthYear, nbClients, nbTravelDays, rate
    // Programmer: name, birthYear, nbProjects, rate
    // Tester: name, birthYear, nbBugs, rate
    static void hireTest1() {
        employees.add(new Manager("Serge", 1985, 30, 4,0));
        employees.add(new Manager("Cindy", 1974, 20, 6, 80));
        employees.add(new Programmer("Paul", 1993, 3, 75));
        employees.add(new Tester("Pierre", 1987, 124, 50));
        employees.add(new Programmer("Matt", 1981, 5, 110));
        employees.add(new Programmer("Sarah", 1986, 3,0));
    }


    static void hireTest2(Motorcycle m1, Motorcycle m2, Car vt1, Car vt2,Car vt3, Car vt4) {
        employees.clear();
        employees.add(new Manager("Serge", 1985, 30, 4, vt1));
        employees.add(new Manager("Cindy", 1974, 20, 6, 80, vt2));
        employees.add(new Programmer("Paul", 1993, 3, 75, m1));
        employees.add(new Tester("Pierre", 1987, 124, 50, m2));
        employees.add(new Programmer("Matt", 1981, 5, 110, vt4));
        employees.add(new Programmer("Sarah", 1986, 3, vt3));

        for (Employee employee : employees) {
            System.out.println("-------------------------");
            employee.displayData(employee);
            System.out.println("-------------------------");
        }
    }

    static void hireTest3(Motorcycle m1, Motorcycle m2, Car vt1, Car vt2, Car vt3, Car vt4) {
        employees.clear();

        Employee Serge = new Manager("Serge", 1985, 30, 4, vt1);
        Employee Cindy = new Manager("Cindy", 1974, 20, 6, 80, vt2);
        Employee Paul = new Programmer("Paul", 1993, 3, 75, m1);
        Employee Pierre = new Tester("Pierre", 1987, 124, 50, m2);
        Employee Matt = new Programmer("Matt", 1981, 5, 110, vt4);
        Employee Sarah = new Programmer("Sarah", 1986, 3, vt3);

        // Permanent: nbChildren, married, monthlySalary, bonusPerChildPerMonth, accumulatedDays
        // Temporary: hourlySalary, accumulatedHours
        Contract p1 = new PermanentEmployee(2, true, 6000, 200, 17);
        Contract p2 = new PermanentEmployee(3, false, 5000, 150, 19);
        Contract t1 = new TempEmployee(60, 30);
        Contract t2 = new TempEmployee(50, 60);
        Contract p3 = new PermanentEmployee(1, true, 4000, 100, 20);
        Contract p4 = new PermanentEmployee(4, true, 4500, 100, 19);

        Serge.signContract(p1);
        Cindy.signContract(p2);
        Paul.signContract(t1);
        Matt.signContract(t2);
        Pierre.signContract(p3);
        Sarah.signContract(p4);

        employees.add(Serge);
        employees.add(Cindy);
        employees.add(Paul);
        employees.add(Pierre);
        employees.add(Matt);
        employees.add(Sarah);

        for (Employee employee : employees) {
            System.out.println("-------------------------");
            employee.displayData(employee);
            System.out.println("-------------------------");
        }

        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");
        for (Employee employee : employees) {
            employee.contractInfo(employee);
        }
        System.out.println("-------------------------");

//         updating Matt's contract
        Contract p5 = new PermanentEmployee(1, true, 5000, 200, 30);
        Matt.signContract(p5);

        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");
        for (Employee employee : employees) {
            employee.contractInfo(employee);
        }
        System.out.println("-------------------------");

    }
}
