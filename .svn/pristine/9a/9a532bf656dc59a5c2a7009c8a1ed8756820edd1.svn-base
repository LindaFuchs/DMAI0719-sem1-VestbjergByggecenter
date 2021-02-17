package uilayer;

import java.time.LocalDate;

import java.util.Scanner;

import controllayer.PersonCtr;
import modellayer.Person;

import java.util.InputMismatchException;


public class ContractorUI
{
    private PersonCtr personC = new PersonCtr();
    
    public void contractorMenu() {
        boolean exit = false;
        while(!exit) {
            int choice = printContractorMenu();
            switch(choice) {
                case 1:
                    inputContractorInfo();
                    break;
                    //case 2:
                    //editContractorInfo();
                    //break;
                    //case 3:
                    //deleteContractor();
                    //break;
                case 4: 
                    searchContractor();
                    break;
                default:
                    exit = true;
                    break;			
            }
        }
    }
    
    public int printContractorMenu() {
        System.out.println("Contractor menu");
        System.out.println("(1) New Contractor");
        System.out.println("(2) Edit Contractor");
        System.out.println("(3) Delete Contractor");
        System.out.println("(4) Search Contractors");
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
    
    private boolean inputContractorInfo() {
        
        String name = null;
        String address = null;
        String zipcode = null;
        String city = null;
        String country = null;
        String phone = null;
        int contractorID = 0;
        String company = null;
        LocalDate membership = null;
        
        boolean created = false;
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        while(true) 
        {
            while(true) {
                System.out.println("Enter name: ");
                name = scanner.nextLine();
                if(name.trim() == "") { //checks if the String is empty
                    System.out.println("Contractor must have a name.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter address: ");
                address = scanner.nextLine();
                if(address.trim() == "") { //checks if the String is empty
                    System.out.println("Contractor must have an address of residence.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter zipcode: ");
                zipcode = scanner.nextLine();
                if(!testInt(zipcode)) { //sends input String to testInt
                    System.out.println("Zipcode must be a number.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter city: ");
                city = scanner.nextLine();
                if(city.trim() == "") { //checks if the String is empty
                    System.out.println("Contractor must have a city of residence.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter country: ");
                country = scanner.nextLine();
                if(country.trim() == "") { //checks if the String is empty
                    System.out.println("Contractor must have a country of residence.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter phone: ");
                phone = scanner.nextLine();
                if(!testInt(phone)) { //sends input String to testInt
                    System.out.println("Phone must be a number.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            /*
            // To do: CHECK IF CUSTOMER ID DOES NOT ALREADY EXIST
            while(true) {
                System.out.println("Enter contractor ID: ");
                customerID = scanner.nextInt();
                if(customerID > 0) { //limits the range of the customerID attribute
                    System.out.println("Contractor must have an ID.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
             */
            
            // WHAT IS THIS ATTRIBUTE ABOUT?
            while(true) {
                System.out.println("Enter company: ");
                company = scanner.nextLine();
                if(company.trim() == "") { //checks if the String is empty
                    System.out.println("Contractor must have a ///////finish////////"); //finish sentence
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            /*
            while(true) {
                System.out.println("Enter discount: ");
                discount = scanner.nextDouble();
                if(discount > 0) { //limits the range of discount attribute
                    System.out.println("Registered customer must have a discount.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
             */
            
            boolean answer;
            System.out.println("New contractor: " + " | " + contractorID + " | " + name);
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
                personC.createContractor(contractorID, company, name, address, zipcode, city, country, phone, membership);
                System.out.println(name + " was added to list of customers.");
                created = true;
            }
            return created;
            
        }    
        
    }
    
    private void searchContractor() {
        boolean exit = false;
        while(!exit) {
            int choice = printSearchContractorMenu();
            switch(choice) {
                //case 1:
                //searchContractorID();
                //break;
                case 2:
                    searchContractorName();
                    break;
                case 3:
                    searchContractorAddress(); 
                    break;
                case 4:
                    searchContractorPhone();
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
    
    
    private int printSearchContractorMenu() {
        int choice;
        System.out.println("Search Contractor Menu");
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
    
    //private boolean searchContractorID() TO DO <--
    
    private boolean searchContractorName() {
        boolean found = false;
        String inputName = null;
        System.out.println("Input Name: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputName = intScanner.nextLine();
        if(personC.searchContractorNames(inputName)!= null) {
            for(Person p : personC.searchContractorNames(inputName)) {
                //System.out.println("Contractor ID: " + p.getContractorID());
                System.out.println("Name: " + p.getName());
                System.out.println("Address: " + p.getAddress());
                System.out.println("Zipcode: " + p.getZipcode());
                System.out.println("City: " + p.getCity());
                System.out.println("Country: " + p.getCountry());
                System.out.println("Phone number: " + p.getPhone());
                //System.out.println("Company: " + p.getCompany());
                //System.out.println("Membership: " + p.getMembership();
                System.out.println();
            }
            found = true;
        }
        else {
            System.out.println("Contractor not found.");
        }
        
        return found;
    }
    
    private boolean searchContractorAddress() {
        boolean found = false;
        String inputAddress = null;
        System.out.println("Input Address: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputAddress = intScanner.nextLine();
        if(personC.searchContractorAddress(inputAddress)!= null) {
            for(Person p : personC.searchContractorAddress(inputAddress)) {
                //System.out.println("Contractor ID: " + p.getContractorID());
                System.out.println("Name: " + p.getName());
                System.out.println("Address: " + p.getAddress());
                System.out.println("Zipcode: " + p.getZipcode());
                System.out.println("City: " + p.getCity());
                System.out.println("Country: " + p.getCountry());
                System.out.println("Phone number: " + p.getPhone());
                //System.out.println("Company: " + p.getCompany());
                //System.out.println("Membership: " + p.getMembership();
                System.out.println();
            }
            found = true;
        }
        else {
            System.out.println("Contractor not found.");
        }
        
        return found;
    }
    
    private boolean searchContractorPhone() {
        boolean found = false;
        String inputPhone = null;
        System.out.println("Input Phone number: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputPhone = intScanner.nextLine();
        if(personC.searchContractorPhone(inputPhone)!= null) {
            for(Person p : personC.searchContractorPhone(inputPhone)) {
                //System.out.println("Contractor ID: " + p.getContractorID());
                System.out.println("Name: " + p.getName());
                System.out.println("Address: " + p.getAddress());
                System.out.println("Zipcode: " + p.getZipcode());
                System.out.println("City: " + p.getCity());
                System.out.println("Country: " + p.getCountry());
                System.out.println("Phone number: " + p.getPhone());
                //System.out.println("Company: " + p.getCompany());
                //System.out.println("Membership: " + p.getMembership();
                System.out.println();
            }
            found = true;
        }
        else {
            System.out.println("Contractor not found.");
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
