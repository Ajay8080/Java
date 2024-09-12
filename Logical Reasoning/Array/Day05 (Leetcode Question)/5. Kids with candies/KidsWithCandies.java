import java.util.Arrays;
import java.util.Scanner;

public class KidsWithCandies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of kids: ");
        int numberOfKids = sc.nextInt();

        int[] candies = new int[numberOfKids];

        getCandies(candies);

        System.out.print("Enter the number of extra candies: ");
        int extraCandies = sc.nextInt();

        System.out.println("Result: " + Arrays.toString(kidsWithCandies(candies, extraCandies)));
    }

    public static void getCandies(int[] candies){
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of kids : "+candies.length);
        System.out.println("Enter the number of candies each kid has:");
        for (int i = 0; i < candies.length; i++) {
            candies[i] = sc.nextInt();
        }
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;

        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        
        boolean[] result = new boolean[candies.length];

        for (int i = 0; i < candies.length; i++) {
            result[i] = (candies[i] + extraCandies) >= maxCandies;
        }

        return result;
    }
}
