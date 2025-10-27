package parking.core;

import java.util.Scanner;

public class Driver extends Employee {
    private String licenseNumber;

    public Driver(String name, int age, int experience, double salary, String licenseNumber) {
        super(name, age, experience, salary);
        this.licenseNumber = licenseNumber;
    }

    public static Driver createFromConsole(Scanner sc) {
        System.out.println("Driver.createFromConsole");
        System.out.print("Введіть ім'я водія: ");
        String name = sc.nextLine();
        System.out.print("Вік: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Стаж: ");
        int exp = Integer.parseInt(sc.nextLine());
        System.out.print("ЗП: ");
        double sal = Double.parseDouble(sc.nextLine());
        System.out.print("Номер ліцензії: ");
        String lic = sc.nextLine();
        return new Driver(name, age, exp, sal, lic);
    }

    @Override
    public void performWork() {
        System.out.println("Driver.performWork - водій " + name + " переганяє авто.");
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public String toString() {
        return "Driver: " + super.toString() + ", license=" + licenseNumber;
    }
}
