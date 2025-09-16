import java.util.*;

public class practice3{
  public static void main(String args[]){
  ArrayList<String> lang = new ArrayList<>();
  lang.add("java");
  lang.add("c++");
  lang.add("python");
  lang.add("javascript");
  for(String l : lang){
    System.out.println(l);
  }

  Iterator<String> itr= lang.iterator();
  while(itr.hasNext()){
    String l = itr.next();
    System.out.println(l);
  } 
  }
}