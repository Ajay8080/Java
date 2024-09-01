/*Search for a given Element in an Array if present then print
"Element found", if not present print "Element not found" */
import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        printArray(array);
        System.out.println("Enter the element to search: ");
        int searchElement = sc.nextInt();

        searchElement(array, searchElement);
    }
    public static void printArray(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("["+array.length+"]");
        for(int num : array){
            array[num] = sc.nextInt();
        }
    }
    public static void searchElement(int[] array, int searchElement){
        for(int i=0;i<array.length;i++){
            if(array[i] == searchElement){
                System.out.println("Element found");
                return;
            }
        
        }
        System.out.println("Element not found");
    }
}
