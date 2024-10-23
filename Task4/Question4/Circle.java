package Task4.Question4;

public class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double res = 3.14 * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + res);
    }
}
