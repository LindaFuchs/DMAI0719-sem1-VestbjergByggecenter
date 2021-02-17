package modellayer;

import java.time.LocalDate;

public class Employee extends Person
{
    private Account account;
    private int employeeID;
    private boolean managerAccess;
    private double salary;
    private LocalDate hiredDate;
    private double discount;
    
    public Employee(String name, String address, String zipcode, String city, String country, String phone, 
            Account account, int employeeID, boolean managerAccess, double salary,LocalDate hiredDate, double discount) {
        super(name, address, zipcode, city, country, phone);
        this.setAccount(account);
        this.setEmployeeID(employeeID);
        this.setManagerAccess(managerAccess);
        this.setSalary(salary);
        this.setHiredDate(hiredDate);
        this.setDiscount(discount);
        
    }
    
    public Account getAccount() {
        return account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }
    
    public int getEmployeeID() {
        return employeeID;
    }
    
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
    public boolean isManagerAccess() {
        return managerAccess;
    }
    
    public void setManagerAccess(boolean managerAccess) {
        this.managerAccess = managerAccess;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salery) {
        this.salary = salery;
    }
    
    public LocalDate getHiredDate() {
        return hiredDate;
    }
    
    public void setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
    }
    
    public double getDiscount() {
        return discount;
    }
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public String checkAccess(boolean check) {
        String state = null;
        if(check) {
            state = "Manager";
        }
        else {
            state = "Employee";
        }
        return state;
    }
    
    @Override
    public String toString() {
        return "\n* Name: " + name + "\n* Address: " + address + "\n* Zipcode: " + zipcode + "\n* City: " + city + 
                "\n* Country: " + country + "\n* Phone: " + phone + "\n==* Account: \n==\n" + account.toString() + "\n* Employee ID: " + 
                employeeID + "\n* Access level: " + checkAccess(managerAccess) + "\n* Salary: " + salary + 
                "\n* Hire Date: " + hiredDate + "\n* Discount: " + discount;
    }
}
