/*Write a java program to count the number of digit and it's sum of the given number . 
input 12345
output 
no. of digit = 5.
sum of digit = 15. */
public class CountDigit{
    public static void main(String[] args){
        int num = 12345;
        int sum = 0;
        int count = 0;
        while(num>0){
            int rem = num%10;
            sum = sum + rem;
            count = count + 1;
            num = num/10;
            }
            System.out.println("No. of digit = "+count);
            System.out.println("Sum of digit = "+sum);
            }
            
}