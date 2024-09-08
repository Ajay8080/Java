
/*You are given a sorted array containing n-1 unique integers in the range from 1 to n. 
There may be one or more integers missing from the array. Write a method to find and print all missing integers.

Example:
Input:
nums = [1, 2, 4, 7, 19]
Output:
[3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
 */
import java.util.Scanner;

public class MissingAllNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        findMissingAllElements(array, size);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void findMissingAllElements(int[] array, int size) {
        for (int i = 1; i < array[0]; i++) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array[i] + 1; j < array[i + 1]; j++) {
                System.out.print(j + " ");
            }
        }

        for (int i = array[array.length - 1] + 1; i <= size; i++) {
            System.out.print(i + " ");
        }

    }
}