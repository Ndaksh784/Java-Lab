import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll no. - 2318686");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        String result = String.valueOf(num).replace('0', '1');
        System.out.println("Modified Number: " + result);
    }
}
