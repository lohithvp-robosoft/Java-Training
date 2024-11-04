package Task7.Question3;

import java.util.Comparator;

public class SalaryCompare implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() > o2.getSalary()) return 1;
        if (o1.getSalary() < o2.getSalary()) return -1;

        //if same
        if (o1.getId() > o2.getId()) return 1;

        return -1;

    }
}
