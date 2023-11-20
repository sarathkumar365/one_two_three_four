import employee.Employee;

import java.time.LocalDate;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Welcome to out employee management system!!");

        System.out.println("Enter employee name :- ");
        String employee_name = read.nextLine();

        System.out.println("Enter birth year :- ");
        int employee_birth_year = read.nextInt();

        System.out.println("Enter birth monthly income :- ");
        double employee_monthly_income = read.nextDouble();

        System.out.println("Enter birth occupation rate :- ");
        double employee_occupation_rate = read.nextDouble();

        Employee emp1 = new Employee(employee_name,employee_birth_year,employee_monthly_income,employee_occupation_rate);
//        System.out.println("Employee age is :- " + emp1.getCurrentAge());
    }
}