package uilayer;

import java.time.LocalDate;

import java.util.Scanner;

import controllayer.PersonCtr;

import modellayer.Account;
import modellayer.Person;

import java.util.InputMismatchException;


public class EmployeeUI
{
    private PersonCtr personC = new PersonCtr();
    
    public void employeeMenu() {
        boolean exit = false;
        while(!exit) {
            int choice = printEmployeeMenu();
            switch(choice) {
                case 1:
                    inputEmployeeInfo();
                    break;
                case 2:
                    //editEmployee();
                    break;
                case 3:
                    //deleteEmployee();
                    break;
                case 4: 
                    searchEmployee();
                    break;
                case 5:
                    //employeesByStatistics();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    exit = false;
                    break;          
            }
        }
    }
    
    public int printEmployeeMenu() {
        System.out.println("Employee Menu");
        System.out.println("(1) New Employee");
        System.out.println("(2) Edit Employee");
        System.out.println("(3) Delete Employee");
        System.out.println("(4) Search Employee");
        System.out.println("(5) Employees' statistics");
        System.out.println("(6) Exit");
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
    
    private boolean inputEmployeeInfo() {
        String name = null;
        String address = null;
        String zipcode = null;
        String city = null;
        String country = null;
        String phone = null;
        Account account = null;
        int employeeID = 0;
        boolean managerAccess = false;
        double salary = 0;
        LocalDate hiredDate = null;
        double discount = 0;
        
        boolean created = false;
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        while(true) 
        {
            while(true) {
                System.out.println("Enter name: ");
                name = scanner.nextLine();
                if(name.trim() == "") { //checks if the String is empty
                    System.out.println("Employee must have a name.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter address: ");
                address = scanner.nextLine();
                if(address.trim() == "") { //checks if the String is empty
                    System.out.println("Employee must have an address of residence.");
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
                    System.out.println("Employee must have a city of residence.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter country: ");
                country = scanner.nextLine();
                if(country.trim() == "") { //checks if the String is empty
                    System.out.println("Employee must have a coountry of residence.");
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
            
            //while(true){ --> attribute account
            //  account stuff
            //}
            
            
            
            /*
            // CHECK IF EMPLOYEE ID DOES NOT ALREADY EXIST
            while(true) {
                System.out.println("Enter employee ID: ");
                customerID = scanner.nextInt();
                if(customerID > 0) { //limits the range of the customerID attribute
                    System.out.println("Employee must have an ID.");
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
             */
            
            System.out.println("Manager access: Y/N");  
            while(true) {
                String yn = scanner.next().trim().toLowerCase();
                if(yn.equals("y")) {
                    managerAccess = true;
                    break;
                }
                else if(yn.equals("n")) {
                    managerAccess = false;
                    break;
                }
                else {
                    System.out.println("Invalid input.");
                }
            }
            
            /*
            while(true) {
                System.out.println("Enter salary: ");
                salary = intScanner.nextDouble();
                if(salary > 0) { //limits the range of the price attribute
                    System.out.println("Employee must have a salary."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
             */
            
            
            // while loop for hiredDate --> attribute
            
            
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
            System.out.println("New employee: " + " | " + employeeID + " | " + name);
            System.out.println("Confirm? Y/N");
            while(true) {
                String yn2 = scanner.next().trim().toLowerCase();
                if(yn2.equals("y")) {
                    answer = true;
                    break;
                }
                else if(yn2.equals("n")) {
                    answer = false;
                    break;
                }
                else {
                    System.out.println("Invalid input.");
                }
            }
            if(answer) {
                personC = new PersonCtr();
                personC.createEmployee(name, address, zipcode, city, country, phone, account, employeeID, managerAccess, salary, hiredDate, discount);
                System.out.println(name + " was added to list of employees.");
                created = true;
            }
            //if(access) { //accessLevel of employee Y/N
            //    set accessLevel to true, otherwise to false
            //}
            
            System.out.println();//line between creation of new employee and printing the menu
            
            return created;
        }
    }
    
    private void searchEmployee() {
        boolean exit = false;
        while(!exit) {
            int choice = printSearchEmployeeMenu();
            switch(choice) {
                //case 1:
                //searchEmployeeID();
                //break;
                case 2:
                    searchEmployeeName();
                    break;
                case 3:
                    searchEmployeeAddress(); 
                    break;
                case 4:
                    searchEmployeePhone();
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
    
    
    private int printSearchEmployeeMenu() {
        int choice;
        System.out.println("Search Employee Menu");
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
    
    //private boolean searchEmployeeID() TO DO <--
    
    private boolean searchEmployeeName() {
        boolean found = false;
        String inputName = null;
        System.out.println("Input Name: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputName = intScanner.nextLine();
        if(personC.searchEmployeeNames(inputName)!= null) { //TODO: FIX THIS TOO AAAAAAAAAAAAAAAA
            for(Person p : personC.searchEmployeeNames(inputName)) {
                //System.out.println("Employee ID: " + p.getEmployeeID());
                System.out.println("Name: " + p.getName());
                System.out.println("Address: " + p.getAddress());
                System.out.println("Zipcode: " + p.getZipcode());
                System.out.println("City: " + p.getCity());
                System.out.println("Country: " + p.getCountry());
                System.out.println("Phone number: " + p.getPhone());
                //System.out.println("Account: " + p.getAccount());
                //System.out.println("Salary: " + p.getSalary());
                //System.out.println("Hired Date: " + p.getHiredDate());
                //System.out.println("Discount: " + p.getDiscount());
                System.out.println();
            }
            found = true;
        }
        else {
            System.out.println("Employee not found.");
        }
        
        return found;
    }
    
    private boolean searchEmployeeAddress() {
        boolean found = false;
        String inputAddress = null;
        System.out.println("Input Address: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputAddress = intScanner.nextLine();
        if(personC.searchEmployeeAddress(inputAddress)!= null) { //TODO: FIX THIS TOO AAAAAAAAAAAAAAAA
            for(Person p : personC.searchEmployeeAddress(inputAddress)) {
                //System.out.println("Employee ID: " + p.getEmployeeID());
                System.out.println("Name: " + p.getName());
                System.out.println("Address: " + p.getAddress());
                System.out.println("Zipcode: " + p.getZipcode());
                System.out.println("City: " + p.getCity());
                System.out.println("Country: " + p.getCountry());
                System.out.println("Phone number: " + p.getPhone());
                //System.out.println("Account: " + p.getAccount());
                //System.out.println("Salary: " + p.getSalary());
                //System.out.println("Hired Date: " + p.getHiredDate());
                //System.out.println("Discount: " + p.getDiscount());
                System.out.println();
            }
            found = true;
        }
        else {
            System.out.println("Employee not found.");
        }
        
        return found;
    }
    
    private boolean searchEmployeePhone() {
        boolean found = false;
        String inputPhone = null;
        System.out.println("Input Phone number: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputPhone = intScanner.nextLine();
        if(personC.searchEmployeePhone(inputPhone)!= null) { //TODO: FIX THIS TOO AAAAAAAAAAAAAAAA
            for(Person p : personC.searchEmployeePhone(inputPhone)) {
                //System.out.println("Employee ID: " + p.getEmployeeID());
                System.out.println("Name: " + p.getName());
                System.out.println("Address: " + p.getAddress());
                System.out.println("Zipcode: " + p.getZipcode());
                System.out.println("City: " + p.getCity());
                System.out.println("Country: " + p.getCountry());
                System.out.println("Phone number: " + p.getPhone());
                //System.out.println("Account: " + p.getAccount());
                //System.out.println("Salary: " + p.getSalary());
                //System.out.println("Hired Date: " + p.getHiredDate());
                //System.out.println("Discount: " + p.getDiscount());
                System.out.println();
            }
            found = true;
        }
        else {
            System.out.println("Employee not found.");
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
