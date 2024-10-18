public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();

        // Adding students
        studentManagement.addStudent(new Student(1, "Thành", 9.2));
        studentManagement.addStudent(new Student(2, "Hưng", 7.8));
        studentManagement.addStudent(new Student(3, "Trung", 5.4));



        studentManagement.displayAllStudents();


        studentManagement.editStudent(2, "Hưng", 8.0);


        studentManagement.displayAllStudents();


        studentManagement.deleteStudent(1);


        studentManagement.displayAllStudents();
    }
}
