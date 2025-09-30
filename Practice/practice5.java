import java.util.*;

public class practice5{
  public static void main(String args[]){
    Vector<String> brands = new Vector<>();
    brands.add("Microsoft");
    brands.add("Google");
    brands.add("xAI");
    brands.add("SpaceX");
    brands.add("Microsoft");
    brands.add("Tesla");
    brands.add("Oracle");
    brands.add("Google");
    brands.add("Neuralink");
     System.out.println("Original Vector: " + brands);
    Vector<String> uniqueBrands = new Vector<>();
    for(String m : brands){
      if(!uniqueBrands.contains(m)){
        uniqueBrands.add(m);
      }
    }
  System.out.println("Vector after removing duplicates: " + uniqueBrands);

  }
}