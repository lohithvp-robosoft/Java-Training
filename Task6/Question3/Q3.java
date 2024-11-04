//3.[
//        {
//        "id": 1,
//        "name": "Alice",
//        "grades": [88, 92, 95]
//        },
//        {
//        "id": 2,
//        "name": "Bob",
//        "grades": [78, 85, 82]
//        }
//        ]
//
//        i.Write a method that calculates the average grade for each student in an ArrayList<Student> and returns a map of student names to their average grades.
//        ii. Write a method that groups students based on their average grades into different ranges (e.g., "A", "B", "C").

package Task6.Question3;

import Task6.Question2.BookDetail;

import java.util.*;

public class Q3 {

    public static HashMap<String, Float> calculateAvg(List<StudentGrade> studentList) {
        HashMap<String, Float> studentsAvg = new HashMap<>();
        for (StudentGrade studentGrade : studentList) {
            float avgMark = (float) Arrays.stream(studentGrade.getGrades()).average().getAsDouble();
            studentsAvg.put(studentGrade.getName(), avgMark);
        }
        return studentsAvg;
    }

    public static HashMap<Character, ArrayList<String>> groupGrades(HashMap<String, Float> avgGrade) {
        HashMap<Character, ArrayList<String>> map = new HashMap<>();
        avgGrade.forEach((name, avg) -> {
            if (avg > 85) {
                map.computeIfAbsent('A', k -> new ArrayList<>()).add(name);
//                if (map.containsKey('A')) {
//                    map.get('A').add(name);
//
//                } else {
//                    map.put('A', new ArrayList<>());
//                    map.get('A').add(name);
//                }
            } else if (avg > 70) {
                map.computeIfAbsent('B', k -> new ArrayList<>()).add(name);
//                if (map.containsKey('B')) {
//                    map.get('B').add(name);
//
//                } else {
//                    map.put('B', new ArrayList<>());
//                    map.get('B').add(name);
//                }
            } else if (avg > 50) {
                map.computeIfAbsent('C', k -> new ArrayList<>()).add(name);
            } else {
                map.computeIfAbsent('F', k -> new ArrayList<>()).add(name);
            }
        });
        return map;
    }

    public static void main(String[] args) {
        StudentGrade student1 = new StudentGrade(1, "Alice", new int[]{88, 92, 95});
        StudentGrade student2 = new StudentGrade(2, "Bob", new int[]{78, 85, 82});
        StudentGrade student3 = new StudentGrade(3, "Tom", new int[]{88, 92, 9});
        StudentGrade student4 = new StudentGrade(1, "Jack", new int[]{88, 29, 95});

        ArrayList<StudentGrade> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        HashMap<String, Float> avgGrade = new HashMap<>();
        avgGrade = calculateAvg(studentList);
        System.out.println(avgGrade);

        System.out.println(groupGrades(avgGrade));
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using reduce() to sum the elements
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

    }
}




