public class CalculatorTest {
    public static void main(String[] args) {
        SimpleCalculator s = new SimpleCalculator();
        System.out.println("Test Case 1--------------------");
        s.calculateSum(1,2,3);
        System.out.println();
        System.out.println("Test Case 2--------------------");
        s.calculateSum(10, 20, 30, 40);
        System.out.println();
        System.out.println("Test Case 3--------------------");
        s.calculateSum(5);
        System.out.println();
        System.out.println("Test Case 4--------------------");
        s.calculateSum();
    }
}



/*
 Ouput:

Test Case 1--------------------
Sum of the numbers: 6

Test Case 2--------------------
Sum of the numbers: 100        

Test Case 3--------------------
Sum of the numbers: 5

Test Case 4--------------------
Sum of the numbers: 0
 */