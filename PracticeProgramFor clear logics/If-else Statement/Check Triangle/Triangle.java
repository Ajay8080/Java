/*Write a program to input three angles of a triangle and check whether a triangle is possible or not. 
If possible then check whether it is an acute-angled triangle, right-angled or an obtuse-angled 
triangle otherwise, display 'Triangle not possible'.

Sample Input: Enter three angles: 40, 50, 90

Sample Output: Right=angled Triangle */

public class Triangle{
    public void getAngle(int a1, int a2, int a3){

        if(a1<90 && a2<90 && a3<90){
            System.out.println("The Traingle is Acute - angle triangle");
        }
        else if(a1<=90 && a2<=90 && a3==90){
            System.out.println("The Traingle is Right - angle triangle");
        }
        else if((a1>90 && 180>=a1) && (a2>90 && 180>=a2) && (a3>90 && 180>=a3)){
            System.out.println("The Traingle is Obtuse - angle traingle");
        }
        else{
            System.out.println("Triangle not possible");
        }
    }

    public static void main(String[] args) {
        Triangle angle = new Triangle();
        angle.getAngle(40,50 ,30 );
    }
}