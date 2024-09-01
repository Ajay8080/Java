// Find Maximum Element in an Array.
import java.util.Scanner;
public class Minimum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("["+size+"]");

        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        int minimum = array[0];

        for(int i=0; i<array.length; i++){
            if(array[i]<minimum){
                minimum = array[i];
            }
        }
        System.out.println("Minimum number is: "+minimum);
    }
}