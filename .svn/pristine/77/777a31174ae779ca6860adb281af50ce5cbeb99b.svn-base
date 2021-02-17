package uilayer;

import java.time.LocalDate;

import java.util.Scanner;

import controllayer.PersonCtr;

import modellayer.Account;
import modellayer.Customer;
import modellayer.Item;
import modellayer.Person;

import java.util.InputMismatchException;


public class CustomerUI
{
    private PersonCtr personC = new PersonCtr();
    
    public void customerMenu() {
        boolean exit = false;
        while(!exit) {
            int choice = printCustomerMenu();
            switch(choice) {
                case 1:
                    inputCustomerInfo();
                    break;
                case 2:
                    //editCustomer();
                    break;
                case 3:
                    //deleteCustomer();
                    break;
                case 4: 
                    searchCustomer();
                    break;
                case 5:
                    //customersByDiscount();
                    break;
                default:
                    exit = true;
                    break;			
            }
        }
    }
    
    public int printCustomerMenu() {
        System.out.println("Customer menu");
        System.out.println("(1) New Customer");
        System.out.println("(2) Edit Customer");
        System.out.println("(3) Delete Customer");
        System.out.println("(4) Search Customer");
        System.out.println("(5) Customers by discount");
        Scanner scanner = new Scanner(System.in);
        int choice;
        if(scanner.hasNextInt()) {
            choice = scanner.nextInt();
        }
        else {
            choice = 0;
        }
        return choice;
    }
    
