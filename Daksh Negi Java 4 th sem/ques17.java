import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class MyCalculator {

    public int power(int n, int p) throws MyException {
        if (n < 0 || p < 0) {
            throw new MyException("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new MyException("n and p should not be zero.");
        } else {
            return (int) Math.pow(n, p);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            try {
                int result = calculator.power(n, p);
                System.out.println(result);
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
