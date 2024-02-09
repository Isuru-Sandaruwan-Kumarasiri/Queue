public class Vehicle {
    String vehicleNumber;
    String type;
    String service;
    Vehicle next;

    public Vehicle(String vehicleNumber, String type, String service) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.service = service;
    }
}
