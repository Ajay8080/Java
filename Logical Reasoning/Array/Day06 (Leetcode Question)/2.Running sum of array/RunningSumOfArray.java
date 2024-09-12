import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        System.out.println("Running sum of the array: " + Arrays.toString(runningSum(array)));
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: " + array.length);
        System.out.println("Enter array elements:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int[] runningSum(int[] array) {
        int[] result = new int[array.length];

        result[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] + array[i];
        }

        return result;
    }
}
