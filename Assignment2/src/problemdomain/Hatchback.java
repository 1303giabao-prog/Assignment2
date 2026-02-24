package problemdomain;

public class Hatchback extends Vehicle {

    private String hatchType;

    public Hatchback(String carID, String vehicleType, String subType,
                     int speed, double fuel, int seats, int year,
                     String drivetrain, double price, int quantity,
                     String hatchType) {

        super(carID, vehicleType, subType, speed, fuel, seats, year,
              drivetrain, price, quantity);

        this.hatchType = hatchType;
    }

    private String convertHatchType() {
        switch (hatchType) {
            case "S": return "Standard Liftgate";
            case "T": return "Split Liftgate";
            case "P": return "Power Liftgate";
            default: return hatchType;
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
               "\nHatch Type:\t" + convertHatchType() + "\n";
    }

    @Override
    public String toFileFormat() {
        return super.toFileFormat() + ";" + hatchType;
    }
}