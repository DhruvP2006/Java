import java.util.*;
class Item {
private String name;
private double price;
private int quantity;
public Item(String name, double price, int quantity) {
this.name = name;
this.price = price;
this.quantity = quantity;
}
public String getName() {
return name;
}
@Override
public String toString() {
return "[Name: " + name + ", Price: " + price + ", Qty: " + quantity + "]";
}
}
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Vector<Item> shoppingList = new Vector<>();
int choice;
do {
System.out.println("\n=== Shopping List Menu ===");
System.out.println("1. Accept shopping items");
System.out.println("2. Delete specific item");
System.out.println("3. Add item at the end");
System.out.println("4. Add item at specific location");
System.out.println("5. Print items using Enumeration");
System.out.println("6. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
switch (choice) {
case 1:
System.out.print("Enter number of items: ");
int n = sc.nextInt();
for (int i = 0; i < n; i++) {
System.out.println("Enter details for item " + (i + 1) + ":");
System.out.print("Name: ");
String name = sc.next();
System.out.print("Price: ");
double price = sc.nextDouble();
System.out.print("Quantity: ");
int qty = sc.nextInt();
shoppingList.add(new Item(name, price, qty));
}
break;
case 2:
System.out.print("Enter item name to delete: ");
String delName = sc.next();
boolean found = false;
for (int i = 0; i < shoppingList.size(); i++) {
if (shoppingList.get(i).getName().equalsIgnoreCase(delName)) {
shoppingList.removeElementAt(i);
System.out.println("Item deleted successfully.");
found = true;
break;
}
}
if (!found) {
System.out.println("Item not found!");
}
break;
case 3:
System.out.print("Enter item details:\nName: ");
String nameEnd = sc.next();
System.out.print("Price: ");
double priceEnd = sc.nextDouble();
System.out.print("Quantity: ");
int qtyEnd = sc.nextInt();
shoppingList.addElement(new Item(nameEnd, priceEnd, qtyEnd));
System.out.println("Item added at the end.");
break;
case 4:
System.out.print("Enter index (0 to " + shoppingList.size() + "): ");
int index = sc.nextInt();
if (index < 0 || index > shoppingList.size()) {
System.out.println("Invalid index!");} else {
System.out.print("Enter item details:\nName: ");
String nameLoc = sc.next();
System.out.print("Price: ");
double priceLoc = sc.nextDouble();
System.out.print("Quantity: ");
int qtyLoc = sc.nextInt();
shoppingList.add(index, new Item(nameLoc, priceLoc, qtyLoc));
System.out.println("Item added at index " + index + ".");
}
break;
case 5:
System.out.println("\n--- Shopping List ---");
Enumeration<Item> e = shoppingList.elements();
while (e.hasMoreElements()) {
System.out.println(e.nextElement());
}
break;
case 6:
System.out.println("Exiting program...");
break;
default:
System.out.println("Invalid choice! Please try again.");
}
} while (choice != 6);
sc.close();
}
}
