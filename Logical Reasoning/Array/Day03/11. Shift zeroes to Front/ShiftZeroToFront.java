/*Write a java program to shift all the zeros to the front of the given array without changing the order of non-zero elements.
Input as : {1,0,0,4,5,0,0,1};
Output as : {0,0,0,0,1,4,5,1} */

import java.util.Scanner;

public class ShiftZeroToFront {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array Element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        shiftZeroToFront(array);
        System.out.println("After shifting zeroes to Front: ");
        printShiftedArray(array);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[" + array.length + "]");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void shiftZeroToFront(int[] array) {
        int index = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[index] = array[i];
                index--;
            }
        }
        while (index > 0) {
            array[index] = 0;
            index--;
        }
    }

    public static void printShiftedArray(int[] array) {
        for (int arrays : array) {
            System.out.print(arrays + " ");
        }
    }
}