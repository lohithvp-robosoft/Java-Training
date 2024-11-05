//2. Create a method that catches an exception, adds some additional context, and then rethrows the same exception.
//=======================================================

package Task8;

public class Q2 {
    public static void divide(int a, int b) {
        try {
            int res = a / b;
            System.out.println("result: " + res);
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
//        int res = a / b;
    }

    public static void main(String[] args) {
        divide(1, 0);
    }
}
