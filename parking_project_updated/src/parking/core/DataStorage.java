package parking.core;

/**
 * Static storage for all objects. Does NOT use collections.
 * Uses fixed-size arrays and counters.
 */
public class DataStorage {
    // employees
    public static final int MAX_EMPLOYEES = 10;
    public static Employee[] employees = new Employee[MAX_EMPLOYEES];
    public static int employeesCount = 0;

    // parking spots
    public static final int MAX_SPOTS = 10;
    public static ParkingSpot[] parkingSpots = new ParkingSpot[MAX_SPOTS];
    public static int parkingSpotsCount = 0;

    // simple utility methods to add objects
    public static boolean addEmployee(Employee e) {
        if (employeesCount >= MAX_EMPLOYEES) return false;
        employees[employeesCount++] = e;
        return true;
    }

    public static boolean addParkingSpot(ParkingSpot s) {
        if (parkingSpotsCount >= MAX_SPOTS) return false;
        parkingSpots[parkingSpotsCount++] = s;
        return true;
    }
}
