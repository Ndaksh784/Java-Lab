class Student {
    private int studentId;
    private String name;
    private int age;

    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public String getStudentInfo() {
        return "Student ID: " + studentId + ", Name: " + name + ", Age: " + age;
    }
}

class Course {
    private String courseId;
    private String courseName;
    private int credits;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseInfo() {
        return "Course ID: " + courseId + ", Course Name: " + courseName + ", Credits: " + credits;
    }
}

class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public String getEnrollmentInfo() {
        return student.getStudentInfo() + "\nEnrolled in: " + course.getCourseInfo();
    }
}

public class ques15{
    public static void main(String[] args) {
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll No. - 2318686\n");

        Student student1 = new Student(101, "Daksh Negi", 20);
        Course course1 = new Course("CS101", "Data Structures", 3);

        Enrollment enrollment1 = new Enrollment(student1, course1);

        System.out.println(enrollment1.getEnrollmentInfo());
    }
}
