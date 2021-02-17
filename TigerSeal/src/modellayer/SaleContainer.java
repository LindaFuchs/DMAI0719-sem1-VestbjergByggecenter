package modellayer;

import java.util.ArrayList;

public class SaleContainer
{
	private ArrayList<Sale> sales;
	private static SaleContainer instance;
	private Sale sale;
	
	private SaleContainer() {
        sales = new ArrayList<>();
    }
    
    public static SaleContainer getInstance() {
        if(instance == null) {
            instance = new SaleContainer();
        }
        return instance;
    }
	
    public boolean insertSale(Sale sale)
    {
        boolean result = false;
        if(sale != null) {
            result = sales.add(sale);
        }
        return result;
    }
    
    public Sale findSale(int id) {
        Sale sale = null;
        return sale;
    }
    
    public boolean setInvoice(boolean invoice, int id)
    {
        boolean added = false;
        for(Sale s : sales) {
            if(s.getId() == id) {
                added = s.setInvoice(invoice);
            }
        }
        return added;
    }
    
    public boolean addItem(SaleItem itemToAdd, int id)
    {
        boolean added = false;
        if(itemToAdd != null) {
            for(Sale s : sales) {
                if(s.getId() == id) {
                    added = s.insertItem(itemToAdd);
                }
            }
        }
        return added;
    }
}
