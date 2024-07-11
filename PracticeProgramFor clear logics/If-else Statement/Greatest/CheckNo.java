/*Write a program to input three numbers and check whether they are equal or not. 
If they are unequal numbers then display the greatest among them otherwise, 
display the message 'All the numbers are equal'.

Sample Input: 34, 87, 61

Sample Output: Greatest number: 87

Sample Input: 81, 81, 81

Sample Output: All the numbers are equal. */


public class CheckNo{
    public void getInput(int n1, int n2, int n3){
        if(n1>n2 && n1>n3)
        {
            System.out.println("Greatest number: "+n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println("Greatest number: "+n2);
        }
        else if(n3>n1 && n3>n2){
            System.out.println("Greatest number: "+n3);
        }
        else if(n1==n2 && n1!=n3){
            System.out.println(n1+" and "+n2+ " both are same" );
        }
        else if(n2==n3 && n2!=n1){
            System.out.println(n2+" and "+n3+ " both are same" );
        }
        else if(n1==n3 && n1!=n2){
            System.out.println(n1+" and "+n3+ " both are same");
        }
        else {
            System.out.println("All numbers are equal!!");
        }
    }
    public static void main(String[] args) {
        CheckNo c = new CheckNo();
        c.getInput(81,81,81);
    }
}