package Task4.Question2;

public class ParentClass {
    void greet(String str, int i) {
        while (i > 0) {
            System.out.println(str + " : " + i);
            i--;
        }
    }

    void greet() {
        System.out.println("Hi");
    }

    void display() {
        System.out.println("Hello from Parent Class");
    }
}
