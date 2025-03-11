import java.util.Scanner;
public class ques6{
    public static void rearrangeArray(int[] arr, int n) {
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && arr[left] < 0) {
                left++;
            }
            while (left < right && arr[right] >= 0) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll No. - 2318686");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrangeArray(arr, n);
        System.out.print("Rearranged Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
