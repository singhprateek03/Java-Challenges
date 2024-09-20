public class Course {
    static int maxCapacity = 120;
    String courseName;
    int enrollments;

    // Array declaration
    String[] enrolledStudent;
    
    // Constructor declaration
    Course(String courseName){
        this.courseName = courseName;   // user need to mentioned their course
        this.enrollments = 0;   // It takes by default 0
        this.enrolledStudent = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        // Calling static method using class name
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
            enrolledStudent[enrollments] = studentName;
            enrollments++;
    }

    void unenrollstudent(){
        System.out.println("Student removed.");
        enrollments--;
    }
}
