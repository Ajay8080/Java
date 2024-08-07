public class Tester {
    public static void main(String[] args) {
        Emp[] emp = new Emp[2];

        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            emp[i] = Emp.getObject();
            System.out.println();
        }
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Employee " + (i + 1) + " Details:");
            System.out.println(emp[i].printEmployeeDetails());
            System.out.println();
        }

    }
}
