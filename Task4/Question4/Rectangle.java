package Task4.Question4;

public class Rectangle extends Shape {
    float length, breadth;

    Rectangle(float length, float breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    void area() {
        double res = breadth * length;
        System.out.println("The area of the rectangle is " + res);
    }
}
