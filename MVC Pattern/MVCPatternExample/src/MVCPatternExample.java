public class MVCPatternExample {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student();
        student.setName("John Doe");
        student.setId("1");
        student.setGrade("A");

        // Create a view
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(student, view);

        // Display student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
