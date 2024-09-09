/*Check the array is palindrome or not if yes then return true, if not then return false from a method.
input: arr=[1,2,3,2,1]
Output: true

input: arr=[1,2,3,4,3,4,1]
Output: false */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        System.out.println("Is the array is Palindrome: " + checkPalindrome(array));
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static boolean checkPalindrome(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
