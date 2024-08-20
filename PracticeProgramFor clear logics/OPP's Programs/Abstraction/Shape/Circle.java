class Circle extends Shape{
    int r;

    Circle(int r){
        this.r = r;
    }
    @Override
    public void calcualateArea(){
        System.out.printf("Area of Circle:%.2f",Math.PI*r*r);
        System.out.println();
    }
}
