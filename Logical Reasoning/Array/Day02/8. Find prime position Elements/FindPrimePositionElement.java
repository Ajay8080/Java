/*Write java method named findPrimePositionElement that print all the elements which is present at prime index. */

import java.util.Scanner;

public class FindPrimePositionElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array element: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        getArrayElement(array);
        findPrimePositionElement(array);
    }
    public static void getArrayElement(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("["+array.length+"] ");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
    }
    public static boolean findPrimePositionElement(int[] array){
        boolean found = true;
        for(int i=2; i<array.length; i++){
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Element at prime index ["+i+"] : "+array[i]);
                found = true;
            }
        }
        return found;
    }
}