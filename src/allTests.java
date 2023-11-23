import employee.Employee;
import employee.Manager;
import employee.Programmer;
import employee.Tester;
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
}
