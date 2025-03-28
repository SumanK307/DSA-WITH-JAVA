package _05_ARRAY;

import java.util.Scanner;

public class D08_Eight {

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // **********************(Q.1)By using Extra space Rotate
    // Array***********************/
    static int[] Rotate(int[] arr, int k, int n) { // Array Function
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    // *********************(Q.2)Without using extra space Rotate
    // Array*********************/
    static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void RotateEasy(int[] arr, int k, int n) {
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        System.out.print("Enter Array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr, n);
        System.out.print("Enter the index number which step do you want to rotate:");
        int k = sc.nextInt();
        int[] ans = Rotate(arr, k, n); // Q.1
        System.out.print("After rotation Array without extra space:"); // Q.2
        RotateEasy(arr, k, n);
        printArray(arr, n);

    }

}