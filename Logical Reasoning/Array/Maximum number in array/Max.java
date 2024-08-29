// Find Maximum Element in an Array.
import java.util.Scanner;
public class Max{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("["+size+"]");

        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Maximum number is: "+max);
    }
}