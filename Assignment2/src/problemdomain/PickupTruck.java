package problemdomain;

public class PickupTruck extends Vehicle {

    private String cargoBeds;
    private int cargoCapacity;

    public PickupTruck(String carID, String vehicleType, String subType,
                       int speed, double fuel, int seats, int year,
                       String drivetrain, double price, int quantity,
                       String cargoBeds, int cargoCapacity) {

        super(carID, vehicleType, subType, speed, fuel, seats, year,
              drivetrain, price, quantity);

        this.cargoBeds = cargoBeds;
        this.cargoCapacity = cargoCapacity;
    }

    private String convertCargoBeds() {
        switch (cargoBeds) {
            case "SB": return "Short Bed";
            case "EB": return "Extended Bed";
            case "DB": return "Dump Bed";
            default: return cargoBeds;
        }
    }

    @Override
    public String toString() {
        return "Car ID:\t\t" + carID +
               "\nVehicle Type:\t" + vehicleType +
               "\nSub Type:\t" + subType +
               "\nSpeed:\t\t" + speed +
               "\nFuel:\t\t" + fuel +
               "\nNumber of Seats:\t" + seats +
               "\nYear:\t\t" + year +
               "\nDriveTrain:\t\t" + drivetrain +
               "\nPrice:\t\t" + price +
               "\nAvailable:\t\t" + quantity +
               "\nCargo Capacity:\t" + cargoCapacity +
               "\nCargo Beds:\t" + convertCargoBeds() + "\n";
    }

    @Override
    public String toFileFormat() {
        return super.toFileFormat() + ";" + cargoBeds + ";" + cargoCapacity;
    }
}