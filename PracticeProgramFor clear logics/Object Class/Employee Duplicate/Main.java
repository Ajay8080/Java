public class Main {
    public static void main(String[] args) {
        EmployeeDuplicate e1 = new EmployeeDuplicate(101, "shiva", 20000);
        EmployeeDuplicate e2 = new EmployeeDuplicate(101, "shiva", 20000);
        if (e1.equals(e2)) {
            System.out.println("emp1 and emp2 are duplicates based on ID.");
            System.out.println(e1.equals(e2));
        } else {
            System.out.println("emp1 and emp2 are not duplicates.");
            System.out.println(e1.equals(e2));
        }

    }
}



