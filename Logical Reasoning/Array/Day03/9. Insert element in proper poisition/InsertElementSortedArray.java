/*Write a java program to insert an element in its proper position
in a given sorted array.
Example : 
Input as : {5,6,14,17,44}
Element to be inserted : 15
Result array : 5,6,14,15,17,44 */
import java.util.Scanner;
import java.util.Arrays;

public class InsertElementSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array Element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        System.out.println("Enter the element for the insert in sorted array: ");
        int element = sc.nextInt();

        System.out.println("After insert an element: ");
        System.out.println(Arrays.toString(insertElementSortedArray(array, element)));
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[" + array.length + "]");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int[] insertElementSortedArray(int[] array, int element) {
        int[] tempArray = new int[array.length + 1];

        int i = 0;

        while (i < array.length && array[i] < element) {
            tempArray[i] = array[i];
            i++;
        }

        tempArray[i] = element;

        while (i < array.length) {
            tempArray[i + 1] = array[i];
            i++;
        }
        return tempArray;
    }
}