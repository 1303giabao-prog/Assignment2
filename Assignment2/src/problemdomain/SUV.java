package problemdomain;

public class SUV extends Vehicle {

    public SUV(String carID, String vehicleType, String subType,
               int speed, double fuel, int seats, int year,
               String drivetrain, double price, int quantity) {

        super(carID, vehicleType, subType, speed, fuel, seats, year,
              drivetrain, price, quantity);
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
               "\nDriveTrain:\t" + drivetrain + "\n";
    }
}