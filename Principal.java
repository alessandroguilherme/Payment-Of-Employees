package Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Employees.Entities.Employee;
import Employees.Entities.OutSourcedEmployee;

public class Principal {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = imput.nextInt();

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1) + " Data:");
            System.out.print("OutSourced (y/n)? ");
            char answer = imput.next().charAt(0);

            System.out.print("Name: ");
            imput.nextLine();
            String name = imput.nextLine();

            System.out.print("Hours: ");
            int hour = imput.nextInt();

            System.out.print("Value Per Hour: ");
            double valuePerHour = imput.nextDouble();

            if (answer == 'y') {
                System.out.print("Additional Charge: ");
                double additionalCharge = imput.nextDouble();

                list.add(new OutSourcedEmployee(name, hour, valuePerHour, additionalCharge));
            } else {
                list.add(new Employee(name, hour, valuePerHour));
            }

        }

        System.out.println();
        for (Employee emp : list) {
            System.out.println("PAYMENT: \n" + emp.getName() + " - " + String.format("%.2f", emp.payment()));

        }

    }
}
