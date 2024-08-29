import java.util.Scanner;

class Swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array= new int[size];

        System.out.println("Index["+size+"]");

        for(int i=0; i<array.length;i++){
            array[i] = sc.nextInt();
        }

        if(array.length>1){
            int temp = array[0];
            array[0] = array[array.length-1];
            array[array.length-1] = temp;
        }
        System.out.println("After swapping");
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }
}