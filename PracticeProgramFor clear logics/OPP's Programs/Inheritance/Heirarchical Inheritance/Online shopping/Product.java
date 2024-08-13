class Product{
    protected String name;
    protected double price;

    Product(String name, double price){
        this.name =  name;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("Product Name: "+name);
        System.out.println("Product Price: "+price);
    }
    public double calculateTotalCost(int quantity){
        return quantity * price;
    }
}