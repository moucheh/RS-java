public class ArrayCopy {
  public static boolean arrcmp(int[] a, int[] b) {
    if (a.length != b.length) return false;

    for (int i = 0; i < a.length; ++i) {
      if (a[i] != b[i]) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[5];
    System.arraycopy(a, 0, b, 0, 5);

    System.out.println("Before: " + arrcmp(a, b));

    a[0] = 10;
    b[0] = 11;

    System.out.println("After: " + arrcmp(a, b));
  }
}
