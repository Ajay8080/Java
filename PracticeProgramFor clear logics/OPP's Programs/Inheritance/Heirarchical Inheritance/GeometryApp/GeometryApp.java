public class GeometryApp {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Triangle triangle = new Triangle(4.0,4.0,4.0);

        System.out.println("----------------------------CIRCLE---------------------------------");
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());
        System.out.println();
        System.out.println("---------------------------RECTANGLE---------------------------------");
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: "+rectangle.calculatePerimeter());
        System.out.println();
        System.out.println("---------------------------TRIANGLE---------------------------------");
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of Triangle: "+triangle.calculatePerimeter());

    }
}
