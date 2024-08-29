//Print all elements in reverse order of an Array.
 import java.util.Scanner;

 public class Reverse{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int [] array = new int[size];

        System.out.println("["+size+"]");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
 }