package parking.core;

import java.util.Scanner;


public class ObjectFactory {

    public static ParkingSpot createParkingSpot(int id) {
        System.out.println("ObjectFactory.createParkingSpot");
        return ParkingSpot.create(id);
    }

    public static Driver createDriver(Scanner sc) {
        System.out.println("ObjectFactory.createDriver");
        return Driver.createFromConsole(sc);
    }

    public static Cleaner createCleaner(Scanner sc) {
        System.out.println("ObjectFactory.createCleaner");
        return Cleaner.createFromConsole(sc);
    }

    public static Security createSecurity(Scanner sc) {
        System.out.println("ObjectFactory.createSecurity");
        return Security.createFromConsole(sc);
    }

    public static Manager createManager(Scanner sc) {
        System.out.println("ObjectFactory.createManager");
        return Manager.createFromConsole(sc);
    }
}
