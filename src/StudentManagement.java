public class StudentManagement {
    StudentStack studentStack;

    public StudentManagement() {
        studentStack = new StudentStack();
    }

    public void addStudent(Student student) {
        studentStack.push(student);
    }

    public void editStudent(int id, String newName, double newScore) {
        studentStack.editStudent(id, newName, newScore);
    }

    public void deleteStudent(int id) {
        studentStack.deleteStudent(id);
    }

    public void displayAllStudents() {
        studentStack.displayStudents();
    }
}
