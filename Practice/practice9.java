import java.util.*;

public class practice9{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ")
    String s = sc.nextLine().toLowerCase();
    int vowel = 0, consonants =0;
    for(char c: s.toCharArray()){
      if("aeiou".indexOf(c)!=-1){
        vowel++;
      }
      else if(Character.isLetter(c)){
      consonants++;
    } 
    }


  }

}