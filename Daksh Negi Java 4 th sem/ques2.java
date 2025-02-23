import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll no. - 2318686");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select Deposit Type:");
        System.out.println("1. Term Deposit");
        System.out.println("2. Recurring Deposit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter Principal amount (P): ");
                double p = scanner.nextDouble();
                System.out.print("Enter Rate of Interest (R in %): ");
                double r = scanner.nextDouble();
                System.out.print("Enter Time period in years (N): ");
                int n = scanner.nextInt();
                
                double a = p * Math.pow((1 + r / 100), n);
                System.out.printf("Maturity Amount: %.2f\n", a);
                break;
            
            case 2: 
                System.out.print("Enter Monthly Installment (P): ");
                double pRd = scanner.nextDouble();
                System.out.print("Enter Rate of Interest (R in %): ");
                double rRd = scanner.nextDouble();
                System.out.print("Enter Time period in months (N): ");
                int nRd = scanner.nextInt();
                
                double aRd = pRd * nRd + (pRd * nRd * (nRd + 1) / 2 * rRd / 100 * (1.0 / 12));
                System.out.printf("Maturity Amount: %.2f\n", aRd);
                break;
            
            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }
        
    }
}
