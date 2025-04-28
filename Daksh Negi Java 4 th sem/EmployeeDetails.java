import java.util.Scanner;

class InvalidEmployeeDataException extends Exception {
    public InvalidEmployeeDataException(String message) {
        super(message);
    }
}

public class EmployeeDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID (2001-5001): ");
            int empId = scanner.nextInt();
            scanner.nextLine();

            if (empId < 2001 || empId > 5001) {
                throw new InvalidEmployeeDataException("Employee ID must be between 2001 and 5001.");
            }

            System.out.print("Enter Employee Name (First letter capital): ");
            String empName = scanner.nextLine().trim();

            if (empName.isEmpty() || !Character.isUpperCase(empName.charAt(0))) {
                throw new InvalidEmployeeDataException("Employee Name must start with a capital letter.");
            }

            System.out.print("Enter Department ID (1-5): ");
            int deptId = scanner.nextInt();

            if (deptId < 1 || deptId > 5) {
                throw new InvalidEmployeeDataException("Department ID must be between 1 and 5.");
            }

            System.out.println("\n--- Employee Details ---");
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + empName);
            System.out.println("Department ID: " + deptId);

        } catch (InvalidEmployeeDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred. Please enter valid input.");
        } finally {
            scanner.close();
        }
    }
}
