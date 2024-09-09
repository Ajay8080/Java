import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        int remDupli = removeDuplicates(array);

        printArray(array, remDupli);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[" + array.length + "]");
        for (int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int removeDuplicates(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < array.length; j++) {
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }
            return i+1;
    }

    public static void printArray(int[] array, int remDupli) {
        System.out.println("After removing duplicates: ");
        for (int i=0; i<remDupli; i++) {
            System.out.print(array[i] + " ");
        }
    }
}