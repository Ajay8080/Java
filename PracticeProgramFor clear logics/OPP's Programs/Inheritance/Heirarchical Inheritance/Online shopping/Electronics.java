class Electronics extends Product {
    private String brand;

    Electronics(String name, double price, String brand){
        super(name,price);
        this.brand = brand;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("brand: "+brand);
    }
}
