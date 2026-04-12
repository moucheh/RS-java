import java.util.ArrayList;

public class Polynomial {
  private ArrayList<Double> coef = new ArrayList<Double>();

  public Polynomial() {}

  public Polynomial(double[] arr) {
    for (double e : arr) {
      coef.add(e);
    }
  }

  public String toString() {
    String res = "";

    int len = coef.size();

    for (int i = 0; i < len; ++i) {
      if (coef.get(i) == 0.0) continue;
      double curr = coef.get(i);
      int index = len - i - 1;

      if (curr > 0.0) {
        res += "+";
      }

      res += curr;
      if (index != 0) {
        if (index == 1) {
          res += "x";
          ;
        } else {
          res += "x^" + index;
        }
      }
    }

    return res.substring(1);
  }

  public void add(Polynomial other) {
    if (coef.size() > other.coef.size()) {
      ArrayList<Double> cloned = new ArrayList<Double>();
      cloned.addAll(other.coef);
      int diff = coef.size() - other.coef.size();
      for (int i = 0; i < diff; ++i) {
        cloned.add(0, 0.0);
      }

      for (int i = 0; i < coef.size(); ++i) {
        coef.set(i, coef.get(i) + cloned.get(i));
      }

      return;
    }

    if (coef.size() < other.coef.size()) {
      int diff = other.coef.size() - coef.size();
      for (int i = 0; i < diff; ++i) {
        coef.add(0, 0.0);
      }
    }

    for (int i = 0; i < coef.size(); ++i) {
      coef.set(i, coef.get(i) + other.coef.get(i));
    }
  }

  public void multiply(Polynomial other) {
    ArrayList<Double> multiplied = new ArrayList<Double>();

    for (int i = 0; i < coef.size() + other.coef.size() - 1; ++i) {
      multiplied.add(0.0);
    }

    for (int i = 0; i < coef.size(); ++i) {
      for (int j = 0; j < other.coef.size(); ++j) {
        multiplied.set(i + j, multiplied.get(i + j) + coef.get(i) * other.coef.get(j));
      }
    }

    coef = multiplied;
  }

  public double eval(double x) {
    double res = 0.0;

    int len = coef.size();

    for (int i = 0; i < len; ++i) {
      res += coef.get(i) * Math.pow(x, len - i - 1);
    }

    return res;
  }

  public static void main(String[] args) {
    Polynomial p = new Polynomial(new double[] {2.0, 1.0, -5.0});
    Polynomial p1 = new Polynomial(new double[] {3.0, 1.0, 0.0, 3.0});
    p.multiply(p1);
    System.out.println(p);
  }
}
