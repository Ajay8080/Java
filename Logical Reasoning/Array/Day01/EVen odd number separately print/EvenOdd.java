import java.util.Scanner;
public class EvenOdd{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("["+size+"]");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Even Numbers are : ");
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                System.out.printf(array[i]+" ");
            }
        }
        System.out.println();
        System.out.println("odd Numbers are : ");
        for(int i=0; i<array.length;i++){
            if(array[i]%2 !=0 ){
                System.out.printf(array[i]+" ");
            }
        } 
    }
}