import java.util.Arrays;
import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll no. - 2318686");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements-");
        for(int i=0; i<n; i++){
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        boolean flag = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (flag && arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            } else if (!flag && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            flag = !flag;
        }
        System.out.println("Zig-Zag Array: " + Arrays.toString(arr));
    }
}


 
