package OOPML;
abstract class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected double rentalPricePerDay;

    public Vehicle(String vehicleNumber, String brand, double rentalPricePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rental Price per Day: ₹" + rentalPricePerDay);
    }

    public abstract double calculateRent(int days);
}

class Car extends Vehicle {
    public Car(String vehicleNumber, String brand, double rentalPricePerDay) {
        super(vehicleNumber, brand, rentalPricePerDay);
    }

    @Override
    public double calculateRent(int days) {
        return days * rentalPricePerDay;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, String brand, double rentalPricePerDay) {
        super(vehicleNumber, brand, rentalPricePerDay);
    }

    @Override
    public double calculateRent(int days) {
        double total = days * rentalPricePerDay;
        if (days > 5) {
            total *= 0.9;
        }
        return total;
    }
}