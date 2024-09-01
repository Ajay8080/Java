import java.util.Scanner;

public class MiddleElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array Size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("["+size+"]");
        for(int i=0; i<array.length;i++){
            array[i]=sc.nextInt();
        }

        if(array.length%2==0){
            int middle1 = (array.length/2)-1;
            int middle2 = array.length/2;
            System.out.println("Middle element is: "+array[middle1]+", "+array[middle2]);
        }
        else{
            int middle = array.length/2;
            System.out.println("Middle element is: "+array[middle]);
        }
    }
}