class Cylinder extends Circle{

    double height;

    Cylinder(){
        super();
        this.height = 0.0;
    }
    Cylinder(double radius, double height){
        super(radius);
        this.radius = radius;
        this.height = height;
    }
    public double getVolume(){
        if(height < 0 || radius < 0){
            System.out.println("Height and radius must be gteater than zero");
            return -1;
        }
        else{
            return getArea() * height;
        }
    }
}