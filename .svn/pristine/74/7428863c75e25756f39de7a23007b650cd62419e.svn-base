package modellayer;

import java.time.LocalDate;

public class Contractor extends Person
{
    private int contractorID;
    private String company;
    private LocalDate membership;
    
    
    public Contractor(int contractorID, String company, String name, String address, String zipcode, String city, String country, String phone, LocalDate membership)
    {
        super(name, address, zipcode, city, country, phone);
        this.setContractorID(contractorID);
        this.setCompany(company);
        this.setMembership(membership);
    }
    
    
    public int getContractorID() {
        return contractorID;
    }
    
    
    public void setContractorID(int contractorID) {
        this.contractorID = contractorID;
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
    
    @Override
    public String toString() {
        return "\n* Name: " + name + "\n* Address: " + address + "\n* Zipcode: " + zipcode + "\n* City: " + city + 
                "\n* Country: " + country + "\n* Phone: " + phone;
    }
}
