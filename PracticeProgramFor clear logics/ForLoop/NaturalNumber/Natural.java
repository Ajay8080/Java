/*Write a Java program to print n natural number from 1
n by using for loop?
input :
n = 10
output 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 */
 
public class Natural{
    public void getNumber(int n){

        for(int i=1;i<=10;i++){
            System.out.println(i);
            
        }
    }

    public static void main(String[] args) {
        Natural obj = new Natural();
        obj.getNumber(10);
        }
    }

