public class Program {
  public interface IShape {
    public String name();

    public double circumference();

    public double area();
  }

  public interface IPrintable {
    public void print();
  }

  public static class Circle implements IShape, IPrintable {
    public Circle(double r) {
      radius = r;
    }

    public String name() {
      return "Circle";
    }

    public double circumference() {
      return 2 * radius * Math.PI;
    }

    public double area() {
      return radius * radius * Math.PI;
    }

    public void print() {
      System.out.println("Object name: " + this.name());
      System.out.println("Area: " + this.area());
      System.out.println("circumference: " + this.circumference());
    }

    private double radius;
  }

  public static class Rectangle implements IShape, IPrintable {
    public Rectangle(double a, double b) {
      sideA = a;
      sideB = b;
    }

    public String name() {
      return "Rectangle";
    }

    public double circumference() {
      return 2 * sideA + 2 * sideB;
    }

    public double area() {
      return sideA * sideB;
    }

    public void print() {
      System.out.println("Object name: " + this.name());
      System.out.println("Area: " + this.area());
      System.out.println("circumference: " + this.circumference());
    }

    private double sideA;
    private double sideB;
  }

  public static class Square implements IShape, IPrintable {
    public Square(double a) {
      side = a;
    }

    public String name() {
      return "Square";
    }

    public double circumference() {
      return 4 * side;
    }

    public double area() {
      return side * side;
    }

    public void print() {
      System.out.println("Object name: " + this.name());
      System.out.println("Area: " + this.area());
      System.out.println("circumference: " + this.circumference());
    }

    private double side;
  }

  public static void main(String[] args) {
    Circle c = new Circle(2.5);
    c.print();

    Rectangle r = new Rectangle(2, 4);
    r.print();

    Square s = new Square(8);
    s.print();
  }
}
