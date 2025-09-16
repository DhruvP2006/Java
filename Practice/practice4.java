import java.util.*;

class Car{
  String make;
  String model;
  int year;
  double price;

  public Car(String make, String model, int year, double price){
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price;
  }

public String toString() {
return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Price:" + price;
}
}

public class practice4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    boolean n = true;
    Vector<Car> carList = new Vector<>();
    while(n){
      System.out.println("Enter 1: To Add a Car\nEnter 2: To Search a Car\nEnter 3: To Remove a Car\nEnter 4: To Display\n Enter 5: To Exit");
      int choice = sc.nextInt();
      switch(choice){

      case 1:
        addCar(sc, carList);
        break;
      case 2: 
        searchCar(sc, carList);
        break;
      case 3:
        removeCar(sc, carList);
        break;
      case 4:
        display(carList);
        break;
      case 5:
        n = false;
        break;
      default:
        System.out.println("Enter a valid Input");
      }
      
    }
  }

  public static void addCar(Scanner sc, Vector<Car> List){
    System.out.println("Enter Car Make:");
    String make = sc.next();
    System.out.println("Enter Car Model:");
    String model = sc.next();
    System.out.println("Enter Car Year:");
    int year = sc.nextInt();
    System.out.println("Enter Car Price:");
    double price = sc.nextDouble();
   Car newCar = new Car(make, model ,year, price);
   List.add(newCar);
   System.out.println("Car added successfully!");
  }

  public static void searchCar(Scanner sc, Vector<Car> List){
    System.out.println("Enter the the model you want to search");
    String key = sc.next();
    boolean found = false;
    for(Car car : List){
      if(car.make.equalsIgnoreCase(key)){
        display(List);
        found = true;
      }
    }
    if(!found){
      System.out.println("Not found");
    }
    }

    public static void removeCar(Scanner sc, Vector<Car> List){
      System.out.println("Enter the the model you want to delete");
    String key = sc.next();
    boolean found = false;
   for(int i = 0; i<List.size(); i++){
    Car car = List.get(i);
    if(car.make.equalsIgnoreCase(key)){
      List.remove(i);
      found = true;
      break;
    }
   }
    if(!found){
      System.out.println("Not found");
    }

    }
    public static void display(Vector<Car> List){
      for(Car car: List){
        System.out.println(car);
      }
    }
  }
  