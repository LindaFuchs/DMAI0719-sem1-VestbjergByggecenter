package modellayer;

import java.time.LocalDate;

public class Payment extends Sale
{
	private String method;
	private boolean authenticated;
	private double amount;
	private double totalDiscount;
	
	public Payment(LocalDate date, double totalPrice, int numberOfItems, boolean invoice, String method, boolean authenticated, double amount, double totalDiscount)
	{
	    super(invoice);
	    this.setMethod(method);
	    this.setAuthenticated(authenticated);
	    this.setAmount(amount);
	    this.setTotalDiscount(totalDiscount);
	}

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }
}
