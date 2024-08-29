//Calculate Sum of Array Elements.
import java.util.Scanner;

public class Sum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of elements: ");
        int size = sc.nextInt();

        int [] array = new int[size];

        System.out.println("["+size+"]");
        for(int i=0; i<array.length; i++){
            array[i]= sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println("Sum of the array is : "+sum);
    }
}