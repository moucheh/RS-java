package stack;

public class TestStack {
  public static void main(String[] args) {
    MojStack a = new StackArray(2);
    Integer b = 2;
    Double c = 2.1;
    Integer d = 10;
    a.push("String");
    a.push(b);
    a.push(c);
    a.push(d);
    while (!a.isEmpty()) System.out.println(a.pop());
    try {
      a.pop();
    } catch (Exception e) {
      e.printStackTrace();
    }
    a = new StackList();
    a.push(d);
    System.out.println(a.pop());
    a.pop();
  }
}
