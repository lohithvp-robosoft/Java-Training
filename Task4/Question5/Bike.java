package Task4.Question5;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike has started");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped");
    }
}
