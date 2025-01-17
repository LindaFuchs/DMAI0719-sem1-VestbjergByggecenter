package modellayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Sale
{
    private LocalDate date;
    private ArrayList<Item> items;
    private double totalPrice;
    private int numberOfItems;
    private boolean invoice;
    private int id;
    
    public Sale (boolean invoice)
    {
        int tempNumber = -1;
        Random rn = new Random();
        do {
            tempNumber = rn.nextInt(100000);
        }
        while(tempNumber < 0);
        
        this.id = tempNumber;
        this.items = new ArrayList<>();
        this.setDate();/*
	    this.setTotalPrice(totalPrice);
	    this.setNumberOfItems(numberOfItems);
	    this.setInvoice(invoice);*/
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public void setDate() {
        date = LocalDate.now();
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public int getNumberOfItems() {
        return numberOfItems;
    }
    
    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
    
    public int getId() {
        return id;
    }
    
    public boolean isInvoice() {
        return invoice;
    }
    
    public boolean setInvoice(boolean invoice) {
        return this.invoice = invoice;
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }
    
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    public boolean insertItem(Item item) {
        boolean result = false;
        if(item != null) {
            result = items.add(item);
        }
        return result;
    }
    
}
