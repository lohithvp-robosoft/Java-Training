package Task2;

public class T3 {
    public static void findOvelsAndConsonants(String str) {
        str = str.toUpperCase().trim();
        int ovelsCnt = 0;
        int consoCnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    ovelsCnt++;
                } else {
                    consoCnt++;
                }
            }
        }
        System.out.println("The number of ovels and consonants in the given string is " + ovelsCnt + " and " + consoCnt);
    }

    public static void main(String[] args) {
        findOvelsAndConsonants("Hello fsf 4 * j# jworne");
    }
}
