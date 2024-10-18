public class Task1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello");
        String firstName = "Jeevan";
        String lastName = "Jain";
        int age = 70;
        float height = 5.9f;
        double weight = 50.443;
        boolean isEmployed = true;

        String fullName = firstName + " " + lastName;
        fullName = "Mr. ".concat(fullName);
        System.out.println("Full Name: " + fullName);

        long ageInSeconds = (long) age * 365L * 24 * 60 * 60;
        System.out.println("Age in seconds: " + ageInSeconds);

        String[] skills = {"Java", "JavaScript", "SQL"};
        int numberOfSkills = skills.length;
        System.out.println("Number of skills: " + numberOfSkills);

        System.out.println("Weight: " + Math.round(weight));


    }
}