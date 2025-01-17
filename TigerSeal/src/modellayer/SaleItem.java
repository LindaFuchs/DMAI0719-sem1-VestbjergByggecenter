package modellayer;

public class SaleItem extends Item
{
    private String serialNumber;
    private String location;
    
    public SaleItem(String barcode, String name, String category, String description, double price, int quantity, 
            String serialNumber, String location) {
        super(barcode,name,category,description,price,quantity);
        this.setSerialNumber(serialNumber);
        this.setLocation(location);
    }
    public String getBarcode() {
        return barcode;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override
    public String toString() {
        return "* Barcode: " + barcode + "\n* Name: " + name + "\n* Category: " + category + "\n* Description: " + 
                description + "\n* Price: " + price + "\n* Quantity: " + quantity + "\n* Serial Number: " + serialNumber +
                "\n* Location: " + location;
    }
}

