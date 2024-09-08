
/*Write a java program to count and print all the elements which contains 2 in it.
Input as : {1,12,32,44,222,102,34,56,67,125}
Output as : 12, 32, 222, 102, 125
Count is : 5 */
import java.util.Scanner;

public class Count2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        System.out.print("2 Containing Elements : ");
        count2(array);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void count2(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (String.valueOf(array[i]).contains("2")) {
                System.out.print(array[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count: " + count);
    }
}