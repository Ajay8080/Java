class Rectangle extends Shape{
    int l,b;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    @Override
    public void calculateArea(){
        System.out.println("Area of Rectanglr: "+l*b);
    }
}
