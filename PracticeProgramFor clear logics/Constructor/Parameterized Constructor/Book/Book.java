class Book{
    public String title;
    public String author;
    public double price;

    public Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public String getDetails(){
        return "Book[title= "+title+" Author= "+author+" price= "+price+"]";
    }
    
    public void applyDiscount(double discPer){
        if(0>=discPer){
            System.out.println("Discount percentage must be positive and non - zero");
        }
        else{
            double discount = price * discPer / 100;
            price = price - discount;
            System.out.println("Discount: "+discount );
            System.out.println("Price: "+price);
        }
    }
}