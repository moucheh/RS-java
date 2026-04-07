import java.util.ArrayList;
import java.util.Random;

public class RandomString {
  public static String generateRandomString(String res, int n) {
    Random rand = new Random();
    for (int i = 0; i < n; ++i) {
      switch (rand.nextInt() % 3) {
        case 2:
          res += (char) rand.nextInt('A', 'Z' + 1);
          break;
        case 1:
          res += (char) rand.nextInt('a', 'z' + 1);
          break;
        default:
          res += (char) rand.nextInt('0', '9' + 1);
          break;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int n = 32;

    ArrayList<String> list = new ArrayList<String>();

    for (int i = 0; i < n; ++i) {
      String res = "";
      list.add(generateRandomString(res, n));
    }

    for (String randomString : list) {
      System.out.println(randomString);
    }
  }
}
