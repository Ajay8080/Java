/*
WAP to find the area of a circle whose diameter is 20cm.

*/

class Circle{
    public static double getRadius(double diameter){
    return diameter/2.0;
    }
    public static void findArea(double radius){
    double r = Math.PI*radius*radius;
    //System.out.println("Area of circle: "+r);
    System.out.printf("Area of circle is: %.2f",r);
    }
  }
  