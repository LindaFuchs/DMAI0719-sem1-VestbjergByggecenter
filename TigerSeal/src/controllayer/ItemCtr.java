package controllayer;

import java.util.ArrayList;
import java.util.Calendar;

import modellayer.*;

public class ItemCtr
{
    private Inventory inv;
    
    public ItemCtr() {
        inv = Inventory.getInstance();
    }
    
    public boolean createSaleItem(String barcode, String name, String category, String description, double price, int quantity, String serialNumber, String location) {
        SaleItem si = new SaleItem(barcode, name, category, description, price, quantity, serialNumber, location);
        return inv.insertSaleItem(si);
    }
    
    public void generateItems() {
        createSaleItem("123", "Hacksaw", "Tools","Hacksaw 40 cm blade.", 150.00, 50, "1205", "DIY center");
        createSaleItem("234", "2x4 420 cm", "Lumber", "Fir 2x4 420 cm.", 30.00, 200, "5845", "Timber Yard");
        createSaleItem("345", "Belt Sander", "Power Tools", "Bosch belt sander 100 square centimeter contact surface.", 1200.00, 20, "1525", "DIY center");
        createSaleItem("456", "Wall Tile", "Tiles", "White/grey 30x30 cm, 0.4 cm thick tile.", 20.00, 2000,"4521", "DIY center");
        createSaleItem("567", "Fir window", "Windows", "Raw fir window 180x160 cm.", 1500.00, 15, "5785", "Timber yard");
        
    }
    
    public String searchSaleItemBarcodes(String inputBarcode){
        return inv.searchSaleItemBarcode(inputBarcode);
    }
    
    public String searchSaleItemNames(String inputName){
        return inv.searchSaleItemName(inputName);
    }
    
    public String searchSaleItemDescriptions(String inputDescription){
        return inv.searchSaleItemDescription(inputDescription);
    }
    
    public String searchSaleItemCategories(String inputCategory){
        return inv.searchSaleItemCategory(inputCategory);
    }
    
    //------------------------------------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------------------------------------
    
    public boolean createLoanItem(String barcode, String name, String category, String description, double price, int quantity, String serialNumber, int period, Calendar date, boolean state, String location){
        LoanItem li = new LoanItem(barcode, name, category, description, price, quantity, serialNumber, period, date, state, location);
        return inv.insertLoanItem(li);
    }
    
    public String searchLoanItemBarcodes(String inputBarcode){
        return inv.searchLoanItemBarcode(inputBarcode);
    }
    
    public String searchLoanItemNames(String inputName){
        return inv.searchLoanItemName(inputName);
    }
    
    public String searchLoanItemDescriptions(String inputDescription){
        return inv.searchLoanItemDescription(inputDescription);
    }
    
    public String searchLoanItemCategories(String inputCategory){
        return inv.searchLoanItemCategory(inputCategory);
    }
    
    
    
    
    
}
