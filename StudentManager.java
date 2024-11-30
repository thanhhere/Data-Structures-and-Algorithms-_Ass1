import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentStack studentManagement = new StudentStack();

        // Ask user for the number of students
        System.out.print("Enter the number of students to manage: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Add students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Student ID: ");
            String id = scanner.nextLine();

            System.out.print("Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Student Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character

            studentManagement.addStudent(new Student(id, name, marks));
        }

        // Main menu loop
        while (true) {
            System.out.println("\nStudent Management System:");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Sort Students");
            System.out.println("5. Search Student");
            System.out.println("6. Display All Students");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a new student
                    System.out.println("Enter details for the new student:");
                    System.out.print("Student ID: ");
                    String addId = scanner.nextLine();

                    System.out.print("Student Name: ");
                    String addName = scanner.nextLine();

                    System.out.print("Student Marks: ");
                    double addMarks = scanner.nextDouble();
                    scanner.nextLine();  // Consume the newline character

                    studentManagement.addStudent(new Student(addId, addName, addMarks));
                    break;

                case 2:
                    // Edit an existing student
                    System.out.print("Enter student ID to edit: ");
                    String editId = scanner.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter new marks: ");
                    double newMarks = scanner.nextDouble();
                    scanner.nextLine();  // Consume the newline character

                    studentManagement.editStudent(editId, newName, newMarks);
                    break;

                case 3:
                    // Delete a student
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    studentManagement.deleteStudent(deleteId);
                    break;

                case 4:
                    // Sort students by marks
                    studentManagement.sortStudents();
                    System.out.println("Students sorted by marks.");
                    break;

                case 5:
                    // Search for a student by ID
                    System.out.print("Enter student ID to search: ");
                    String searchId = scanner.nextLine();
                    Student foundStudent = studentManagement.searchStudent(searchId);
                    if (foundStudent != null) {
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    // Display all students
                    studentManagement.displayStudents();
                    break;

                case 7:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
