package JUnit_Tests;
import modellayer.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllayer.ItemCtr;

class Item_Tests {
    
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
    void testItemCreate() {
        boolean test = false;
        ItemCtr itemC = new ItemCtr();
        test = itemC.createSaleItem("testBarcode", "testName", "testCategory", "testDescription", 10, 1, "testSerialNumber", "testLocation");
        assertTrue(test);
    }
    
    @Test
    void testItemSearchBarcode() {
        String test = null;
        ItemCtr itemC = new ItemCtr();
        itemC.createSaleItem("testBarcode", "testName", "testCategory", "testDescription", 10, 1, "testSerialNumber", "testLocation");
        test = itemC.searchSaleItemBarcodes("testBarcode");
        assertNotNull(test);
    }
    
    @Test
    void testItemSearchName() {
        String test = null;
        ItemCtr itemC = new ItemCtr();
        itemC.createSaleItem("testBarcode", "testName", "testCategory", "testDescription", 10, 1, "testSerialNumber", "testLocation");
        test = itemC.searchSaleItemNames("testName");
        assertNotNull(test);
    }
    
    @Test
    void testItemSearchDescription() {
        String test = null;
        ItemCtr itemC = new ItemCtr();
        itemC.createSaleItem("testBarcode", "testName", "testCategory", "testDescription", 10, 1, "testSerialNumber", "testLocation");
        test = itemC.searchSaleItemDescriptions("testDescription");
        assertNotNull(test);
    }
    
    @Test
    void testItemSearchCategory() {
        String test = null;
        ItemCtr itemC = new ItemCtr();
        itemC.createSaleItem("testBarcode", "testName", "testCategory", "testDescription", 10, 1, "testSerialNumber", "testLocation");
        test = itemC.searchSaleItemCategories("testCategory");
        assertNotNull(test);
    }
}
