package Task2;

public class T2 {
    public static void collatzConjecture(int n) {
        while (n > 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        collatzConjecture(6);
    }
}
