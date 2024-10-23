//5. Create an interface Vehicle with methods start() and stop(). Implement this interface in classes Bike and Car, providing specific implementations for each.

package Task4.Question5;

public class Q5 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        bike.stop();

        Car car = new Car();
        car.start();
        car.stop();
    }
}
