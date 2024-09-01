/*Search for a given Element in an Array if present print its location. */
import java.util.Scanner;

public class SearchLOcation {
    
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element: ");
        int size = sc.nextInt();

        int [] array = new int[size];
        printArray(array);
        System.out.println("Enter the element for search index position: ");
        int searchLocation = sc.nextInt();
        sc.close();
        searchLocation(array, searchLocation);

    }
    public static void printArray(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.print("["+array.length+"]");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
    }
    public static void searchLocation(int[] array, int searchLocation){
        for(int i=0; i<array.length; i++){
            if(array[i]==searchLocation){
            System.out.println("Elements fount at: "+i);
            return;
            }
        }
        System.out.println("Element index not found");
    }
    
}

