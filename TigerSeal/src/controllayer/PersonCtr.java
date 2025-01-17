package controllayer;

import java.time.LocalDate;
import java.util.ArrayList;

import modellayer.*;


public class PersonCtr
{
    private PersonContainer personCon;
    
    public PersonCtr() {
        personCon = PersonContainer.getInstance();
    }
    
    public boolean createCustomer(String name, String address, String zipcode, String city, String country, String phone, Account account, int customerID, String company, LocalDate membership,double discount) {
        Customer customer = new Customer(name,address,zipcode,city,country,phone,account,customerID,company,membership,discount);
        return personCon.insertCustomer(customer);
    }
    
    public boolean createEmployee(String name, String address, String zipcode, String city, String country, String phone, Account account, int employeeID, boolean managerAccess, double salary,LocalDate hiredDate, double discount) {
        Employee employee = new Employee(name,address, zipcode, city, country, phone, account, employeeID, managerAccess, salary,hiredDate, discount);
        return personCon.insertEmployee(employee);
    }
    
    public boolean createContractor(int contractorID, String company, String name, String address, String zipcode, String city, String country, String phone, LocalDate membership) {
        Contractor contractor = new Contractor(contractorID, company, name, address, zipcode, city, country, phone, membership);
        return personCon.insertContractor(contractor);
    }
    //TODO: FIX THIS TOO AAAAAAAAAAAAAAAA
    public ArrayList<Customer> searchCustomerID(int inputID){
        return personCon.searchCustomerID(inputID);
    }
    
    public ArrayList<Person> searchCustomerNames(String inputName) {
        return personCon.searchCustomerName(inputName); 
    }
    
    public ArrayList<Person> searchCustomerAddress(String inputAddress){
        return personCon.searchCustomerAddress(inputAddress);
    }
    
    public ArrayList<Person> searchCustomerPhone(String inputPhone){
        return personCon.searchCustomerPhone(inputPhone);
    }
    
    //public ArrayList<Person> searchEmployeeID(int inputID)
    
    public ArrayList<Person> searchEmployeeNames(String inputName) {
        return personCon.searchEmployeeName(inputName); 
    }
    
    public ArrayList<Person> searchEmployeeAddress(String inputAddress){
        return personCon.searchEmployeeAddress(inputAddress);
    }
    
    public ArrayList<Person> searchEmployeePhone(String inputPhone){
        return personCon.searchEmployeePhone(inputPhone);
    }
    
    //public ArrayList<Person> searchContractorID(int inputID)
    
    public ArrayList<Person> searchContractorNames(String inputName) {
        return personCon.searchContractorName(inputName); 
    }
    
    public ArrayList<Person> searchContractorAddress(String inputAddress){
        return personCon.searchContractorAddress(inputAddress);
    }
    
    public ArrayList<Person> searchContractorPhone(String inputPhone){
        return personCon.searchContractorPhone(inputPhone);
    }
    
    
}
