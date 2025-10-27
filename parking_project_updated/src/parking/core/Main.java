package parking.core;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PARKING APP (типу круті і ми менеджер) ===");
        Scanner sc = new Scanner(System.in);

        System.out.println("Створимо менеджера ");
        Manager m = ObjectFactory.createManager(sc);
        DataStorage.addEmployee(m);

        Parking parking = new Parking();
        Payment payment = new Payment();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Park car");
            System.out.println("2 - Remove car");
            System.out.println("3 - Add employee");
            System.out.println("4 - Make payment");
            System.out.println("5 - Show parking status");
            System.out.println("6 - Show employees");
            System.out.println("0 - Exit");
            System.out.print("Choice: ");
            String line = sc.nextLine();
            int choice = -1;
            try { choice = Integer.parseInt(line); } catch(Exception ex){}
            switch (choice) {
                case 1:
                    parking.parkCarInteractive(sc);
                    break;
                case 2:
                    parking.removeCarInteractive(sc);
                    break;
                case 3:
                    m.addEmployeeInteractive(sc);
                    break;
                case 4:
                    payment.makePaymentInteractive(sc);
                    break;
                case 5:
                    parking.showStatus();
                    break;
                case 6:
                    m.showEmployees();
                    break;
                case 0:
                    System.out.println("Вихід із програми...");
                    sc.close();
                    return;
                default:
                    System.out.println("Невірний вибір!");
            }
        }
    }
}
