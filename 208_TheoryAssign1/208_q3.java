//2105208_MILAN KUMAR SAHOO
class Vehicle 
{
    String regnNumber;
    double speed;
    String color;
    String ownerName;
    public Vehicle(String regnNumber, double speed, String color, String ownerName) 
    {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }
    public void showData() 
    {
        System.out.println("This is a Vehicle class.");
    }
}
class Bus extends Vehicle 
{
    int routeNumber;
    public Bus(String regnNumber, double speed, String color, String ownerName, int routeNumber) 
    {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }
    //Override
    public void showData() 
    {
        super.showData();
        System.out.println();
        System.out.println("This is a Bus class.");
        System.out.println("Regn Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle 
{
    String manufacturerName;
    public Car(String regnNumber, double speed, String color, String ownerName, String manufacturerName) 
    {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }
    //Override
    public void showData() 
    {
        super.showData();
        System.out.println();
        System.out.println("This is a Car class.");
        System.out.println("Regn Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}
class Main 
{   
    public static void main(String[] args) 
    {
        Vehicle vehicle = new Vehicle("ABC123", 60.5, "Red", "Milan");
        vehicle.showData();
        System.out.println("==============================================");
        Bus bus = new Bus("DEF456", 40.0, "Blue", "Amogh", 123);
        bus.showData();
        System.out.println("=================================================");
        Car car = new Car("GHI789", 80.0, "Black", "Sovan", "BMW");
        car.showData();
    }
}
