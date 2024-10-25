//2. Write a program that demonstrates both compile-time and runtime polymorphism using method overloading and method overriding.

package Task4.Question2;

public class Q2 {
    public static void main(String[] args) {
        ParentClass obj = new ChildClass();

        obj.display();

        obj.greet("Hello", 3);
        obj.greet();
    }
}
