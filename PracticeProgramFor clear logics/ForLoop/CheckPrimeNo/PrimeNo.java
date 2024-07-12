/*Write a Java program to check the number is prime number or not  by using for loop?
input : - n = 5
output 5 is a prime number */

public class PrimeNo{

    public void getInput(){
        int num =5;
        boolean flag = false;
         for(int i = 2; i <= num/2; i++)
         {
            if(num % i == 0){
                flag = true;
                break;
            }
    }
        if(!flag){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
    public static void main(String[] args) {
        PrimeNo obj = new PrimeNo();
        obj.getInput();
    }
}