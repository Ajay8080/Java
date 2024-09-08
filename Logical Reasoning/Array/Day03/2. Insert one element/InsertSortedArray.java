
import java.util.Scanner;
public class InsertSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        System.out.println("Enter the element: ");
        int element = sc.nextInt();

        System.out.println("Enter the index where you want to insert the element: ");
        int index = sc.nextInt();

        array = insertSortedArray(array, element, index);

        System.out.println("Array after inserting the element");
        printArray(array);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int[] insertSortedArray(int[] array, int element, int index) {
       
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
