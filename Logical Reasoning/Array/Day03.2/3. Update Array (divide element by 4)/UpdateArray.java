import java.util.Scanner;

public class UpdateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        updateArray(array);
        printArray(array);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void updateArray(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            int result = array[i] / 4;
            if (result == 0) {
                array[i] = -1;
            } else {
                array[i] = result;
            }
        }
    }

    public static void printArray(int[] array) {
        System.out.println("Update Array : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}