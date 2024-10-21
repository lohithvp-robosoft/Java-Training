package Task2;
import java.util.*;

public class T4 {
    public static void checkOvels(char ch) {
        switch (ch) {
            case 'A', 'E', 'I', 'O', 'U': {
                System.out.println("The given character is a Ovel");
                break;
            }
            default:
                System.out.println("The given character is a Consonant");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        System.out.println("Enter a character: ");
        while (check) {
            String str = sc.next();
            str = str.toUpperCase().trim();
            if (str.length() == 1 && str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                checkOvels(str.charAt(0));
                check = false;
                break;
            }
            System.out.println("Please Enter a proper character");
        }
    }
}
