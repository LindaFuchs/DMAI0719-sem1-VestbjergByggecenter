package modellayer;

import java.time.LocalDate;

public class Customer extends Person
{
    private Account account;
    private int customerID;
    private String company;
    private LocalDate membership;
    private double discount;
    
    public Customer(String name, String address, String zipcode, String city, 
            String country, String phone, Account account, int customerID, 
            String company, LocalDate membership,double discount) {
        
        super(name,address, zipcode, city, country, phone);
        this.account = account;
        this.customerID = customerID;
        this.setCompany(company);
        this.setMembership(membership);
        this.setDiscount(discount);
        
    }
    
    public Account getAccount() {
        return account;
    }
    ;
    public void setAccount(Account account) { // REMEMBER TO MAKE A TEST!
        this.account = account;
    }
    
    public int getCustomerID() {
        return customerID;
    }
    
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    public String getCompany() {
        return company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    
    public LocalDate getMembership() {
        return membership;
    }
    
    public void setMembership(LocalDate membership) {
        this.membership = membership;
    }
    
    public double getDiscount() {
        return discount;
    }
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    @Override
    public String toString() {
        return "\n* Name: " + name + "\n* Address: " + address + "\n* Zipcode: " + zipcode + "\n* City: " + city + 
                "\n* Country: " + country + "\n* Phone: " + phone + "\n==* Account: \n==\n" + account.toString() + "\n* Customer ID: " + 
                customerID + "\n* Company: " + company + "\n* Membership: " + membership + "\n* Discount: " + discount;
    }
    
    
    
}
