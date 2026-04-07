import java.util.Scanner;
import javax.swing.JOptionPane;

public class Strings {
  public static void main(String[] args) {
    String names[] = new String[] {"Jomu", "Mushe"};

    for (String name : names) {
      System.out.println(name);
    }

    names[0] = names[0].replace('J', 'K');

    for (String name : names) {
      System.out.println(name);
    }

    String input = JOptionPane.showInputDialog("Hello");
    System.out.println(input);

    Scanner console = new Scanner(System.in);

    int a = console.nextInt();

    double b = console.nextDouble();

    console.close();
  }
}
