package modellayer;

import java.util.ArrayList;

public class PersonContainer
{
	private ArrayList<Customer> customers;
	private ArrayList<Employee> employees;
	private ArrayList<Contractor> contractors;
	private static PersonContainer instance;

	private PersonContainer() {
	    customers = new ArrayList<>();
	    employees = new ArrayList<>();
	    contractors = new ArrayList<>(); 
	}
	
	public static PersonContainer getInstance() {
	    if(instance == null) {
	        instance = new PersonContainer();
	    }
	    return instance;  
	}
	
	public boolean insertCustomer(Customer customer) {
	    boolean result = false;
	    if(customer != null) {
	        result = customers.add(customer);
	    }
	    return result;
	}
	
	public boolean insertEmployee(Employee employee) {
	    boolean result = false;
	    if(employee != null) {
	        result = employees.add(employee);
	    }
	    return result;
	}

	public boolean insertContractor(Contractor contractor) {
	    boolean result = false;
	    if(contractor != null) {
	        contractors.add(contractor);
	    }
	    return result;
	}
	
	public ArrayList<Customer> searchCustomerID(int inputID){
	    ArrayList<Customer> foundCustomers = new ArrayList<>();
	    if(customers != null) {
	        for(Customer c : customers) {
	            if(inputID == c.getCustomerID()) {
	                foundCustomers.add(c);
	            }
	        }
	    }
	    return foundCustomers;
	}
	
	public ArrayList<Person> searchCustomerName(String inputName){
	    ArrayList<Person> foundCustomers = new ArrayList<>();
	    if(customers != null) {
	        for(Person p : customers) {
	            if(p.getName().contains(inputName)) {
	                foundCustomers.add(p);
	            }
	        }
	    }
	    return foundCustomers;
	}
	
	public ArrayList<Person> searchCustomerAddress(String inputAddress){
        ArrayList<Person> foundCustomers = new ArrayList<>();
        if(customers != null) {
            for(Person p : customers) {
                if(p.getAddress().contains(inputAddress)) {
                    foundCustomers.add(p);
                }
            }
        }
        return foundCustomers;
    }
	
	public ArrayList<Person> searchCustomerPhone(String inputPhone){
        ArrayList<Person> foundCustomers = new ArrayList<>();
        if(customers != null) {
            for(Person p : customers) {
                if(p.getName().contains(inputPhone)) {
                    foundCustomers.add(p);
                }
            }
        }
        return foundCustomers;
    }
	
	// public ArrayList<Person> searchEmployeeID(int inputID)
	
	public ArrayList<Person> searchEmployeeName(String inputName){
        ArrayList<Person> foundEmployees = new ArrayList<>();
        if(employees != null) {
            for(Person p : employees) {
                if(p.getName().contains(inputName)) {
                    foundEmployees.add(p);
                }
            }
        }
        return foundEmployees;
    }
    
    public ArrayList<Person> searchEmployeeAddress(String inputAddress){
        ArrayList<Person> foundEmployees = new ArrayList<>();
        if(employees != null) {
            for(Person p : employees) {
                if(p.getAddress().contains(inputAddress)) {
                    foundEmployees.add(p);
                }
            }
        }
        return foundEmployees;
    }
    
    public ArrayList<Person> searchEmployeePhone(String inputPhone){
        ArrayList<Person> foundEmployees = new ArrayList<>();
        if(employees != null) {
            for(Person p : employees) {
                if(p.getName().contains(inputPhone)) {
                    foundEmployees.add(p);
                }
            }
        }
        return foundEmployees;
    }
    
// public ArrayList<Person> searchContractorID(int inputID)
    
    public ArrayList<Person> searchContractorName(String inputName){
        ArrayList<Person> foundContractors = new ArrayList<>();
        if(contractors != null) {
            for(Person p : contractors) {
                if(p.getName().contains(inputName)) {
                    foundContractors.add(p);
                }
            }
        }
        return foundContractors;
    }
    
    public ArrayList<Person> searchContractorAddress(String inputAddress){
        ArrayList<Person> foundContractors = new ArrayList<>();
        if(contractors != null) {
            for(Person p : contractors) {
                if(p.getAddress().contains(inputAddress)) {
                    foundContractors.add(p);
                }
            }
        }
        return foundContractors;
    }
    
    public ArrayList<Person> searchContractorPhone(String inputPhone){
        ArrayList<Person> foundContractors = new ArrayList<>();
        if(contractors != null) {
            for(Person p : contractors) {
                if(p.getName().contains(inputPhone)) {
                    foundContractors.add(p);
                }
            }
        }
        return foundContractors;
    }

	
}
