import java.util.Scanner;

public class CountEvenOddNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("["+size+"]");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        int evenCount=0;
        int oddCount=0;

        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even Numbers: "+evenCount);
        System.out.println("Odd NUmbers: "+oddCount);
    }
}