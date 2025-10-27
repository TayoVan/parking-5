package parking.core;

public class ParkingSpot {
    public int id;
    public boolean occupied;
    public String carPlate;

    public ParkingSpot(int id) {
        this.id = id;
        this.occupied = false;
        this.carPlate = "";
    }

    public static ParkingSpot create(int id) {
        System.out.println("ParkingSpot.create");
        return new ParkingSpot(id);
    }

    public void parkCar(String plate) {
        this.carPlate = plate;
        this.occupied = true;
        System.out.println("ParkingSpot.parkCar - spot " + id + " parked car " + plate);
    }

    public void removeCar() {
        System.out.println("ParkingSpot.removeCar - spot " + id + " removed car " + carPlate);
        this.carPlate = "";
        this.occupied = false;
    }

    @Override
    public String toString() {
        return String.format("Spot %d: %s", id, occupied ? ("OCCUPIED by " + carPlate) : "free");
    }
}
