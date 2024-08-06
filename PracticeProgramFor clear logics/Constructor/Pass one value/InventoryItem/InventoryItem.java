class InventoryItem{
    private String itemName;
    private double pricePerUnit;
    private int quantityInStock;

    public InventoryItem(String itemName, double pricePerUnit, int quantityInStock){
        this.itemName=itemName;
        this.pricePerUnit=pricePerUnit;
        this.quantityInStock=quantityInStock;
    }

    public void setName(String itemName){
        this.itemName=itemName;
    }
    public void setPrice(double pricePerUnit){
        this.pricePerUnit=pricePerUnit;
    }
    public void setQuantity(int quantityInStock){
        this.quantityInStock=quantityInStock;
    }
    public String getName(){
    return itemName;
    }
    public double getPrice(){
        return pricePerUnit;
    }
    public int getQuantity(){
        return quantityInStock;
    }

    public double  claculateTotalValue(){
        double totalValue=quantityInStock*pricePerUnit;
        return totalValue;
    }

}