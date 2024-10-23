//1. Create a base class called Animal with a method sound(). Derive two subclasses, Dog and Cat, that override the sound() method to return their respective sounds.


package Task4.Question1;

public class Q1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.sound();

        Cat cat1 = new Cat();
        cat1.sound();
    }
}
