import java.util.Scanner;

public class MedianElement{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        getArrayElement(array);
        findMedianElement(array);
    }

    public static void getArrayElement(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elenments: ["+array.length+"]");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
    }
    public static void findMedianElement(int[] array) {
		if (array.length % 2 == 0) {
		 System.out.println("Median is:"+(array[array.length / 2] + array[array.length / 2 - 1]) / 2.0);
		}
        else{
	    System.out.println("Median is:"+(array[array.length / 2] ));
        }
	}
}