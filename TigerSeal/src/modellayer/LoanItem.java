package modellayer;

import java.util.Calendar;

public class LoanItem extends Item
{
    private String serialNumber;
    private int period;
    private Calendar date;
    private boolean state;
    private String location;
    
    public LoanItem(String barcode, String name, String category, String description, double price, int quantity, 
            String serialNumber, int period, Calendar date, boolean state, String location) {
        super(barcode, name, category, description, price, quantity);
        this.setSerialNumber(serialNumber);
        this.setPeriod(period);
        this.setDate(date);
        this.setState(state);
        this.setLocation(location);
        
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public int getPeriod() {
        return period;
    }
    
    public void setPeriod(int period) {
        this.period = period;
    }
    
    public Calendar getDate() {
        return date;
    }
    
    public void setDate(Calendar date) {
        this.date = date;
    }
    
    public boolean isState() {
        return state;
    }
    
    public void setState(boolean state) {
        this.state = state;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String checkLoan(boolean check) {
        String state = null;
        if(check) {
            state = "Loaned";
        }
        else {
            state = "Not loaned";
        }
        return state;
    }
    
    @Override
    public String toString() {
        return "* Barcode: " + barcode + "\n* Name: " + name + "\n* Category: " + category + 
                "\n* Description: " + description + "\n* Price: " + price + "\n* Quantity: " + 
                quantity + "\n* Serial Number: " + serialNumber + "\n* Period: " + period + "\n* Date: " + 
                date + "\n *Loan State: " + checkLoan(state) + "\n Location: " + location;
    }
}

