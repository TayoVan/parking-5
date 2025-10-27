package parking.core;

import java.util.Scanner;

public class Cleaner extends Employee {
    private int shift;

    public Cleaner(String name, int age, int experience, double salary, int shift) {
        super(name, age, experience, salary);
        this.shift = shift;
    }

    public static Cleaner createFromConsole(Scanner sc) {
        System.out.println("Cleaner.createFromConsole");
        System.out.print("Введіть ім'я прибиральника: ");
        String name = sc.nextLine();
        System.out.print("Вік: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Стаж: ");
        int exp = Integer.parseInt(sc.nextLine());
        System.out.print("ЗП: ");
        double sal = Double.parseDouble(sc.nextLine());
        System.out.print("Змінa (число): ");
        int sh = Integer.parseInt(sc.nextLine());
        return new Cleaner(name, age, exp, sal, sh);
    }

    @Override
    public void performWork() {
        System.out.println("Cleaner.performWork - прибирає паркувальні місця.");
    }

    @Override
    public String toString() {
        return "Cleaner: " + super.toString() + ", shift=" + shift;
    }
}
