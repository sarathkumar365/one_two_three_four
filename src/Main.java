import employee.Employee;
import employee.Manager;
import employee.Programmer;
import employee.Tester;
import vehicle.*;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Scanner read = new Scanner(System.in);

        // constructor for Motorcycle
        // make, plate, color, category, sidecar
        Motorcycle m1 = new Motorcycle("Kawasaki", "Custom Plate", "Yellow", VehicleType.RACE, false);
        Motorcycle m2 = new Motorcycle("Honda", "Custom Plate", "Black", VehicleType.NOT_FOR_RACE, true);

        // constructor for Car
        // make, plate, color, category, gear, type
        Car vt1 = new Car   ("Lamborghini", "Custom Plate", "White", VehicleCategory.FAMILY, GearType.MANUAL, CarType.SPORT);
        Car vt2 = new Car("BMW", "Custom Plate", "Black", VehicleCategory.FAMILY, GearType.AUTOMATIC, CarType.SEDAN);
        Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", VehicleCategory.FAMILY, GearType.MANUAL, CarType.HATCHBACK);
        Car vt4 = new Car("Mazda", "Custom Plate", "White", VehicleCategory.FAMILY, GearType.AUTOMATIC, CarType.SUV);


        //TEST 1
        System.out.println("Test 1: ");
//        allTests.hireTest1();

        System.out.println("Test 2: ");
        System.out.println("Employees description: ");


//        TEST 3
        System.out.println("Test 3: ");
        System.out.println("Employees description: ");
        allTests.hireTest3(m1,m2,vt1,vt2,vt3,vt4);

    }
}