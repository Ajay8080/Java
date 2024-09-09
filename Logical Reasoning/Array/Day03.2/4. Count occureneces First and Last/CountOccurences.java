import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        System.out.println("Enter the value for x : ");
        int x = sc.nextInt();

        System.out.println(x+" occurrence : "+countOccurrences(array, x));
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int firstOccurences(int[] array, int x) {
        int low = 0, high = array.length - 1, firstOccurrence = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == x) {
                firstOccurrence = mid;
                high = mid - 1;
            } else if (array[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return firstOccurrence;
    }

    public static int lastOccurences(int[] array, int x) {
        int low = 0, high = array.length - 1, lastOccurrence = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == x) {
                lastOccurrence = mid;
                low = mid + 1;
            } else if (array[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lastOccurrence;
    }

    public static int countOccurrences(int[] arr, int x) {
        int first = firstOccurences(arr, x);
        if (first == -1) {
            return 0; 
        }
        int last = lastOccurences(arr, x);
        return last - first + 1;
    }
}