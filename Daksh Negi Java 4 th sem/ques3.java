import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll no. - 2318686");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();

        int sum1=0, sum2=0;
        for (int i = 1; i < n1; i++) {
            if(n1%i == 0){
                sum1+=i;
            }
        }
        sum1 += n1;

        for (int i = 1; i < n2; i++) {
            if(n2%i == 0){
                sum2+=i;
            }
        }
        sum2 += n2;

        if(sum1/n1 == sum2/n2){
            System.out.println("Friendly pair.");
        } else {
            System.out.println("Not a friendly pair.");
        }

    }
}

