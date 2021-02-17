package uilayer;

import java.util.Scanner;

import controllayer.ItemCtr;

public class MainUI {
    
    private ItemUI itemUI;
    private CustomerUI customerUI;
    private EmployeeUI employeeUI;
    private ContractorUI contractorUI;
    private SaleUI saleUI;
    
    public MainUI()
    {
    }
    
    public static void main(String[] agrs)
    {
        new MainUI().mainMenu();
    }
    
    
    public void mainMenu() {
        boolean exit = false;
        while(!exit) {
            int choice = printMainMenu();
            switch(choice) {
                case 1:
                    saleUI = new SaleUI();
                    saleUI.saleMenu();
                    break;
                case 2:
                    customerUI = new CustomerUI();
                    customerUI.customerMenu();
                    break;
                case 3:
                    employeeUI = new EmployeeUI();
                    employeeUI.employeeMenu();
                    break;
                case 4:
                    contractorUI = new ContractorUI();
                    contractorUI.contractorMenu();
                    break;
                case 5:
                    itemUI = new ItemUI();
                    itemUI.itemMenu();
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
    
    private int printMainMenu() {
        System.out.println("Main menu");
        System.out.println("(1) Sale");
        System.out.println("(2) Customer");
        System.out.println("(3) Employee");
        System.out.println("(4) Contractor");
        System.out.println("(5) Item");
        System.out.println("(6) Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        if(scanner.hasNextInt()) {
            choice = scanner.nextInt();
        }
        else {
            choice = 0;
        }
        return choice;
    }
    
}
