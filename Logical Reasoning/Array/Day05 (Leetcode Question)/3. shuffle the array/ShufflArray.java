import java.util.Arrays;
import java.util.Scanner;

public class ShufflArray {
    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int[] shuffle(int[] array, int size) {
        int[] result = new int[size];
        for (int i = 0; i < size / 2; i++) {
            result[2 * i] = array[i];
            result[2 * i + 1] = array[(size / 2) + i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        int[] shuffle = shuffle(array, size);
        System.out.println("shuffle array : " + Arrays.toString(shuffle));
    }
}