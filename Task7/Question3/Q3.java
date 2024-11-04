//3.Using the Employee class, which has fields for id and salary, write a method that sorts a list of employees by salary using a Comparator<Employee>. If two employees have the same salary, they should be sorted by their ID in ascending order.

package Task7.Question3;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        List<Employee> employeeRecord = Arrays.asList(
                new Employee(2, "Tom", 55000d),
                new Employee(3, "Jack", 90000d),
                new Employee(4, "Grey", 30000d),
                new Employee(1, "Jay", 55000d)
        );

        employeeRecord.sort(new SalaryCompare());
        System.out.println(employeeRecord);

    }
}
