import java.util.Scanner;

public class FirstNonRepeating {
    public static void getArrayElement1(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + array.length + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int firstNonRepeating(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isRepeat = false;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isRepeat = true;
                    break;
                }
            }
            if (!isRepeat) {
                return array[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for the Array elements: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement1(array);

        int result = firstNonRepeating(array);
        if (result != -1) {
            System.out.println("First non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
