package JUnit_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllayer.ItemCtr;
import controllayer.SaleCtr;

class Sale_Tests {
    
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }
    
    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }
    
    @BeforeEach
    void setUp() throws Exception {
    }
    
    @AfterEach
    void tearDown() throws Exception {
    }
    
    @Test
    void testCreateSale() {
        int test;
        ItemCtr itemC = new ItemCtr();
        SaleCtr saleC = new SaleCtr();
        
        test = saleC.createSale(false);
        assertNotNull(test);
    }
    @Test
    void testSetInvoice() {
        boolean test = false;
        int id;
        SaleCtr saleC = new SaleCtr();
        
        id = saleC.createSale(false);
        test = saleC.setInvoice(true, id);
        
        assertTrue(test);
    }
    
    @Test
    void testAddItemToSale() {
        int id = 0;
        boolean test = false;
        ItemCtr itemC = new ItemCtr();
        SaleCtr saleC = new SaleCtr();
        itemC.generateItems();
        
        id = saleC.createSale(false);
        test = saleC.addItem("123",id);
        
        assertTrue(test);
    }
}
