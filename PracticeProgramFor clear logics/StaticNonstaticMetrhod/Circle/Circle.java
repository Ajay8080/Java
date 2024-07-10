/* Find the radius of a circle based on given diameter */
public class Circle{
    public void rdsCircle(double d){
        double r=d/2;
        System.out.println("Radius of circle is "+r);
    }
    public static void main(String[] args) {
        Circle c=new Circle();
        c.rdsCircle(10);
    }
}