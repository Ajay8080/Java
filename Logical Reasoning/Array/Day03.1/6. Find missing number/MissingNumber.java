import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        int[] array = new int[size - 1];

        getArrayElement(array);
        System.out.println("Missing Number : " + findMissingNumber(array, size));

    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int findMissingNumber(int[] array, int size) {
        int sumN = size * (size + 1) / 2;

        int sumArray = 0;

        for (int num : array) {
            sumArray += num;
        }
        return sumN - sumArray;
    }
}