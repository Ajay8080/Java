class Product {
    private String Pname;
    private int Pid;
    private double price;

    public Product() {
        this.Pname = "Default Product";
        this.Pid = 0;
        this.price = 0.0;
    }

    public Product(String Pname, int Pid, double price) {
        if (Pname == null || Pname.isEmpty()) {
            System.out.println(" Product name cannot be null or empty.");
            this.Pname = "Default Product";
        } else {
            this.Pname = Pname;
        }
        if (Pid < 0) {
            System.out.println("Product ID cannot be negative.");
            this.Pid = 0;
        } else {
            this.Pid = Pid;
        }
        if (price < 0) {
            System.out.println("Price cannot be negative.");
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public void displayInfo() {
        System.out.println("Product Name: " + Pname);
        System.out.println("ProductId: " + Pid);
        System.out.println("Price: " + price);
    }
}