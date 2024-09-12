import java.util.Scanner;

public class RearrangeArray {
    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + array.length + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void rearrangeArray(int[] array) {
        int[] positive = new int[array.length];
        int[] negative = new int[array.length];

        int posIndex = 0, negIndex = 0;

        for (int num : array) {
            if (num >= 0) {
                positive[posIndex++] = num;
            } else {
                negative[negIndex++] = num;
            }
        }

        int i = 0, p = 0, n = 0;

        while (p < posIndex && n < negIndex) {
            if (i % 2 == 0) {
                array[i++] = negative[n++];
            } else {
                array[i++] = positive[p++];
            }
        }

        while (p < posIndex) {
            array[i++] = positive[p++];
        }

        while (n < negIndex) {
            array[i++] = negative[n++];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        getArrayElement(array);

        rearrangeArray(array);

        System.out.println("Rearranged array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
