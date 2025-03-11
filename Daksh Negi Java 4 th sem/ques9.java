import java.util.Scanner;

class Bank {
    private static int accountCounter = 1001;
    private String name;
    private String address;
    private int accountNumber;
    private double balance;
    public Bank(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.accountNumber = accountCounter++;
    }
    public void displayInfo() {
        System.out.println("\nAccount Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    } 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }
   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }
    public void changeAddress(String newAddress) {
        address = newAddress;
        System.out.println("Address Updated Successfully!");
    }
    public int getAccountNumber() {
        return accountNumber;
    }
}

public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll No. - 2318686");

        System.out.print("\nEnter number of depositors: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Bank[] accounts = new Bank[n];

       
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();
            accounts[i] = new Bank(name, address, balance);
        }

        while (true) {
            System.out.println("\n--- Bank Operations ---");
            System.out.println("1. Display Depositor Info");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Change Address");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting... Thank you!");
                break;
            }

            System.out.print("Enter Account Number: ");
            int accNum = sc.nextInt();
            sc.nextLine(); 
            Bank selectedAccount = null;

            for (Bank acc : accounts) {
                if (acc.getAccountNumber() == accNum) {
                    selectedAccount = acc;
                    break;
                }
            }

            if (selectedAccount == null) {
                System.out.println("Invalid Account Number!");
                continue;
            }

            switch (choice) {
                case 1:
                    selectedAccount.displayInfo();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    selectedAccount.deposit(depositAmount);
                    selectedAccount.displayInfo();
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    selectedAccount.withdraw(withdrawAmount);
                    selectedAccount.displayInfo();
                    break;
                case 4:
                    System.out.print("Enter new address: ");
                    String newAddress = sc.nextLine();
                    selectedAccount.changeAddress(newAddress);
                    selectedAccount.displayInfo();
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
