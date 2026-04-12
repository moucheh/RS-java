import java.util.LinkedList;

public class Queue {
  private LinkedList<Integer> list = new LinkedList<Integer>();

  public void push(int num) {
    list.add(num);
  }

  public int pop() {
    return list.remove();
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    for (String arg : args) {
      q.push(Integer.parseInt(arg.trim()));
    }

    while (!q.isEmpty()) {
      System.out.println(q.pop());
    }
  }
}
