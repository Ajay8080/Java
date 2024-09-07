/*Implement a java program to find kth largest element in an unsorted array and print it.  */
import java.util.Scanner;
import java.util.Arrays;
public class KthLargestElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array element: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        getArrayElement(array);
        
        System.out.println("Enter the Kth largest element: ");
        int k = sc.nextInt();
        kthLargestElement(array,k);
    }
    public static void getArrayElement(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("["+array.length+"] ");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
    }
    public static void kthLargestElement(int[] array,int k){
        if (k <= array.length && k > 0) {
            Arrays.sort(array);

            System.out.println("The " + k + "th largest element is: " + array[array.length - k]);
        } else {
            System.out.println("Invalid value of k.");
        }
    }
}