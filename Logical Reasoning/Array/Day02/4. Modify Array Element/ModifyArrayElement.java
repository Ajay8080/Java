
/*Write a Java method named modifyArrayElement that modifies the given array by replacing every occurrence of oldElement with newElement.

arr = [1, 2, 3, 4, 5, 2, 3]
oldElement = 3
newElement = 10
 */
import java.util.Scanner;

public class ModifyArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        beforeModifyElement(array);
        System.out.println("Enter OldElement: ");
        int oldElement = sc.nextInt();
        System.out.println("Enter NewElement: ");
        int newElement = sc.nextInt();
        modifyArrayElement(array, oldElement, newElement);
        afterModifyArray(array);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void beforeModifyElement(int[] array) {
        System.out.println("--------------Before Modify-------------");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void modifyArrayElement(int[] array, int oldElement, int newElement) {
        boolean found = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
                found = true;
            }
        }
        if (found) {
            System.out.println(oldElement + " is not found in the array");
        }
    }

    public static void afterModifyArray(int[] array) {
        System.out.println("------------Modify Array--------------");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}