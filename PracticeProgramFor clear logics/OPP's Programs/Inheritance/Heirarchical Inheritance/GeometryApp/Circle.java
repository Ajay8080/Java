class Circle extends Shape {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return 3.14 * radius * radius;
    }
    public double calculatePerimeter(){
        return 2 * 3.14 * radius;
    }
}
