package MidtermPractice.TaskTwo;
import java.util.List;

public record Student(int studentId, String name, double grade) {}

class StudentAnalyzer {
    public double findAverageGrade(List<Student> students) {
        if (students == null || students.isEmpty()) {
            return 0.0; // Return 0 if the list is empty or null
        }

        double totalGrade = 0.0;

        for (Student student : students) {
            totalGrade += student.grade();
        }

        return totalGrade / students.size();
    }
}

class Main {
    public static void main(String[] args) {
        // Creating some sample students
        Student student1 = new Student(1, "Alice", 85.0);
        Student student2 = new Student(2, "Bob", 92.5);
        Student student3 = new Student(3, "Charlie", 78.3);
        Student student4 = new Student(4, "David", 89.7);

        // Creating a list of students
        List<Student> studentList = List.of(student1, student2, student3, student4);

        // Creating an instance of StudentAnalyzer
        StudentAnalyzer studentAnalyzer = new StudentAnalyzer();

        // Finding the average grade of students
        double averageGrade = studentAnalyzer.findAverageGrade(studentList);

        // Displaying the average grade
        System.out.println("Average Grade: " + averageGrade);
    }
}

