/* Write a java program to print all unique elements from a given array.
Input  : arr = [1,2,1,3,4,6,2,5,4]
Output : 3 6 5 */

import java.util.Scanner;
public class UniqueElemets{
    public static final String RESET = "\u001B[0m";
    public static final String COLOR = "\u001B[0m";

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void printDuplicateElements(int[] array) {
        System.out.println(COLOR + "Unique Elements: " + RESET);
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        getArrayElement(array);
        printDuplicateElements(array);
    }
}