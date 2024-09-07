/*Write a java program to count how many elements are present more than one time.

Input  : arr = [1,2,1,3,4,6,2,5,4]
Output : 3 elements are present more than one time  */
import java.util.Scanner;
public class CountElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        getArrayElement(array);
        countMoreThanOneTimeElement(array);
    }
    public static void getArrayElement(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("["+array.length+"]");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
    }
    public static void countMoreThanOneTimeElement(int[] array){
        int totalCount = 0;
        for(int i=0; i<array.length; i++){
            int count = 1;
            for(int j=i+1; j<array.length; j++){
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count>2){
                totalCount++;
            }
        }
        System.out.println(totalCount+" Elements are more than one");
    }
}