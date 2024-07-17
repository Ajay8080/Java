/*/*Write a program to
input a number and evaluate the results based on the number entered by the
user:

(a) Natural logarithm of the number

(b) Absolute value of the number

(c) Square root of the number

(d) Cube of the number

(e) Random numbers between 0 (zero) and 1 (one). */ 
import java.lang.Math;
class MathInput {
    int num;
    public void getInput(int num){
        this.num = num;
    }
    public void display(){
        System.out.println("Natural logarithm of the number: "+Math.log(num));
        System.out.println("Absolute value of the number: "+Math.abs(num));
        System.out.println("Square root of the number: "+Math.sqrt(num));
        System.out.println("Cube root of the number: "+Math.cbrt(num));
        System.out.println("Randome numbers: "+Math.random());
    }
}
