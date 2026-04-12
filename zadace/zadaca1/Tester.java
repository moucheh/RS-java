public class Tester {
  public static void main(String[] args) {
    Oblik[] a = new Oblik[2];
    a[0] = new Krug(3);
    a[1] = new Pravougaonik(2, 3);
    for (int k = 0; k < a.length; ++k) {
      System.out.println(a[k].povrsina());
    }
  }
}

abstract class Oblik {
  public abstract double povrsina();
}

class Krug extends Oblik {
  private double r;

  public Krug(double radius) {
    r = radius;
  }

  @Override
  public double povrsina() {
    return r * r * Math.PI;
  }
}

class Pravougaonik extends Oblik {
  private double a, b;

  public Pravougaonik(double sideA, double sideB) {
    a = sideA;
    b = sideB;
  }

  @Override
  public double povrsina() {
    return a * b;
  }
}
