/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CS3704.entitypackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cody Cummings
 */
public class TransactionTest {
    
    public TransactionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Transaction.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Transaction instance = new Transaction();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Transaction.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Transaction instance = new Transaction();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Transaction.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Transaction instance = new Transaction();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Transaction.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Transaction instance = new Transaction();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStockName method, of class Transaction.
     */
    @Test
    public void testGetStockName() {
        System.out.println("getStockName");
        Transaction instance = new Transaction();
        String expResult = "";
        String result = instance.getStockName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStockName method, of class Transaction.
     */
    @Test
    public void testSetStockName() {
        System.out.println("setStockName");
        String stockName = "";
        Transaction instance = new Transaction();
        instance.setStockName(stockName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStockPrice method, of class Transaction.
     */
    @Test
    public void testGetStockPrice() {
        System.out.println("getStockPrice");
        Transaction instance = new Transaction();
        double expResult = 0.0;
        double result = instance.getStockPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStockPrice method, of class Transaction.
     */
    @Test
    public void testSetStockPrice() {
        System.out.println("setStockPrice");
        double stockPrice = 0.0;
        Transaction instance = new Transaction();
        instance.setStockPrice(stockPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamp method, of class Transaction.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        Transaction instance = new Transaction();
        String expResult = "";
        String result = instance.getTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimestamp method, of class Transaction.
     */
    @Test
    public void testSetTimestamp() {
        System.out.println("setTimestamp");
        String timestamp = "";
        Transaction instance = new Transaction();
        instance.setTimestamp(timestamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class Transaction.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Transaction instance = new Transaction();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class Transaction.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Transaction instance = new Transaction();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Transaction.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Transaction instance = new Transaction();
        instance.getEmail();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Transaction.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        User email = null;
        Transaction instance = new Transaction();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Transaction.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Transaction instance = new Transaction();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Transaction.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Transaction instance = new Transaction();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Transaction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Transaction instance = new Transaction();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
