public class Main1 {

    public static void main(String[] args) {
        StackStudents stack = new StackStudents();
        // Thêm sinh viên vào Stack
        stack.push(new Students(6, "Alice", 6));
        stack.push(new Students(8, "Bob", 7));
        stack.push(new Students(5, "Charlie", 8));

        // Kiểm tra sinh viên trên cùng
        System.out.println("Top student: " + stack.peek());

        // Lấy sinh viên ra khỏi Stack
        System.out.println("Popped student: " + stack.pop());

        // Xem lại sinh viên trên cùng sau khi pop
        System.out.println("Top student after pop: " + stack.peek());

        // Kiểm tra Stack có rỗng không
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Lấy kích thước của Stack
        System.out.println("Current stack size: " + stack.size());
    }
}
