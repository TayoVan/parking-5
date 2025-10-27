package parking.core;

import java.util.Scanner;

public class Payment {
    public static void printClassAndMethod() {
        System.out.println("Payment.printClassAndMethod");
    }

    public void makePaymentInteractive(Scanner sc) {
        System.out.println("Payment.makePaymentInteractive");
        System.out.print("Введіть суму до оплати: ");
        String s = sc.nextLine();
        System.out.println("Оплата проведена: " + s);
    }
}
