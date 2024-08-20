class Circle extends Shape {
    int r;
    Circle(int r){
        this.r=r;
    }
    @Override
    public void calculateArea(){
        System.out.printf("Area of Circle is: %.2f",Math.PI*r*r);
        System.out.println();
    }
}
