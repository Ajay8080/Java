import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        System.out.print("Missing Number is: ");
        findMissingNumber(array);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void findMissingNumber(int[] array) {
        int size = array.length + 1;

        int expectedSum = size * (size + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        System.out.println(expectedSum - actualSum);
    }
}