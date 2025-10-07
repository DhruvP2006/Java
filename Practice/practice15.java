import java.util.*;

abstract class Vehical{
  public int vehicalNumber;
  public String vehicalType;
  public float fuelCapacity;

  Vehical(int vehicalNumber, String vehicalType, float fuelCapacity){
    this.vehicalNumber = vehicalNumber;
    this.vehicalType = vehicalType;
    this.fuelCapacity = fuelCapacity;
  }

  abstract double calculateRange();

  void displayVehicalDetails(){
    System.out.println("Vehical Number: "+ vehicalNumber+"\nVehical Type: "+ vehicalType+ "Fuel Capacity: "+ fuelCapacity);
  }
}

class Car extends Vehical{
  Car(int vehicalNumber, String vehicalType, float fuelCapacity){
    super(vehicalNumber, vehicalType, fuelCapacity);
  }

  @Override
  double calculateRange(){
    return fuelCapacity * 15;
  }
} 

class Bike extends Vehical{
  Bike(int vehicalNumber, String vehicalType, float fuelCapacity){
    super(vehicalNumber, vehicalType, fuelCapacity);
  }

  @Override
  double calculateRange(){
    return fuelCapacity*40;
  }
}

class Truck extends Vehical{
  Truck(int vehicalNumber, String vehicalType, float fuelCapacity){
    super(vehicalNumber, vehicalType, fuelCapacity);
  }

  @Override
  double calculateRange(){
    return fuelCapacity*8;
  }
}

public class practice15 {
  public static void main(String [] args){
    List<Vehical> v1 = new ArrayList<>();

    v1.add(new Car(123, "LMV", 30.1f));
    v1.add(new Bike(456, "ULMV", 15.9f));
    v1.add(new Truck(789, "HMV", 90.4f));

    for (Vehical v : v1){
      v.displayVehicalDetails();
      System.out.println(v.calculateRange());
    }
  }
}
