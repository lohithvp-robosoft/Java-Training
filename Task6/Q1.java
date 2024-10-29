//1.Write a method that checks if an ArrayList<String> contains any duplicate elements.

package Task6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q1 {

    public static boolean checkDuplicate(List<String> lst) {
        HashSet<String> set = new HashSet<>(lst);
        return set.size() != lst.size();
    }

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("apple");
        lst.add("ball");
        lst.add("apple");
        lst.add("cat");
        lst.add("dog");
        if (checkDuplicate(lst)) {
            System.out.println("The ArrayList contains duplicate");
        } else {
            System.out.println("The ArrayList does not contains duplicate");
        }
    }
}
