//4. Create Java classes that showcase the default methods of String, StringBuilder, and StringBuffer

package Task5;

public class Q4 {
    public static void main(String[] args) {
        String str = new String("Hello world");
        StringBuilder strBuilder = new StringBuilder("Hello world");
        StringBuffer strBuffer = new StringBuffer("Hello world");


        System.out.println( str.toLowerCase());
        str.trim();
        str.contains("rld");
        str.endsWith("ok");

        strBuilder.append(" Good morning");
        strBuilder.insert(1, "re");
        strBuilder.reverse();
        strBuilder.setCharAt(1, 'a');

        strBuffer.delete(0, 2);
        String str1 = strBuffer.toString();
        CharSequence st = strBuffer.subSequence(1, 4);
        strBuffer.trimToSize();

        System.out.println(strBuffer);
        System.out.println(strBuffer.toString());


//        Access specifier
//        Dog dog = new Dog();
//        dog.testing();
    }

}
