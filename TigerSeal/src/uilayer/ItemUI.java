package uilayer;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Calendar;
import controllayer.ItemCtr;
import modellayer.Item;
import java.util.Scanner;

import controllayer.ItemCtr;
import modellayer.Item;

public class ItemUI
{
    private ItemCtr itemC = new ItemCtr();;
    
    public void itemMenu() {
        boolean exit = false;
        while(!exit) {
            int choice = printItemMenu();
            switch(choice) {
                case 1:
                    newItem();
                    break;
                case 2:
                    //editItem();
                    break;
                case 3:
                    //deleteItem();
                    break;
                case 4: 
                    searchItems();
                    break;
                case 5:
                    //itemsByCategory();
                    break;
                case 6:
                    exit = true;
                    break;
                case 7:
                    generateItems();
                    break;
                default:
                    exit = false;
                    break;			
            }
        }
    }
    
    private int printItemMenu() {
        System.out.println("Item menu");
        System.out.println("(1) New Item");
        System.out.println("(2) Edit Item");
        System.out.println("(3) Delete Item");
        System.out.println("(4) Search Inventory");
        System.out.println("(5) Items by category");
        System.out.println("(6) Back");
        System.out.println("(7) Generate Test Inventory");
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
    
    private void newItem() {
        boolean exit = false;
        while(!exit) {
            int choice = printNewItemMenu();
            switch(choice) {
                case 1: 
                    inputSaleItemInfo();
                    break;
                case 2:
                    inputLoanItemInfo();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    exit = false;
                    break;
            }
        }
    }
    
    private int printNewItemMenu() {
        int choice;
        System.out.println("New Item Menu");
        System.out.println("(1) New Sale Item");
        System.out.println("(2) New Loan Item");
        System.out.println("(3) Back");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            choice = scanner.nextInt();
        }
        else {
            choice = 0;
        }
        
        return choice;
    }
    
