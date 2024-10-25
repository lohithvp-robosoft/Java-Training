//1. write a program to  convert a String to a StringBuilder and back to a String with some examples.

package Task5;

public class Q1 {

//    public static void test(StringBuilder ss){
//        ss.append("Testing");
//    }
    public static void main(String[] args) {
        String str = "Hello world";
        StringBuilder stringBuilder = new StringBuilder(str);

        str = stringBuilder.toString();
        System.out.println(str);

//        test(stringBuilder);
//        System.out.println(stringBuilder);
    }
}
