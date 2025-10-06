package library;

public class Book implements Library {
    @Override
    public void borrowItem(String memberName){
    System.out.println("Book: " + memberName +"Borrowed");
    }
    @Override
    public void returnItem(){
    System.out.println("Book returned");
  }
  @Override
  public String getDetails(){
    return "Book Details";
  }
}
