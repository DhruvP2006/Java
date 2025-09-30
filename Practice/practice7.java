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
  public String toString(){
    return "Make: " + make + ", Model: " + model + ", Year: " + ", Price: " + price;
  }

}


public class practice7{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    ArrayList<Car> inventory = new ArrayList<>();
    boolean n = true;
    while(n){
      System.out.println("Enter 1: To Add a Car\nEnter 2: To Search a Car\nEnter 3: To Remove a Car\nEnter 4: To Display\n Enter 5: To Exit");
      int choice = sc.nextInt();
      switch(choice){6
      case 1:
        addCar(sc, inventory);
        break;
      case 2: 
        searchCar(sc, inventory);
        break;
      case 3:
        removeCar(sc, inventory);
        break;
      case 4:
        display(inventory);
        break;
      case 5:
        n = false;
        break;
      default:
        System.out.println("Enter a valid Input");
        break;
      }
      
    }

  }

  public static void addCar(Scanner sc, ArrayList<Car> inventory){
  System.out.println("Enter Car Make:");
    String make = sc.next();
    System.out.println("Enter Car Model:");
    String model = sc.next();
    System.out.println("Enter Car Year:");
    int year = sc.nextInt();
    System.out.println("Enter Car Price:");
    double price = sc.nextDouble();
    inventory.add(new Car(make, model, year, price));
  }

  public static void searchCar(Scanner sc, ArrayList<Car> inventory){
    System.out.println("Enter the Model you want to Search: ");
    String key = sc.nextLine();
    boolean found = false;
    for(Car car : inventory){
      if(car.make.equalsIgnoreCase(key)){
        found = true;
        System.out.println(car);
        break;
      }
    }
    if(!found){
      System.out.println("Not found");
    }
  }

  public static void removeCar(Scanner sc, ArrayList<Car> inventory){
    System.out.println("Enter the Model you want to Remove: ");
    String key = sc.nextLine();
    boolean found = false;
    for(int i = 0; i<inventory.size(); i++){
      Car car = inventory.get(i);
      if(car.make.equalsIgnoreCase(key)){
        inventory.remove(i);
        found = true;
        break;
      }

    }
    if(!found){
      System.out.println("Not Found");
    }
  }

  public static void display(ArrayList<Car> inventory){
    for(Car car: inventory){
      System.out.println(car);
    }
  }
}