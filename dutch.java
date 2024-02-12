import java.util.Scanner;
public class dutch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        sortArray(a, size);
        printArray(a, size);
    }

    public static void sortArray(int[] a, int size) {
        int low = 0;
        int high = size - 1;
        int mid = 0;
        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, low, mid);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else if (a[mid] == 2) {
                swap(a, mid, high);
                high--;
            }

        }
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void printArray(int a[], int size){
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
    
