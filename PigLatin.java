import java.util.*;

public class PigLatin {
  public static void main (String[] args) {
    //temporary testing site
    System.out.println(pigLatinSimple("mock") + " | ockmay");
    System.out.println(pigLatinSimple("pie") + " | iepay");
    System.out.println(pigLatinSimple("david") + " | avidday");
    System.out.println(pigLatinSimple("aaron") + " | aaronhay");
  }

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    char first = s.charAt(0);
    if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
        return (s + "hay");
    } else {
      String sub = s.substring(1, s.length());
      return (sub + s.charAt(0) + "ay");
    }

  }

}
