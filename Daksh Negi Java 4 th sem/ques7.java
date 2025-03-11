import java.util.Scanner;
public class ques7{
    public static void findSaddlePoint(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            int minRow = mat[i][0], colIndex = 0;
            for (int j = 1; j < n; j++) {
                if (mat[i][j] < minRow) {
                    minRow = mat[i][j];
                    colIndex = j;
                }
            }
            boolean isSaddlePoint = true;
            for (int k = 0; k < n; k++) {
                if (mat[k][colIndex] > minRow) {
                    isSaddlePoint = false;
                    break;
                }
            }
            if (isSaddlePoint) {
                System.out.println("Saddle Point: " + minRow + " at (" + i + ", " + colIndex + ")");
                return;
            }
        }
        System.out.println("No Saddle Point Found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll No. - 2318686");
        System.out.print("Enter matrix size (n x n): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        findSaddlePoint(mat, n);
        sc.close();
    }
}
