/*Implement a Java program to find the frequency of each element in an integer array and display the results.
 */
import java.util.Scanner;
public class Frequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array element: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        getArrayElement(array);
        findFrequency(array);
    }
    public static void getArrayElement(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("["+array.length+"] ");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
    }
    public static void findFrequency(int[] array){
        boolean[] isCounted = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (isCounted[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    isCounted[j] = true;
                }
            }
            System.out.println("The frequency of "+array[i] + " : " + count + " times");
        }
    }
}