import java.util.Scanner;

class product{
  int pid;
  String pname;
  double pcost;

  public product(int id, String name, int cost){
    this.pid = id;
    this.pname = name;
    this.pcost = cost;
  }

  public void display(){
    System.out.println("Name: "+ pname + "id: " + pid+ "cost: "+ pcost);
  }


}

public class practice2 {
public static void main(String args[]){
  java.util.Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Number of products you want to enter");
  int n = sc.nextInt();
  product[] products = new product[n];
  System.out.println("Enter the details of " + n + " products");
  for(int i = 0; i<n; i++){
    int id, cost;
    String name;
    System.out.println("Enter the id of the product");
    id = sc.nextInt();
    System.out.println("Enter the name of the product");
    name = sc.next();
    System.out.println("Enter the cost of the product");
    cost = sc.nextInt();

    products[i] = new product(id, name, cost);
    products[i].display();
  }  
  for(int i = 0; i<n; i++){
    for(int j = 0; j<n-i; j++){
      if(products[j].pcost>products[j+1].pcost){
        product temp = products[j];
        products[j] = products[j+1];
        products[j+1] = temp; 

      }
    }
  }


}

}