    private boolean inputSaleItemInfo() {
        String barcode = null;
        String name = null; 
        String category = null;
        String description = null;
        String serialNumber = null;
        String location = null;
        double price = 0;
        int quantity = 0;
        
        
        boolean created = false;
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        while(true)
        {
            while(true) {
                System.out.println("Enter barcode: ");
                barcode = scanner.nextLine();
                if(!testInt(barcode)) { //sends input String to testInt
                    System.out.println("Barcode must be a number."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter name: ");
                name = scanner.nextLine();
                if(name.trim() == "") { //checks if the String is empty
                    System.out.println("Item must have a name."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter category: ");
                category = scanner.nextLine();
                if(category.trim() == "") { //checks if the String is empty
                    System.out.println("Item must have a category."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter description: ");
                description = scanner.nextLine();
                if(description.trim() == "") { //checks if the String is empty
                    System.out.println("Item must have a description."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter price: ");
                price = intScanner.nextDouble();
                if(price <= 0) { //limits the range of the price attribute
                    System.out.println("Item must have a price."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter quantity: ");
                quantity = intScanner.nextInt();
                if(quantity <= 0) { //limits the range of the quantity attribute
                    System.out.println("Item must have a valid quantity."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter serial number: ");
                serialNumber = scanner.nextLine();
                if(!testInt(serialNumber)) { //sends input String to testInt 
                    System.out.println("Item must have a valid serial number."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter location: ");
                location = scanner.nextLine();
                if(location.trim() == "") { //checks if the String is empty
                    System.out.println("Item must have a location."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            boolean answer;
            System.out.println("New Item: " + " | " + barcode + " | " + name);
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
                itemC = new ItemCtr();
                itemC.createSaleItem(barcode, name,category, description, price, quantity, serialNumber, location);
                System.out.println(name + " was added to inventory."); 
                created = true;
            }
            return created;
        }
    }
    
    public boolean inputLoanItemInfo() {
        String barcode = null;
        String name = null; 
        String category = null;
        String description = null;
        String serialNumber = null;
        String location = null;
        Calendar date = null;
        boolean state = false;
        double price = 0;
        int quantity = 0;
        int period = 0;
        
        boolean created = false;
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        while(true)
        {
            while(true) {
                System.out.println("Enter barcode: ");
                barcode = intScanner.nextLine();
                if(!testInt(barcode)) { //sends input String to testInt
                    System.out.println("Barcode must be a number."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter name: ");
                name = scanner.nextLine();
                if(name.trim() == "") { //checks if the String is empty
                    System.out.println("Item must have a name."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter category: ");
                category = scanner.nextLine();
                if(category.trim() == "") { //checks if the String is empty
                    System.out.println("Item must have a category."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter description: ");
                description = scanner.nextLine();
                if(description.trim() == "") { //checks if the String is empty
                    System.out.println("Item must have a description."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter price: ");
                price = intScanner.nextDouble();
                if(price <= 0) { //limits the range of the price attribute
                    System.out.println("Item must have a price."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter quantity: ");
                quantity = intScanner.nextInt();
                if(quantity <= 0) { //limits the range of the quantity attribute
                    System.out.println("Item must have a valid quantity."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter serial number: ");
                serialNumber = scanner.nextLine();
                if(!testInt(serialNumber)) { //sends input String to testInt 
                    System.out.println("Item must have a valid serial number."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            while(true) {
                System.out.println("Enter location: ");
                location = scanner.nextLine();
                if(location.trim() == "") { //checks if the String is empty
                    System.out.println("Item must have a location."); //if the test is false, error message
                }
                else {
                    break; //if test is true, continues running to next input
                }
            }
            
            boolean answer;
            System.out.println("New Item: " + " | " + barcode + " | " + name);
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
                itemC = new ItemCtr();
                itemC.createLoanItem(barcode, name, category, description, price, quantity, serialNumber, period, date, state, location);
                System.out.println(name + " was added to inventory."); 
                created = true;
            }
            return created;
        }
    }
    
    private void searchItems() {
        boolean exit = false;
        while(!exit) {
            int choice = printSearchItemMenu();
            switch(choice) {
                case 1: 
                    searchSaleItem();
                    break;
                case 2:
                    searchLoanItem();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    exit = false;
                    break;
            }
        }
    }
    
    private int printSearchItemMenu() {
        int choice;
        System.out.println("Search Item Menu");
        System.out.println("(1) Search Sale Items");
        System.out.println("(2) Search Loan Items");
        System.out.println("(3) Back");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            choice = scanner.nextInt();
        }
        else {
            choice = 0;
        }
        
        return choice;
    }
    
    private void searchSaleItem() {
        boolean exit = false;
        while(!exit) {
            int choice = printSearchSaleItemMenu();
            switch(choice) {
                case 1:
                    searchSaleItemBarcode();
                    break;
                case 2:
                    searchSaleItemName();
                    break;
                case 3:
                    searchSaleItemDescription(); 
                    break;
                case 4:
                    searchSaleItemCategory();
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
    
    private int printSearchSaleItemMenu() {
        int choice;
        System.out.println("Search Sale Item Menu");
        System.out.println("(1) Search by barcode");
        System.out.println("(2) Search by name");
        System.out.println("(3) Search by description");
        System.out.println("(4) Search by category");
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
    
    private boolean searchSaleItemBarcode() {
        boolean found = false;
        String inputBarcode = null;
        System.out.println("Input barcode: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputBarcode = intScanner.nextLine();
        if(itemC.searchSaleItemBarcodes(inputBarcode).trim().equals("")) {
            System.out.println("Item not found.");
        }
        else {
            System.out.println(itemC.searchSaleItemBarcodes(inputBarcode));
            found = true;
        }
        
        return found;
    }
    
    private boolean searchSaleItemName(){
        boolean found = false;
        String inputName = null;
        System.out.println("Input name: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputName = intScanner.nextLine();
        if(itemC.searchSaleItemNames(inputName)!= null) {
            System.out.println(itemC.searchSaleItemNames(inputName));
            found = true;
        }
        else {
            System.out.println("Item not found.");
        }
        
        return found;
    }
    
    private boolean searchSaleItemDescription(){
        boolean found = false;
        String inputDescription = null;
        System.out.println("Input Description: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputDescription = intScanner.nextLine();
        if(itemC.searchSaleItemDescriptions(inputDescription) != null){
            System.out.println(itemC.searchSaleItemDescriptions(inputDescription));
            found = true;
        }
        else {
            System.out.println("Item not found.");
        }
        
        return found;
    }
    
    private boolean searchSaleItemCategory(){
        boolean found = false;
        String inputCategory = null;
        System.out.println("Input category: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputCategory = intScanner.nextLine();
        if(itemC.searchSaleItemCategories(inputCategory) != null){
            System.out.println(itemC.searchSaleItemCategories(inputCategory));
            found = true;
        }
        else {
            System.out.println("Item not found.");
        }
        
        return found;
    }
    
    // ---------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    
    private void searchLoanItem() {
        boolean exit = false;
        while(!exit) {
            int choice = printSearchLoanItem();
            switch(choice) {
                case 1:
                    searchLoanItemBarcode();
                    break;
                case 2:
                    searchLoanItemName();
                    break;
                case 3:
                    searchLoanItemDescription();
                    break;
                case 4:
                    searchLoanItemCategory();
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
    
    private int printSearchLoanItem() {
        int choice;
        System.out.println("Search Loan Item Menu");
        System.out.println("(1) Search by barcode");
        System.out.println("(2) Search by name");
        System.out.println("(3) Search by description");
        System.out.println("(4) Search by category");
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
    
    private boolean searchLoanItemBarcode() {
        boolean found = false;
        String inputBarcode = null;
        System.out.println("Input barcode: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputBarcode = intScanner.nextLine();
        if(itemC.searchLoanItemBarcodes(inputBarcode)!= null) {
            System.out.println(itemC.searchLoanItemBarcodes(inputBarcode));
            found = true;
        }
        else {
            System.out.println("Item not found.");
        }
        
        return found;
    }
    
    private boolean searchLoanItemName(){
        boolean found = false;
        String inputName = null;
        System.out.println("Input name: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputName = intScanner.nextLine();
        if(itemC.searchLoanItemNames(inputName)!= null) {
            System.out.println(itemC.searchLoanItemNames(inputName));
            found = true;
        }
        else {
            System.out.println("Item not found.");
        }
        
        return found;
    }
    
    private boolean searchLoanItemDescription(){
        boolean found = false;
        String inputDescription = null;
        System.out.println("Input Description: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputDescription = intScanner.nextLine();
        if(itemC.searchLoanItemDescriptions(inputDescription) != null){
            System.out.println(itemC.searchLoanItemDescriptions(inputDescription));
            found = true;
        }
        else {
            System.out.println("Item not found.");
        }
        
        return found;
    }
    
    private boolean searchLoanItemCategory() {
        boolean found = false;
        String inputCategory = null;
        System.out.println("Input category: ");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        inputCategory = intScanner.nextLine();
        if(itemC.searchLoanItemCategories(inputCategory) != null){
            System.out.println(itemC.searchLoanItemCategories(inputCategory));
            found = true;
        }
        else {
            System.out.println("Item not found.");
        }
        
        return found;
    }
    
    private void generateItems() {
        itemC.generateItems();
        System.out.println("Items generated.");
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
