import java.util.Scanner;

public class CountMaxOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        System.out.print("Maximum Consecutive One's : " + countMaxOne(array));

    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int countMaxOne(int[] array) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : array) {
            if (num == 1) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 0;
            }
        }
        if (currentCount > maxCount) {
            maxCount = currentCount;
        }
        return maxCount;
    }
}