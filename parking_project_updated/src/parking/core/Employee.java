package parking.core;

public class Employee {
    protected String name;
    protected int age;
    protected int experience;
    protected double salary;

    public static class NameInfo {
        public String firstName;
        public String lastName;
        public NameInfo(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public Employee(String name, int age, int experience, double salary) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
    }

    public static void printClassAndMethod() {
        System.out.println("Employee.printClassAndMethod");
    }

    public void performWork() {
        System.out.println(this.getClass().getSimpleName() + ".performWork - name: " + name);
    }

    @Override
    public String toString() {
        return String.format("%s (age=%d, exp=%d, salary=%.2f)", name, age, experience, salary);
    }
}
