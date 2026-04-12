import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Zadatak1 {
  public static boolean checkMagic(ArrayList<ArrayList<Integer>> s) {
    int sum = 0;

    for (int col : s.getFirst()) {
      sum += col;
    }

    return checkRows(s, sum) && checkCols(s, sum) && checkDiags(s, sum);
  }

  public static boolean checkRows(ArrayList<ArrayList<Integer>> s, int sum) {
    for (ArrayList<Integer> row : s) {
      int rowSum = 0;
      for (int i : row) {
        rowSum += i;
      }

      if (sum != rowSum) {
        return false;
      }
    }
    return true;
  }

  public static boolean checkCols(ArrayList<ArrayList<Integer>> s, int sum) {
    for (int i = 0; i < s.size(); ++i) {
      int colSum = 0;
      for (int j = 0; j < s.get(i).size(); ++j) {
        colSum += s.get(j).get(i);
      }

      if (sum != colSum) {
        return false;
      }
    }
    return true;
  }

  public static boolean checkDiags(ArrayList<ArrayList<Integer>> s, int sum) {
    return checkPrimaryDiag(s, sum) && checkSecondaryDiag(s, sum);
  }

  public static boolean checkPrimaryDiag(ArrayList<ArrayList<Integer>> s, int sum) {
    int diagSum = 0;
    for (int i = 0; i < s.size(); ++i) {
      diagSum += s.get(i).get(i);
    }

    return sum == diagSum;
  }

  public static boolean checkSecondaryDiag(ArrayList<ArrayList<Integer>> s, int sum) {
    int diagSum = 0;
    for (int i = 0; i < s.size(); ++i) {
      diagSum += s.get(i).get(s.size() - i - 1);
    }

    return sum == diagSum;
  }

  public static void printSquare(ArrayList<ArrayList<Integer>> square) {
    for (ArrayList<Integer> row : square) {
      for (int col : row) {
        System.out.print(col + "\t");
      }
      System.out.println();
    }
  }

  public static void readSquare(ArrayList<ArrayList<Integer>> square, String file) {
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] lineSplit = line.split("\\s+");

        if (lineSplit.length == 1) continue;

        ArrayList<Integer> row = new ArrayList<Integer>();

        for (String part : lineSplit) {
          row.add(Integer.parseInt(part.trim()));
        }

        square.add(row);
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public static boolean checkDimensions(ArrayList<ArrayList<Integer>> square) {
    if (square.isEmpty()) {
      return false;
    }

    int len = square.size();

    for (ArrayList<Integer> row : square) {
      if (row.isEmpty() || row.size() != len) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> square = new ArrayList<ArrayList<Integer>>();

    if (args == null || args.length == 0) {
      System.err.println("No file provided!");
      System.exit(1);
    }

    String file = args[0];

    readSquare(square, file);

    if (!checkDimensions(square)) {
      System.err.println("Invalid dimensions!");
      System.exit(1);
    }

    printSquare(square);

    System.out.println("Is loaded square a magic square: " + checkMagic(square));
  }
}
