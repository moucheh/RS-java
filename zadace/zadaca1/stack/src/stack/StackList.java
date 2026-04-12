package stack;

import java.util.LinkedList;

public class StackList implements MojStack {
  private LinkedList<Object> list;

  public StackList() {
    list = new LinkedList<Object>();
  }

  public int size() {
    return list.size();
  }

  @Override
  public void push(Object o) {
    list.add(o);
  }

  @Override
  public Object pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack je prazan");
    }
    Object o = list.removeLast();
    return o;
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }
}
