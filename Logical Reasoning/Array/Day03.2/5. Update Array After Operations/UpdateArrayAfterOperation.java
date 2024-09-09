import java.util.Scanner;

public class UpdateArrayAfterOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        
        System.out.println("Enter the number of operations (k): ");
        int k = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        updateArrayAfterOperation(array, k);
    }

    
    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + array.length + " elements:");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void performOperation(int[] array, int mx) {
        for (int i = 0; i < array.length; i++) {
            array[i] = mx - array[i];
        }
    }

    public static void updateArrayAfterOperation(int[] array, int k) {
        if (k == 0) {
            printArray(array);
            return;
        }

        int mx = findMax(array);
        performOperation(array, mx);

        if (k % 2 == 1) {
            printArray(array);
            return;
        }

        mx = findMax(array);
        performOperation(array, mx);

        printArray(array);
    }

    public static int findMax(int[] array) {
        int mx = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > mx) {
                mx = num;
            }
        }
        return mx;
    }

    public static void printArray(int[] array) {
        System.out.println("Updated array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
