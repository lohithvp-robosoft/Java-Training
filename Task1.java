class Person_Model {
    int age;
    String firstName, lastName;
    float height;
    double weight;
    boolean isEmployed;
    String[] skills;

    public float getHeight() {
        return height;
    }

    public Person_Model(int age, String firstName, String lastName, float height, double weight, boolean isEmployed, String[] skills) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.isEmployed = isEmployed;
        this.skills = skills;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}

class View {
    public static void print(String val) {
        System.out.println(val);
    }
}

class Controller {
    public static void getFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        fullName = "Mr. ".concat(fullName);
        View.print("Full Name: " + fullName);
    }

    public static void ageInSeconds(int age) {
        long ageInSeconds = (long) age * 365L * 24 * 60 * 60;
        View.print("Age in seconds: " + ageInSeconds);
    }

    public static void numberOfSkills(String[] skills) {
        int numberOfSkills = skills.length;
        View.print("Number of skills: " + numberOfSkills);
    }

    public static void getWeight(double weight) {
        View.print("Weight: " + Math.round(weight));
    }
}

public class Task1 {
    public static void main(String[] args) {
        Person_Model person = new Person_Model(70, "Jeevan", "Jain", 5.9f, 50.443, true, new String[]{"Java", "JavaScript", "SQL"});

        Controller.getFullName(person.firstName, person.lastName);

        Controller.ageInSeconds(person.age);

        Controller.numberOfSkills(person.getSkills());

        Controller.getWeight(person.weight);

    }
}


//public class Task1 {
//    public static void main(String[] args) {
//        System.out.println();
//        System.out.println("Hello");
//        String firstName = "Jeevan";
//        String lastName = "Jain";
//        int age = 70;
//        float height = 5.9f;
//        double weight = 50.443;
//        boolean isEmployed = true;
//
//        String fullName = firstName + " " + lastName;
//        fullName = "Mr. ".concat(fullName);
//        System.out.println("Full Name: " + fullName);
//
//        long ageInSeconds = (long) age * 365L * 24 * 60 * 60;
//        System.out.println("Age in seconds: " + ageInSeconds);
//
//        String[] skills = {"Java", "JavaScript", "SQL"};
//        int numberOfSkills = skills.length;
//        System.out.println("Number of skills: " + numberOfSkills);
//
//        System.out.println("Weight: " + Math.round(weight));
//    }
//}