package controllayer;

import java.util.ArrayList;

import modellayer.*;

public class SaleCtr
{
    private static SaleContainer saleCon;
    private static PersonContainer personCon;
    private static Inventory invCon;
    
    public SaleCtr() {
        saleCon = SaleContainer.getInstance();
        personCon = PersonContainer.getInstance();
        invCon = Inventory.getInstance();
    }
    
    public int createSale(boolean invoice) {
        Sale sale = new Sale(invoice);
        saleCon.insertSale(sale);
        return sale.getId();
    }
    
    public boolean setInvoice(boolean invoice, int id) {
        return saleCon.setInvoice(invoice, id);
    }
    
    public boolean addItem(String inputBarcode, int id)
    {
        boolean found = false;
        SaleItem itemToAdd = invCon.toAddSaleItemBarcode(inputBarcode);
        if(itemToAdd != null) {
            found = saleCon.addItem(itemToAdd, id);
        }
        
        return found;
    }
}