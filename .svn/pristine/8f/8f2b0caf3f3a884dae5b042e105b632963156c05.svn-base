package uilayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import controllayer.ItemCtr;
import controllayer.SaleCtr;
import modellayer.Item;

public class SaleUI
{
    private SaleCtr saleC = new SaleCtr();;
    private ItemCtr itemC = new ItemCtr();
    
    public void saleMenu() {
        
        boolean exit = false;
        while(!exit) {
            int choice = printSaleMenu();
            switch(choice) {
                case 1:
                    newSale();
                    break;
                case 2:
                    System.out.println("Print something");
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
    
    private int printSaleMenu() {
        System.out.println("Sale menu");
        System.out.println("(1) New Sale");
        System.out.println("(2) Print something.");
        System.out.println("(3) Back");
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
    
    private boolean newSale() { 
        
        //int total = 0;
        // while loop{
        //     insertItem(barcode); 
        //     System.out.println(" Item Item No.        Item Name                             QTY   Price per unit   Total ");
        //     if(getNextNo() < 10){
        //         System.out.println("|" + getNextNo() + " |" + getBarcode() + " |" + getName() + " |" + getQuantity() + " |" + getTotalPrice());
        //         total += getTotal();
        //     }
        //     else if
        
        boolean found = false;
        boolean invoice = false;
        String inputInvoice = null;
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        
        int id = saleC.createSale(invoice);
        while(true) {
            addToSale(id);
            
            System.out.println("Invoice? y/n ");
            inputInvoice = scanner.nextLine();
            if(inputInvoice.trim() != "") {
                if(inputInvoice.toLowerCase() == "y") {
                    invoice = true;
                }
                else if(inputInvoice.toLowerCase() == "n") {
                    invoice = false;
                }
            }
            
            found = saleC.setInvoice(invoice, id);
            break;
        }
        
        
        return found;
    }
     
    private void addToSale(int id) {//TODO: Make it calculate price && prompt to complete sale
        
        String inputBarcode = null;
        String answer = null;
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Type 'q' to exit");
            System.out.println("Input barcode: ");
            inputBarcode = scanner.nextLine();
            if(inputBarcode.toLowerCase().equals("q")){
                break;
            }
            else {
                if(itemC.searchSaleItemBarcodes(inputBarcode).trim()!= "") {
                    System.out.println(itemC.searchSaleItemBarcodes(inputBarcode));
                    saleC.addItem(inputBarcode, id);
                    
                    System.out.println("Add another item? y/n");//TODO fix this shit omg
                    answer = scanner.nextLine();
                    if(answer != null) {
                        if(!answer.toLowerCase().equals("y") && !answer.toLowerCase().equals("n")) {
                            System.out.println("Please only input y or n.");
                        }
                        else if(answer.toLowerCase().equals("y")) {
                            addToSale(id);
                            break;
                        }
                        else if(answer.toLowerCase().equals("n")) {
                            inputBarcode = "q";
                            break;
                        }
                    }
                }
                else {
                    System.out.println("Item not found.");
                }
            }
        }
    }
}
