import java.util.Arrays;

class ArrayDemo {
    void arrayFunc(int arr[], int target) {
        System.out.println("Pairs of elements whose sum is " + target + " are:");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
    void arrayFunc(int A[], int p, int B[], int q) {
        int merged[] = new int[p + q];
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (A[i] < B[j]) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }
        while (i < p) merged[k++] = A[i++];
        while (j < q) merged[k++] = B[j++];
        System.arraycopy(merged, 0, A, 0, p);
        System.arraycopy(merged, p, B, 0, q);
        System.out.println("Modified A: " + Arrays.toString(A));
        System.out.println("Modified B: " + Arrays.toString(B));
    }


    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();

        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll No. - 2318686\n");
        int numbers[] = {4, 6, 5, -10, 8, 5, 20};
        int target = 10;
        obj.arrayFunc(numbers, target);

        int A[] = {1, 5, 9, 10};
        int B[] = {2, 3, 8, 13, 15};
        int p = A.length, q = B.length;
        obj.arrayFunc(A, p, B, q);
    }
}
