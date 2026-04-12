package funkcija;

public class Klijent {
  public static int[] procesiraj(int[] niz) {
    Kvadrat kv = new Kvadrat();
    int[] res = new int[niz.length];

    int i = 0;
    for (int e : niz) {
      res[i++] = kv.izracunaj(e);
    }

    return res;
  }

  public static int[] procesiraj(int[] niz, Funkcija f) {
    int i = 0;
    int[] res = new int[niz.length];
    for (int e : niz) {
      res[i++] = f.izracunaj(e);
    }
    System.out.println();
    return res;
  }

  public static void main(String[] args) {
    int[] niz = new int[10];
    for (int i = 0; i < 10; ++i) {
      niz[i] = i + 1;
    }

    procesiraj(niz, new Ispis());

    int[] kvadriran = procesiraj(niz, new Kvadrat());

    procesiraj(kvadriran, new Ispis());
  }
}
