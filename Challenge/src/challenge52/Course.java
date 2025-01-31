package challenge52;

public class Course {
    static int maxCapacity;
    String courseName;
    int enrollment;
    String[] enrolledStudent;
    static{
        maxCapacity=100;
    }

    Course(String courseName){
        this.courseName=courseName;
        this.enrollment=0;
        this.enrolledStudent=new String[maxCapacity];


    }


    static void setMaxCapacity(int capacity){
        maxCapacity = capacity;
    }

    public void enrollStudents(String studentName){
        if(enrollment < maxCapacity){
            enrolledStudent[enrollment]=studentName;
            enrollment++;
        } else {
            System.out.println("Course is full. Cannot enroll more students.");
        }
    }

    public void unenrollStudent(String studentName){
        for (int i = 0; i < enrollment; i++) {
            if (enrolledStudent[i].equals(studentName)) {
                // shift elements to fill the gap
                for (int j = i; j < enrollment - 1; j++) {
                    enrolledStudent[j] = enrolledStudent[j + 1];
                }
                enrollment--;
                System.out.println("Student removed");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Course course = new Course("Java Programming");
        course.enrollStudents("John Doe");
        course.enrollStudents("Jane Smith");
        course.unenrollStudent("John Doe");
    }
}

