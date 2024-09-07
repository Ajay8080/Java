/*Write java method named findEvenandOddPositionElement that print all 
 elements which is present at even index and also in odd index. */
import java.util.Scanner;
public class FindEvenOddPositionElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);

        findEvenandOddPositionElement(array);
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void findEvenandOddPositionElement(int[] array) {
        System.out.println("Even Position Elements");
        for(int i=0; i<array.length; i++){
            if(i%2==0){
                System.out.println("Index ["+i+"] :"+array[i]);
            }
        }
        System.out.println("Odd Position Elements");
        for(int i=0; i<array.length; i++){
            if(i%2!=0){
                System.out.println("Index ["+i+"] :"+array[i]);
            }
        }
    }

}