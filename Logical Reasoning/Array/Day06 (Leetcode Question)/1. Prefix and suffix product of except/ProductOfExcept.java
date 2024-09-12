import java.util.Scanner;
import java.util.Arrays;

public class ProductOfExcept{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        System.out.println("Product of array elements except self: " + Arrays.toString(productOfElements(array)));
    }

    public static void getArrayElement(int[] array){
        Scanner sc = new Scanner(System.in);

        System.out.println("Array size : "+array.length);
        System.out.println("Array Elements are : ");

        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
    }

    public static int[] productOfElements(int[] array) {
        int size = array.length;
        int[] result = new int[size];
        
        result[0] = 1; 
        for (int i = 1; i < size; i++) {
            result[i] = result[i - 1] * array[i - 1];
        }

        int suffixProduct = 1; 
        for (int i = size - 1; i >= 0; i--) {
            result[i] = result[i] * suffixProduct;
            suffixProduct *= array[i];
        }

        return result;
    }
}