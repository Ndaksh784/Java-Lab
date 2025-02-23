public class ques1 {
    public static void main(String[] args) {
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll no. - 2318686");

        if (args.length < 4) {
            System.out.println("Enter Name, University Roll No, Course, and Semester.");
            return;
        }
        System.out.println("Name: " + args[0]);
        System.out.println("University Roll No: " + args[1]);
        System.out.println("Course: " + args[2]);
        System.out.println("Semester: " + args[3]);
    }
}
