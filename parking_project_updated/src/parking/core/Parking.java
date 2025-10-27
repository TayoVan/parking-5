package parking.core;

import java.util.Scanner;

public class Parking {
    public static final int MAX_SPOTS = 5;
    public static void printClassAndMethod() {
        System.out.println("Parking.printClassAndMethod");
    }

    public Parking() {
        if (DataStorage.parkingSpotsCount == 0) {
            for (int i = 0; i < MAX_SPOTS; i++) {
                DataStorage.addParkingSpot(ParkingSpot.create(i+1));
            }
        }
    }

    public void showStatus() {
        System.out.println("Parking.showStatus");
        for (int i = 0; i < DataStorage.parkingSpotsCount; i++) {
            System.out.println(DataStorage.parkingSpots[i]);
        }
    }

    public boolean parkCarInteractive(Scanner sc) {
        System.out.println("Parking.parkCarInteractive");
        System.out.print("Введіть номер авто (plate): ");
        String plate = sc.nextLine();
        for (int i = 0; i < DataStorage.parkingSpotsCount; i++) {
            if (!DataStorage.parkingSpots[i].occupied) {
                DataStorage.parkingSpots[i].parkCar(plate);
                return true;
            }
        }
        System.out.println("Нема вільних місць.");
        return false;
    }

    public boolean removeCarInteractive(Scanner sc) {
        System.out.println("Parking.removeCarInteractive");
        System.out.print("Введіть номер місця для звільнення: ");
        int idx = Integer.parseInt(sc.nextLine()) - 1;
        if (idx < 0 || idx >= DataStorage.parkingSpotsCount) {
            System.out.println("Невірний індекс.");
            return false;
        }
        if (!DataStorage.parkingSpots[idx].occupied) {
            System.out.println("Місце вже вільне.");
            return false;
        }
        DataStorage.parkingSpots[idx].removeCar();
        return true;
    }
}
