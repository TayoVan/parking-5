package parking.core;

import java.util.Scanner;

public class Security extends Employee {
    private String post;

    public Security(String name, int age, int experience, double salary, String post) {
        super(name, age, experience, salary);
        this.post = post;
    }

    public static Security createFromConsole(Scanner sc) {
        System.out.println("Security.createFromConsole");
        System.out.print("Введіть ім'я охоронника: ");
        String name = sc.nextLine();
        System.out.print("Вік: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Стаж: ");
        int exp = Integer.parseInt(sc.nextLine());
        System.out.print("ЗП: ");
        double sal = Double.parseDouble(sc.nextLine());
        System.out.print("Посада: ");
        String post = sc.nextLine();
        return new Security(name, age, exp, sal, post);
    }

    @Override
    public void performWork() {
        System.out.println("Security.performWork - охороняє паркінг.");
    }

    @Override
    public String toString() {
        return "Security: " + super.toString() + ", post=" + post;
    }
}
