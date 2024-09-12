import java.util.Scanner;

public class EmployeeMeetingTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employee: ");
        int numberOfEmployee = sc.nextInt();

        int[] hours = new int[numberOfEmployee];

        getHours(hours);

        System.out.print("Enter the target hours: ");
        int target = sc.nextInt();

        System.out.println("Number of employees who met the target: " + countEmployees(hours, target));
    }

    public static void getHours(int[] hours) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of Employees : " + hours.length);

        System.out.println("Enter the hours worked by employee: ");

        for (int i = 0; i < hours.length; i++) {
            hours[i] = sc.nextInt();
        }
    }

    public static int countEmployees(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }
        return count;
    }
}