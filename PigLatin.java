import java.util.*;

public class PigLatin {
  public static void main (String[] args) {
    //temporary testing site
    System.out.println("***\nsimplepiglatin\n***");
    System.out.println(pigLatinSimple("mock") + " | ockmay");
    System.out.println(pigLatinSimple("pie") + " | iepay");
    System.out.println(pigLatinSimple("david") + " | avidday");
    System.out.println(pigLatinSimple("aaron") + " | aaronhay");
    System.out.println(pigLatinSimple("a") + " | ahay");
    System.out.println(pigLatinSimple("b") + " | bay");

    System.out.println("***\npiglatin\n***");
    System.out.println(pigLatin("the") + " | ethay");
    System.out.println(pigLatin("check") + " | eckchay");
    System.out.println(pigLatin("skee") + " | eeskay");
    System.out.println(pigLatin("emu") + " | emuhay");
    System.out.println(pigLatin("grade") + " | adegray");
    System.out.println(pigLatin("th") + " | thay");
    System.out.println(pigLatin("a") + " | ahay");
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

  public static String pigLatin(String s){
    s.toLowerCase();
    if (s.length() == 1) {
      return (pigLatinSimple(s));
    }
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String pre = s.substring(0, 2);
    for (int i = 0; i < digraphs.length; i++) {
      if (pre.equals(digraphs[i])) {
        String sub = s.substring(2, s.length());
        return (sub + pre + "ay");
      }
    }
    return (pigLatinSimple(s));
  }


}
