//4. Define a custom exception class called InvalidAgeException. Write a method that checks if a person's age is valid (between 0 and 120). If the age is invalid, throw the InvalidAgeException.
//========================================================

package Task8.Question4;

public class Q4 {
    public static void checkValidAge(int age) {
        try {
            if (age > 0 && age < 120) {
                System.out.println(age);
                return;
            }
            throw new InvalidAgeException("msg: Invalid Age");

        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        checkValidAge(0);
    }
}
