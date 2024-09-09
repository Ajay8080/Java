import java.util.Scanner;

public class TwoSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        System.out.println("Enter the target number: ");
        int target = sc.nextInt();

        int[] result = twoCheckSum(array, target);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");

    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int[] twoCheckSum(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, 1 };
    }
}