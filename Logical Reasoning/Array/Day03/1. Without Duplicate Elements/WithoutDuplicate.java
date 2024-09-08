
/*Given a sorted array of integers, remove duplicates such that each element appears only once. Print the elements without duplicates.

Input:
nums = [1, 1, 2, 2, 3, 4, 4, 5]
Output:
[1, 2, 3, 4, 5] */
import java.util.Scanner;
import java.util.Arrays;

public class WithoutDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        Arrays.sort(array);
        System.out.println("-------After Duplication--------");
        removeDuplicates(array);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void removeDuplicates(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is Empty!!");
            return;
        }
        System.out.print(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                System.out.print(" " + array[i]);
            }
        }
    }
}