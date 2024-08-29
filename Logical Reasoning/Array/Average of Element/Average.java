//Find Average of Array Elements.
import java.util.Scanner;

public class Average{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");

        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("["+size+"]");
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        double average = (double)sum/array.length;
        System.out.println("Average of array elements: "+average);
    }
}