/*Q10. Write the program in Java to display the following pattern:

9
7 9
5 7 9
3 5 7 9
1 3 5 7 9 */
class Number{
    public static void main(String[] args) {
        for(int i=5; i>=1;i--){
            for(int j=i;j<=5;j++){
                System.out.print(2*j-1);
        }
        System.out.println();
    }
    }
}