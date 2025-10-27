package parking.core;

import java.util.Scanner;

public class Manager extends Employee {
    public Manager(String name, int age, int experience, double salary) {
        super(name, age, experience, salary);
    }

    public static Manager createFromConsole(Scanner sc) {
        System.out.println("Manager.createFromConsole");
        System.out.print("Введіть ім'я менеджера: ");
        String name = sc.nextLine();
        System.out.print("Вік: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Стаж: ");
        int exp = Integer.parseInt(sc.nextLine());
        System.out.print("ЗП: ");
        double sal = Double.parseDouble(sc.nextLine());
        return new Manager(name, age, exp, sal);
    }

    public void addEmployeeInteractive(Scanner sc) {
        System.out.println("Manager.addEmployeeInteractive");
        System.out.println("1 - Driver, 2 - Cleaner, 3 - Security");
        int choice = Integer.parseInt(sc.nextLine());
        Employee e = null;
        switch (choice) {
            case 1:
                e = Driver.createFromConsole(sc);
                break;
            case 2:
                e = Cleaner.createFromConsole(sc);
                break;
            case 3:
                e = Security.createFromConsole(sc);
                break;
            default:
                System.out.println("Невірний тип працівника.");
                return;
        }

        boolean added = DataStorage.addEmployee(e);
        if (added) {
            System.out.println("Працівника додано: " + e);
        } else {
            System.out.println("Нема місця для нового працівника.");
        }
    }

    public void showEmployees() {
        System.out.println("Manager.showEmployees");
        for (int i = 0; i < DataStorage.employeesCount; i++) {
            System.out.println((i+1) + ". " + DataStorage.employees[i]);
        }
    }

    @Override
    public void performWork() {
        System.out.println("Manager.performWork - керує роботою персоналу.");
    }
}
