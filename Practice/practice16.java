final class Ticket{
  private final int ticketId;
  private final String name;
  private final String source;
  private final String destination;
  private float price;

  Ticket(int ticketId, String name, String source, String destination, float price){
    this.ticketId = ticketId;
    this.name = name;
    this.source = source;
    this.destination = destination;
    this.price = price;
  }

  void updatePrice(float price){
    this.price = price;
  }

  void displayTicketDetails(){
    System.out.println("Ticket ID: "+ this.ticketId + "\nPassenger Name: " + this.name + "\nSource: " + this.source + "\nDestination: " + this.destination + "\nPrice: " + this.price);
}

}

public class practice16 {
  public static void main(String[] args){
    Ticket t1 = new Ticket(123, "Dhruv", "Vidyavihar", "Chembur", 5f);
    Ticket t2 = new Ticket(543, "Aayush", "Vidyavihar", "Panvel", 20f);


    t1.displayTicketDetails();
    t2.displayTicketDetails();
    
    t1.updatePrice(10f);
    t1.displayTicketDetails();
  }  
}
