/*Write a java program to print Fibonacci Series.
input :- 5
output :-  0, 1, 1, 2, 3.
 */
public class Fibo{
    public static void main(String[] args) {
        int n = 5;
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            }
            }
            
}