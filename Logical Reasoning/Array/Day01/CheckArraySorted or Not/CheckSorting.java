/*Check the given array is sorted or not. 
     int[] a = {13, 4, 23,  2, 2, 4}
 */
import java.util.Scanner;
public class CheckSorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        getArrayElement(array);
        if(isSortedAsc(array)){
            System.out.println("Array is Sorting in Ascending order");
        }
        else if(isSortedDesc(array)){
            System.out.println("Array is Sorting in Descending order");
        }
        else{
            System.out.println("Array is not Sorting ");
        }

    }
    public static void getArrayElement(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("["+array.length+"]");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
    }
    public static boolean isSortedAsc(int[] array){
        for(int i=0; i<array.length-1; i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isSortedDesc(int[] array){
        for(int i=0; i<array.length-1; i++){
            if(array[i]<array[i+1]){
                return false;
            }
        }
        return true;
    }


}