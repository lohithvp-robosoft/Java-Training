//3. Create a generic class Pair<T, U> that can hold two values of different types (T and U). Implement methods to get and set the values and override toString() to display both values.
//===========================================================

package Task9.Question2;

public class Q2 {
    public static void main(String[] args) {
        Pair p1 = new Pair(9, "Hello");
        Pair p2 = new Pair("Hello", 8);
        Pair p3 = new Pair(1.8, 'a');

        p1.setVar1(9);
        p2.setVar1("Hi");
        p3.setVar1(1.5);
        p3.setVar2('v');

        System.out.println(p2.getVar1());
        System.out.println(p3);


    }
}
