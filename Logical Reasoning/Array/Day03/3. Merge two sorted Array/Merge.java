
/*Write a program to merge two sorted arrays into a single sorted array.
Input:
nums1 = [1, 3, 5]
nums2 = [2, 4, 6]
Output:
[1, 2, 3, 4, 5, 6]
 */
import java.util.Scanner;
import java.util.Arrays;
public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for the first array element: ");
        int size1 = sc.nextInt();

        int[] array1 = new int[size1];
        getArrayElement(array1);

        System.out.println("Enter the size for the second array element: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        getArrayElement(array2);
        int[] mergeArray = mergeSortedArray(array1, array2);
        System.out.println("Merged array: "+Arrays.toString(mergeArray));
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
    public static int[] mergeSortedArray(int[] array1, int[] array2){
        int[] mergeArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while(i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                mergeArray[k++] = array1[i++];
            }
            else{
                mergeArray[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            mergeArray[k++] = array1[i++];
        }
        while (j < array2.length) {
            mergeArray[k++] = array2[j++];
        }
        return mergeArray;
    }
}