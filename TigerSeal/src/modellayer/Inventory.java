package modellayer;

import java.util.ArrayList;

public class Inventory
{
    private ArrayList<SaleItem> saleItems;
    private ArrayList<LoanItem> loanItems;
    //private HashMap<ArrayList<SaleItem>, ArrayList<LoanItem>> 
    private static Inventory instance;
    
    public Inventory() {
        saleItems = new ArrayList<>();
        loanItems = new ArrayList<>();
        
    }
    
    public static Inventory getInstance() {
        if(instance == null) {
            instance = new Inventory();
        }
        return instance;
    }
    
    /*
	public Map<ArrayList<SaleItem>, ArrayList<LoanItem>> searchBarcode(String inputBarcode){
		ArrayList<SaleItem> foundSaleItems = new ArrayList<SaleItem>();
		ArrayList<LoanItem> foundLoanItems = new ArrayList<LoanItem>();
		Map<ArrayList<SaleItem>, ArrayList<LoanItem>> barcodeMap = new HashMap();
		if(saleItems != null) {
			for(SaleItem si : saleItems) {
				if(si.getBarcode().equals(inputBarcode)) {
					foundSaleItems.add(si);
				}
			}
		}
		else if(loanItems != null) {
			for(LoanItem li : loanItems) {
				if(li.getBarcode().equals(inputBarcode)) {
					foundLoanItems.add(li);
				}
			}
		}
		barcodeMap.put(saleItems,foundSaleItems);
	}
     */
    
    public boolean insertSaleItem(SaleItem saleItem) { //TODO: what if it is added twice?
        boolean result = false;
        if(saleItem != null) {
            result = saleItems.add(saleItem);
        }
        return result;
    }
    
    public boolean duplicationCheck(SaleItem saleItem) { //Checks if the item already exits, returns true/false
        boolean result = false;
        if(saleItem != null) {
            for(SaleItem i : saleItems) {
                if(i.getName() == saleItem.getName() && i.getBarcode() == saleItem.getBarcode() && 
                        i.getCategory() == saleItem.getCategory() && i.getSerialNumber() == saleItem.getSerialNumber()) {
                    result = true;
                }
            }
        }
        return result;
    }
    
    public SaleItem toAddSaleItemBarcode(String inputBarcode) {
        SaleItem foundSaleItem = null;
        for(int i = 0; i < saleItems.size(); i++) {
            if(saleItems.get(i).getBarcode().equals(inputBarcode)) {
                    foundSaleItem = saleItems.get(i);
            }
        }
        return foundSaleItem;
    }
    
    public String searchSaleItemBarcode(String inputBarcode) { 
        String foundSaleItemString = "";
        if(saleItems != null) {
            for(Item i : saleItems) {
                if(i.getBarcode().equals(inputBarcode)) {
                    foundSaleItemString += i.toString() + "\n";
                }
            }
        }
        return foundSaleItemString;
    }
    
    public String searchSaleItemName(String inputName){
        String foundSaleItemString = "";
        if(saleItems!= null){
            for(Item i : saleItems){
                if(i.getName().contains(inputName)){
                    foundSaleItemString += i.toString() + "\n";
                }
            }
        }
        return foundSaleItemString;
    }
    
    public String searchSaleItemDescription(String inputDescription){
        String foundSaleItemString = "";
        if(saleItems != null){
            for(Item i : saleItems){
                if(i.getDescription().contains(inputDescription)){
                    foundSaleItemString += i.toString() + "\n";
                }
            }
        }
        return foundSaleItemString;
    }
    
    public String searchSaleItemCategory(String inputCategory){
        String foundSaleItemString = "";
        if(saleItems != null){
            for(Item i : saleItems){
                if(i.getCategory().contains(inputCategory)){
                    foundSaleItemString += i.toString() + "\n";
                }
            }
        }
        return foundSaleItemString;
    }
    
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------
    
    public boolean insertLoanItem(LoanItem loanItem){
        boolean result = false;
        if(loanItem != null){
            result = loanItems.add(loanItem);
        }
        return result;
    }
    
    public String searchLoanItemBarcode(String inputBarcode){
        String foundSaleItemString = "";
        if(loanItems != null) {
            for(Item li : loanItems) {
                if(li.getBarcode().contains(inputBarcode)) {
                    foundSaleItemString += li.toString() + "\n";
                }
            }
        }
        return foundSaleItemString;
    }
    
    public String searchLoanItemName(String inputName){
        String foundSaleItemString = "";
        if(loanItems != null){
            for(Item li : loanItems){
                if(li.getName().contains(inputName)){
                    foundSaleItemString += li.toString() + "\n";
                }
            }
        }
        return foundSaleItemString;
    }
    
    public String searchLoanItemDescription(String inputDescription){
        String foundSaleItemString = "";
        if(loanItems != null){
            for(LoanItem li : loanItems){
                if(li.getDescription().contains(inputDescription)){
                    foundSaleItemString += li.toString() + "\n";
                }
            }
        }
        return foundSaleItemString;
    }
    
    public String searchLoanItemCategory(String inputCategory){
        String foundSaleItemString = "";
        if(loanItems != null){
            for(LoanItem li : loanItems){
                if(li.getCategory().contains(inputCategory)){
                    foundSaleItemString += li.toString() + "\n";
                }
            }
        }
        return foundSaleItemString;
    }
    
    
    
    
    
}
