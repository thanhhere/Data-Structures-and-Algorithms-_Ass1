import java.util.*;

public class StudentStack {
    private List<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    // Add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Edit a student's details
    public void editStudent(String id, String name, double marks) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(name);
                student.setMarks(marks);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Delete a student
    public void deleteStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    // Sort students by marks
    public void sortStudents() {
        students.sort(Comparator.comparingDouble(Student::getMarks).reversed());
    }

    // Search for a student by ID
    public Student searchStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
