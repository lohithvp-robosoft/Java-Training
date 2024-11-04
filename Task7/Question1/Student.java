package Task7.Question1;

public class Student implements Comparable<Student> {
    private Integer age;
    private Character grade;
    private String name;

    public Student(Integer age, Character grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    @Override
    public int compareTo(Student obj) {
        return Integer.compare(this.grade, obj.grade);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{ Name: " + name + ", Age: " + age + ", Grade: " + grade + " }";
    }
}
