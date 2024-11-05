//1. Create a method that takes a string and tries to parse it as an integer. Handle both NumberFormatException and any NullPointerException that may occur.
//==============================================================
package Task8;

public class Q1 {
    public static void stringToInt(String str) {
        try {
            System.out.println(str.length());
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {

            System.out.println("Please provide a proper string: " + e);

        } catch (NullPointerException e) {
            System.out.println("Make sure not to provide null: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        stringToInt(null);
    }
}
