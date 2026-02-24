package problemdomain;

public class Hybrid extends Vehicle {

    private String powerTrain;
    private int electricRange;

    public Hybrid(String carID, String vehicleType, String subType,
                  int speed, double fuel, int seats, int year,
                  String drivetrain, double price, int quantity,
                  String powerTrain, int electricRange) {

        super(carID, vehicleType, subType, speed, fuel, seats, year,
              drivetrain, price, quantity);

        this.powerTrain = powerTrain;
        this.electricRange = electricRange;
    }
//so this make main understand data in file and give the correct output
    private String convertPowerTrain() {
        switch (powerTrain) {
            case "E": return "Series Hybrid";
            case "A": return "Parallel Hybrid";
            case "PHEV": return "Plug-in Hybrid";
            default: return powerTrain;
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
               "\nPower Train:\t" + convertPowerTrain() +
               "\nElectric Range:\t" + electricRange + "\n";
    }

    @Override
    public String toFileFormat() {
        return super.toFileFormat() + ";" + powerTrain + ";" + electricRange;
    }
}