import java.util.Scanner;

public class LeftRotate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array Element: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        
        getArrayElement(array);
        
        System.out.println("Enter the shift number for left rotate: ");
            int shiftNum = sc.nextInt();

        leftRotateArray(array, shiftNum);
        
        printArray(array);
    
    }

    public static void getArrayElement(int[] array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[" + array.length + "]");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
    public static void leftRotateArray(int[] array, int shiftNum){
        if(shiftNum == 0){
            return ;
        }

        int temp = array[0];

        for(int i=1; i<shiftNum; i++){
            array[i-1] = array[i];
        }
        array[shiftNum-1] = temp;
    }
    public static void printArray(int[] array){
        System.out.println("After Left Rotation Array: ");
        for(int arrays : array){
            System.out.print(arrays+" ");
        }
    }
}