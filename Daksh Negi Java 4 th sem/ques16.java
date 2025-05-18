import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidEmployeeIdException extends Exception {
    public InvalidEmployeeIdException(String message) {
        super(message);
    }
}

class InvalidDepartmentIdException extends Exception {
    public InvalidDepartmentIdException(String message) {
        super(message);
    }
}

public class  ques16{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Employee ID (2001 to 5001): ");
            int empId = Integer.parseInt(scanner.nextLine());
            validateEmployeeId(empId);

            System.out.print("Enter Employee Name (First letter capital): ");
            String empName = scanner.nextLine();
            validateEmployeeName(empName);

            System.out.print("Enter Department ID (1 to 5): ");
            int deptId = Integer.parseInt(scanner.nextLine());
            validateDepartmentId(deptId);

            System.out.println("\nEmployee Details:");
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + empName);
            System.out.println("Department ID: " + deptId);

        } catch (InvalidNameException | InvalidEmployeeIdException | InvalidDepartmentIdException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: Please enter valid numeric values for Employee ID and Department ID.");
        } finally {
            scanner.close();
        }
    }

    private static void validateEmployeeId(int id) throws InvalidEmployeeIdException {
        if (id < 2001 || id > 5001) {
            throw new InvalidEmployeeIdException("Employee ID must be between 2001 and 5001.");
        }
    }

    private static void validateEmployeeName(String name) throws InvalidNameException {
        if (name.isEmpty()) {
            throw new InvalidNameException("Employee name cannot be empty.");
        }
        char firstChar = name.charAt(0);
        if (!Character.isUpperCase(firstChar)) {
            throw new InvalidNameException("First letter of employee name must be capital.");
        }
    }

    private static void validateDepartmentId(int deptId) throws InvalidDepartmentIdException {
        if (deptId < 1 || deptId > 5) {
            throw new InvalidDepartmentIdException("Department ID must be between 1 and 5.");
        }
    }
}
