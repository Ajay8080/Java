import java.util.Scanner;

public class KthMaxElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        System.out.println("Enter the kth rank: ");
        int k = sc.nextInt();

        int result = findKthMax(array, k);
        System.out.println("Max is : " + result);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int findKthMax(int array[], int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }

        while (max >= min && k > 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == max) {
                    count++;
                }
            }

            if (count > 0) {
                k--;
            }

            max--;
        }

        if (k > 0)
            return -1;

        return max + 1;
    }
}
