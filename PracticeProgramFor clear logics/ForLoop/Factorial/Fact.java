/*Find factorial of Number number by using for loop.
input
:5
output
:120. */
public class Fact{
    public static void main(String[] args){
        int num=5;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
            }
            System.out.println(fact);
            }
            
}