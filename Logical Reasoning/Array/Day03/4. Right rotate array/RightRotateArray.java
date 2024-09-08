/*You are given an array of integers and a number of steps. Implement a method to rotate the array to the 
right by the given number of steps.

Input:
nums = [1, 2, 3, 4, 5] // 5 1 2 3 4 --> 4 5 1 2 3
                    
steps = 2
Output:
[4, 5, 1, 2, 3]
Input :
nums = [1,2,3,4,5]
steps = 5
Output : 
[1,2,3,4,5]

Input: 
nums = [1,2,3,4,5]
steps = 7
Output :
[4, 5, 1, 2, 3] */
import java.util.Scanner;
public class RightRotateArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        System.out.println("Enter the steps: ");
        int steps = sc.nextInt();

        rotateArray(array, steps);
        System.out.println("The Right Rotate Array");
        printArray(array);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
    public static void reverse(int[] array, int start, int end){
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArray(int[] array, int steps){
        int size = array.length;
        steps %= size;

        reverse(array, 0 , size-1);
        reverse(array, 0 , steps - 1);
        reverse(array, steps, size - 1);
    }
    public static void printArray(int[] array){
        for(int i=0 ; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}