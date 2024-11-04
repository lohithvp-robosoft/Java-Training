//1.Create a Student class that implements the Comparable<Student> interface. Students should be compared based on their grades. Write a method to sort a list of students.

package Task7.Question1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {

        List<Student> StudentRecord = Arrays.asList(
                new Student(10, 'C', "Rahul"),
                new Student(13, 'A', "Vishal"),
                new Student(9, 'B', "kiran"),
                new Student(11, 'A', "Chetan")
        );

        Collections.sort(StudentRecord);
        System.out.println(StudentRecord);

    }
}
