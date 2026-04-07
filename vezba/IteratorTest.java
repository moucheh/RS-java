import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<String>(3);
    words.add("Hello");
    words.add("World!");
    words.add("I'm");
    words.add("Mohamed!");

    Iterator<String> i = words.iterator();

    while (i.hasNext()) {
      System.out.println(i.next());
    }
  }
}
