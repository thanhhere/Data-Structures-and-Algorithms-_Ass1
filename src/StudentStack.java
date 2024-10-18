public class StudentStack {
    private Node top;
    private int size;

    public StudentStack() {
        top = null;
        size = 0;
    }

    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Added: " + student);
    }

    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No students to remove.");
            return null;
        }
        Student poppedStudent = top.student;
        top = top.next;
        size--;
        return poppedStudent;
    }

    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return top.student;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("No students in the stack.");
            return;
        }

        System.out.println("Students in Stack:");
        Node current = top;
        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }

    public void editStudent(int id, String newName, double newScore) {
        Node current = top;
        while (current != null) {
            if (current.student.getId() == id) {
                current.student = new Student(id, newName, newScore);
                System.out.println("Edited: " + current.student);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void deleteStudent(int id) {
        Node current = top, prev = null;

        while (current != null) {
            if (current.student.getId() == id) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    top = current.next;
                }
                size--;
                System.out.println("Deleted student with ID: " + id);
                return;
            }
            prev = current;
            current = current.next;
        }
        System.out.println("Student with ID " + id + " not found.");
    }

}
