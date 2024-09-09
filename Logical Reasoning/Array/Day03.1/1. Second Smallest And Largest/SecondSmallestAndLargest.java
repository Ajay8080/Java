
/*Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
input : 1 3 5 6 6 7 7 11 11
Output: 7 */
import java.util.Scanner;
import java.util.Arrays;

public class SecondSmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array Element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        Arrays.sort(array);

        int secondSmallest = findSecondSmallest(array);
        int secondLargest = findSecondLargest(array);

        System.out.println("Second Smallest Element: " + (secondSmallest != -1 ? secondSmallest : -1));
        System.out.println("Second Largest Element: " + (secondLargest != -1 ? secondLargest : -1));

    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[" + array.length + "]");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int findSecondSmallest(int[] array) {
        int smallest = array[0];
        int secondSmallest = -1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > smallest) {
                secondSmallest = array[i];
                break;
            }
        }
        return secondSmallest;
    }

    public static int findSecondLargest(int[] array) {
        int largest = array[array.length - 1];
        int secondLargest = -1;

        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] < largest) {
                secondLargest = array[i];
                break;
            }
        }

        return secondLargest;
    }
}
