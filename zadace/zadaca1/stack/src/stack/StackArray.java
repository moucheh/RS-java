package stack;

public class StackArray implements MojStack {
  private int cap;
  private int size = 0;
  private Object[] arr;

  public StackArray() {
    cap = 1;
    arr = new Object[cap];
  }

  public StackArray(int capacity) {
    cap = capacity;
    arr = new Object[cap];
  }

  @Override
  public void push(Object o) {
    if (size == cap) {
      cap *= 2;
      Object[] temp = new Object[cap];
      System.arraycopy(arr, 0, temp, 0, size);
      arr = temp;
    }
    arr[size++] = o;
  }

  @Override
  public Object pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack je prazan");
    }
    Object o = arr[size-- - 1];
    return o;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }
}
