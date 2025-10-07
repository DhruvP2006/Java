interface Animal{
  public void walks();
  }

interface Herbivore{}

class Horse implements Animal, Herbivore{
  public void walks(){
    System.out.println("Walks on 4 legs");
  }
}

public class practice13{
  public static void main(String [] args){
Horse horse = new Horse();
horse.walks();
  }
}