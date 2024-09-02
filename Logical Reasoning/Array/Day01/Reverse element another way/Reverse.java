/*Reverse the array and print it. */
import java.util.Scanner;
import java.util.Arrays;
public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        getArrayElement(array);
        printReverseElement(array);
    }
    public static void getArrayElement(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("["+array.length+"]");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
    }
    public static void printReverseElement(int[] array){
        for(int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}