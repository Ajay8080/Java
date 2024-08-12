import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("height: ");
        double height = sc.nextDouble();
        
        System.out.println("radius: ");
        double radius = sc.nextDouble();
        
        Cylinder c = new Cylinder(radius,height);

        System.out.println("Cylinder : "+c.getVolume());
        System.out.println("Circle: "+c.getArea());
    }
}
