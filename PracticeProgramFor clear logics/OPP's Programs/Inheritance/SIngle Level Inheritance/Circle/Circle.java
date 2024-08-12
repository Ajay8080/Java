class Circle{
    double radius;

    Circle(){
        this.radius = 0.0;
    }
    Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = 3.14 * radius *radius;
        if(radius < 0){
            System.out.println("radius should be greater than negative value");
            return -1;
        }
        else{
            return area;
        }
    }

}