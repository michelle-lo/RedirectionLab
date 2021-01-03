import java.util.*;

public class PigLatin {
  public static void main (String[] args) {
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()) {
      Scanner in = new Scanner(n.nextLine());
      String str = "";
      while (in.hasNext()) {
        String word = in.next();
        str += pigLatinBest(word);
        if (in.hasNext()) {
          str += " ";
        }
      }
      System.out.println(str);
    }


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

  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    if (s.length() == 1) {
      return pigLatin(s);
    }
    int firstVal = (int) s.charAt(0);
    if ((firstVal >= 97) && (firstVal <= 122)) {
      int lastVal = (int) s.charAt(s.length() - 1);
      if (! (((lastVal >= 97) && (lastVal <= 122)) || ((lastVal >= 48) && (lastVal <= 57)))) {
        String sub = s.substring(0, s.length() - 1);
        return (pigLatin(sub) + s.charAt(s.length() - 1));
      } else {
        return pigLatin(s);
      }
    } else {
      return s;
    }
  }
}
