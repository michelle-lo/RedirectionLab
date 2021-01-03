import java.util.*;

public class MakeStars {
  public static void main (String[] args) {
    String str = "";
    Scanner n = new Scanner(System.in);
    while (n.hasNext()){
      Scanner in = new Scanner(n.nextLine());
      while (in.hasNext()) {
        String word = in.next();
        System.out.println("word: " + word);
        for (int i = 0; i < word.length(); i++) {
          str+= "*";
        }
        if (in.hasNext()) {
          str += " ";
        }
      }
      /*
      if (n.hasNextLine()) {
        str+="\n";
      }
      */
    }
    System.out.print(str); //do we need to print??
  }
}
