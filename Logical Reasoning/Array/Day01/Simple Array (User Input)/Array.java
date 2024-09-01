import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Index ["+n+"] elements");

        for(int i=0; i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]+" ");
        }
    }
}