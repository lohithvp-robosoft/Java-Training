//3. Demonstrate how to efficiently append multiple strings using StringBuilder.

package Task5;

public class Q3 {
    public static void main(String[] args) {
        String[] strArr = {"Hello ", "Every ", "One ", ", Happy ", "to ", "Meet ", "You ", "all"};
        StringBuilder strBuilder = new StringBuilder();
        for (String s : strArr) {
            strBuilder.append(s);
        }
        System.out.println(strBuilder);
    }
}