    private boolean inputCustomerInfo() {
        String name = null;
        String address = null;
        String zipcode = null;
        String city = null;
        String country = null;
        String phone = null;
        Account account = null;
        int customerID = 0;
        String company = null;
        LocalDate membership = null;
        double discount = 0;
        
        boolean created = false;
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        while(true) 
        {
            while(true) {
                System.out.println("Enter Customer ID: ");
                customerID = scanner.nextInt();
                if(customerID == 0) { //checks if the int is 0
                    System.out.println("Customer must have an ID.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            while(true) {
                System.out.println("Enter name: ");
                name = scanner.next();
                if(name.trim() == "") { //checks if the String is empty
                    System.out.println("Customer must have a name.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter address: ");
                address = scanner.next();
                if(address.trim() == "") { //checks if the String is empty
                    System.out.println("Customer must have an address of residence.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter zipcode: ");
                zipcode = scanner.next();
                if(!testInt(zipcode)) { //sends input String to testInt
                    System.out.println("Zipcode must be a number.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter city: ");
                city = scanner.next();
                if(city.trim() == "") { //checks if the String is empty
                    System.out.println("Customer must have a city of residence.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter country: ");
                country = scanner.next();
                if(country.trim() == "") { //checks if the String is empty
                    System.out.println("Customer must have a coountry of residence.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter phone: ");
                phone = scanner.next();
                if(!testInt(phone)) { //sends input String to testInt
                    System.out.println("Phone must be a number.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            System.out.println("Enter company: ");
            company = scanner.next(); //A customer does not need to have a company continues running to next input
            
            while(true) {
                System.out.println("Enter discount: ");
                discount = scanner.nextDouble();
                if(discount < 1) { //limits the range of discount attribute
                    System.out.println("Registered customer must have a discount.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            boolean answer;
            System.out.println("New customer: " + " | " + customerID + " | " + name);
            System.out.println("Confirm? Y/N");
            while(true) {
                String yn = scanner.next().trim().toLowerCase();
                if(yn.equals("y")) {
                    answer = true;
                    break;
                }
                else if(yn.equals("n")) {
                    answer = false;
                    break;
                }
                else {
                    System.out.println("Invalid input.");
                }
            }
            if(answer) {
                personC = new PersonCtr();
                personC.createCustomer(name, address, zipcode, city, country, phone, account, customerID, company, membership, discount);
                System.out.println(name + " was added to list of customers.");
                created = true;
            }
            return created;
            
        }
        
    }
    
    private void searchCustomer() {
        boolean exit = false;
        while(!exit) {
            int choice = printSearchCustomerMenu();
            switch(choice) {
            case 1:
                searchCustomerID();
                break;
            case 2:
                searchCustomerName();
                break;
            case 3:
                searchCustomerAddress(); 
                break;
            case 4:
                searchCustomerPhone();
                break;
            case 5:
                exit = true;
                break;
            default:
                exit = false;
                break;
            }
        }
    }
    
    
    private int printSearchCustomerMenu() {
        int choice;
        System.out.println("Search Customer Menu");
        System.out.println("(1) Search by ID");
        System.out.println("(2) Search by name");
        System.out.println("(3) Search by address");
        System.out.println("(4) Search by phone");
        System.out.println("(5) Back");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            choice = scanner.nextInt();
        }
        else {
            choice = 0;
        }
        return choice;
    }
    
    private boolean searchCustomerID() {
    boolean found = false;
    int inputID = -1;
    System.out.println("Input ID: ");
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);
    inputID = intScanner.nextInt();
    if(personC.searchCustomerID(inputID)!= null) {
        for(Customer c : personC.searchCustomerID(inputID)) {
            System.out.println("Customer ID: " + c.getCustomerID());
            System.out.println("Name: " + c.getName());
            System.out.println("Address: " + c.getAddress());
            System.out.println("Zipcode: " + c.getZipcode());
            System.out.println("City: " + c.getCity());
            System.out.println("Country: " + c.getCountry());
            System.out.println("Phone number: " + c.getPhone());
            System.out.println("Company: " + c.getCompany());
            System.out.println("Discount: " + c.getDiscount());
            System.out.println();
        }
        found = true;
    }
    else {
        System.out.println("Customer not found.");
    }
    
    return found;
}
    
    private boolean searchCustomerName() {
        boolean found = false;
        String inputName = null;
        System.out.println("Input Name: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputName = intScanner.nextLine();
        if(personC.searchCustomerNames(inputName)!= null) {
            for(Person p : personC.searchCustomerNames(inputName)) {
                //System.out.println("Customer ID: " + p.getCustomerID());
                System.out.println("Name: " + p.getName());
                System.out.println("Address: " + p.getAddress());
                System.out.println("Zipcode: " + p.getZipcode());
                System.out.println("City: " + p.getCity());
                System.out.println("Country: " + p.getCountry());
                System.out.println("Phone number: " + p.getPhone());
                //System.out.println("Company: " + p.getCompany());
                //System.out.println("Discount: " + p.getDiscount());
                System.out.println();
            }
            found = true;
        }
        else {
            System.out.println("Customer not found.");
        }
        
        return found;
    }
    
    private boolean searchCustomerAddress() {
        boolean found = false;
        String inputAddress = null;
        System.out.println("Input Address: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputAddress = intScanner.nextLine();
        if(personC.searchCustomerAddress(inputAddress)!= null) {
            for(Person p : personC.searchCustomerAddress(inputAddress)) {
                //System.out.println("Customer ID: " + p.getCustomerID());
                System.out.println("Name: " + p.getName());
                System.out.println("Address: " + p.getAddress());
                System.out.println("Zipcode: " + p.getZipcode());
                System.out.println("City: " + p.getCity());
                System.out.println("Country: " + p.getCountry());
                System.out.println("Phone number: " + p.getPhone());
                //System.out.println("Company: " + p.getCompany());
                //System.out.println("Discount: " + p.getDiscount());
                System.out.println();
            }
            found = true;
        }
        else {
            System.out.println("Customer not found.");
        }
        
        return found;
    }
    
    private boolean searchCustomerPhone() {
        boolean found = false;
        String inputPhone = null;
        System.out.println("Input Phone number: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputPhone = intScanner.nextLine();
        if(personC.searchCustomerPhone(inputPhone)!= null) {
            for(Person p : personC.searchCustomerPhone(inputPhone)) {
                //System.out.println("Customer ID: " + p.getCustomerID());
                System.out.println("Name: " + p.getName());
                System.out.println("Address: " + p.getAddress());
                System.out.println("Zipcode: " + p.getZipcode());
                System.out.println("City: " + p.getCity());
                System.out.println("Country: " + p.getCountry());
                System.out.println("Phone number: " + p.getPhone());
                //System.out.println("Company: " + p.getCompany());
                //System.out.println("Discount: " + p.getDiscount());
                System.out.println();
            }
            found = true;
        }
        else {
            System.out.println("Customer not found.");
        }
        
        return found;
    }
    
    /*
     * MAIN INPUT TEST
     */
    private boolean testInt(String input)
    {  //Takes input string to check if it has any letters
        try
        {
            Integer.parseInt(input); //Parses the input
        }
        catch(NumberFormatException nf) //If parsed input has a letter it returns this exception
        {
            return false; //For boolean check
        }
        return true; //For boolean check
    }
    
    
    
}
