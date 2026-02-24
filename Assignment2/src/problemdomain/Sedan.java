package problemdomain;

public class Sedan extends Vehicle {

    private String trunkSize;

    public Sedan(String carID, String vehicleType, String subType,
                 int speed, double fuel, int seats, int year,
                 String drivetrain, double price, int quantity,
                 String trunkSize) {

        super(carID, vehicleType, subType, speed, fuel, seats, year,
              drivetrain, price, quantity);

        this.trunkSize = trunkSize;
    }

    private String convertTrunkSize() {
        switch (trunkSize) {
            case "L": return "Large/spacious Trunk";
            case "S": return "Small Trunk";
            case "M": return "Moderate Trunk";
            default: return trunkSize;
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
               "\nTrunk Size:\t" + convertTrunkSize() + "\n";
    }

    @Override
    public String toFileFormat() {
        return super.toFileFormat() + ";" + trunkSize;
    }
}