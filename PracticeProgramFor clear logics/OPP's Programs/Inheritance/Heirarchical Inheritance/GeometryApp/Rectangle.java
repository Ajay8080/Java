class Rectangle extends Shape {
    double length;;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length * width;
    }
    public double calculatePerimeter(){
        return 2 * (length + width);
    }
}
