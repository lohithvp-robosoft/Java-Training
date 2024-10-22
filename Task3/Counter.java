//Create a class Counter that has a static variable to count the number of instances created. Implement a constructor that increments this count each time a new object is instantiated. Provide a static method to get the current count.

package Task3;

public class Counter {
    private static int count = 0;

    Counter() {
        count++;
    }

    static void currentCounter() {
        System.out.println("Counter: " + count);
    }
}
