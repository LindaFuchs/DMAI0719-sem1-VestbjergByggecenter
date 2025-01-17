package modellayer;

public abstract class Item
{
    protected String barcode;
    protected String name;
    protected String category;
    protected String description;
    protected double price;
    protected int quantity;
    
    public Item(String barcode2, String name, String category, String description, double price, int quantity) {
        this.barcode = barcode2;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getBarcode() {
        return barcode;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCategory() {
        return category;
    }
    
    public String getDescription() {
        return description;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public String toString() {
        return "* Barcode: " + barcode + "\n* Name: " + name + "\n* Category: " + category + "\n* Description: " + 
                description + "\n* Price: " + price + "\n* Quantity: " + quantity;
    }
    
    
    
    
    
    
    
    
    
    
}
