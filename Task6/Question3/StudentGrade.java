package Task6.Question3;

public class StudentGrade {
    private int id;
    private String name;
    private int[] grades = new int[3];

    public StudentGrade(int id, String name, int[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

}
