package problemdomain;

public abstract class Vehicle {

    protected String carID;
    protected String vehicleType;
    protected String subType;
    protected int speed;
    protected double fuel;
    protected int seats;
    protected int year;
    protected String drivetrain;
    protected double price;
    protected int quantity;

    public Vehicle(String carID, String vehicleType, String subType,
                   int speed, double fuel, int seats, int year,
                   String drivetrain, double price, int quantity) {

        this.carID = carID;
        this.vehicleType = vehicleType;
        this.subType = subType;
        this.speed = speed;
        this.fuel = fuel;
        this.seats = seats;
        this.year = year;
        this.drivetrain = drivetrain;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCarID() { return carID; }
    public String getVehicleType() { return vehicleType; }
    public String getSubType() { return subType; }
    public int getQuantity() { return quantity; }

    public void decreaseQuantity() { quantity--; }

    public abstract String toString();

    public String toFileFormat() {
        return carID + ";" + vehicleType + ";" + subType + ";" +
               speed + ";" + fuel + ";" + seats + ";" + year + ";" +
               drivetrain + ";" + price + ";" + quantity;
    }
}