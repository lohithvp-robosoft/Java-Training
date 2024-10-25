//2. Compare the performance of using String for concatenation in a loop versus using StringBuilder.

package Task5;

public class Q2 {
    public static void main(String[] args) {
        String[] strArr = {"Hello ", "Every ", "One ", ", Happy ", "to ", "Meet ", "You ", "all"};

        String str = "";
        long startTimeString = System.currentTimeMillis();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < 10000; j++) {
                str += strArr[i];
            }
        }
        long stopTimeString = System.currentTimeMillis();
        double resString = (stopTimeString - startTimeString) / 1000.0;
        System.out.println("Using String: " + resString + " s");


        StringBuilder strBuilder = new StringBuilder();
        long startTimeStringBuilder = System.currentTimeMillis();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < 10000; j++) {
                strBuilder.append(strArr[i]);
            }
        }
        long stopTimeStringBuilder = System.currentTimeMillis();
        double resStringBuilder = (stopTimeStringBuilder - startTimeStringBuilder) / 1000.0;
        System.out.println("Using StringBuilder: " + resStringBuilder + " s");
    }
}





