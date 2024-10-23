//4. Define an abstract class Shape with an abstract method area(). Implement subclasses Circle and Rectangle that provide their own implementations of area().

package Task4.Question4;

public class Q4 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.area();

        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.area();


    }
}
