package funkcija;

public class Ispis implements Funkcija {
  @Override
  public int izracunaj(int a) {
    System.out.print(a + " ");
    return a;
  }
}
