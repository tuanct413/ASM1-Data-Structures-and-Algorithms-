public class StackStudents {
    private Node top;
    private int size;

    public StackStudents() {
        top = null;
        size = 0;
    }
    public void push(Students student) {
        Node node = new Node(student);
        node.next = top;
        top = node;
        size++;
        System.out.println("inserted " + student);
    }
    public Students pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No students to remove.");
            return null;
        }
        Students poppedStudent = top.students;
        top = top.next;
        size--;
        return poppedStudent;
    }
    public boolean isEmpty() {
        return top == null; // Stack is empty if top is null
    }
    public Students peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return null;
        }
        return top.students;
    }
    public int size() {
        return size; // Return current size of the stack
    }


}

