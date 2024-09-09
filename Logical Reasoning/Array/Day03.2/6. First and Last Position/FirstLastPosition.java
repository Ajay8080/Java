import java.util.Scanner;

public class FirstLastPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        getArrayElement(array, sc);

        System.out.println("Enter the target value: ");
        int x = sc.nextInt();

        int[] result = findFirstAndLastPosition(array, x);
        System.out.println(result[0] + " " + result[1]);
    }

    public static void getArrayElement(int[] array, Scanner sc) {
        System.out.println("Enter " + array.length + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int[] findFirstAndLastPosition(int[] array, int x) {
        int first = findFirstOccurrence(array, x);
        int last = findLastOccurrence(array, x);
        return new int[] { first, last };
    }

    public static int findFirstOccurrence(int[] array, int x) {
        int low = 0, high = array.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (array[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return first;
    }

    public static int findLastOccurrence(int[] array, int x) {
        int low = 0, high = array.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (array[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return last;
    }
}
