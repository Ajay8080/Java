
/* Write a Java method named replaceElement that replaces the element at the given position in the array with another given element.

Input:
arr = [1, 2, 3, 4, 5]
position = 2
newElement = 10

After modification, arr should be [1, 2, 10, 4, 5]

  */
import java.util.Scanner;

public class ReplaceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        beforeReplaceElement(array);

        System.out.println("Enter position of Element: ");
        int position = sc.nextInt();

        System.out.println("Enter NewElement: ");
        int newElement = sc.nextInt();

        replaceArrayElement(array, position, newElement);

        afterReplaceArray(array);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void beforeReplaceElement(int[] array) {
        System.out.println("--------------Before Replace-------------");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void replaceArrayElement(int[] array, int position, int newElement) {
        if (position < 0 || position > array.length) {
            System.out.println("Invalid Index!!");
        } else {
            array[position] = newElement;
        }
    }

    public static void afterReplaceArray(int[] array) {
        System.out.println("------------After Replace Array--------------");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    
}