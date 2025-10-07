import java.util.*;

final class Product{
  int productID;
  String productName;
  int quantity;
  float price;

  Product(int productID, String productName, int quantity, float price){
    this.productID = productID;
    this.productName = productName;
    this.quantity = quantity;
    this.price = price;
  }

  void displayProductDetails(){
    System.out.println("Product ID: "+ this.productID + "\nProduct Name: " + this.productName + "\nQuantity: " + this.quantity + "\nPrice: " + this.price);
  }

  void updatePrice(float price){
    this.price = price;
  }

  void updateQuantity(int q){
    this.quantity = q;
  }
}

// class Test extends Product{
//   Test(){
//     System.out.println("Test call cannont extend Product");
//   }
// }

public class practice21 {
  public static void main(String [] args){
    ArrayList<Product> p1 = new ArrayList<>();
    Product p2 = new Product(123, "asdfwf", 10, 60.56f);
  }
  
}
