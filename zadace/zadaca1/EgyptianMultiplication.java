public class EgyptianMultiplication {
  public static void main(String[] args) {
    int A = Integer.parseInt(args[0].trim());
    int B = Integer.parseInt(args[1].trim());
    int origA = A;
    int origB = B;
    int em = 0;
    System.out.println("A = " + A + " i B = " + B);
    while (B != 0) {
      if (B % 2 != 0) {
        em += A;
        System.out.println("B je neparno, dodajemo A za kreiranje proizvoda: " + em);
      } else {
        System.out.println("A = " + A + " i B = " + B);
      }
      A *= 2;
      B /= 2;
    }

    if (origA > 0 && origB < 0) {
      em *= -1;
    }

    if (em < 0) {
      System.out.println("Proizvod je negativan.");
    } else if (em == 0) {
      System.out.println("Proizvod je nula.");
    } else {
      System.out.println("Proizvod je pozitivan.");
    }

    System.out.println("Proizvod dva broja je: " + em);
  }
}
