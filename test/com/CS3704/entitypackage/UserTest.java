/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CS3704.entitypackage;

import java.util.Collection;
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
public class UserTest {
    
    public UserTest() {
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
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        User instance = new User(10);
        Integer expResult = 10;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        instance = new User(15, "", "", "");
        expResult = 15;
        result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class User.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 20;
        User instance = new User();
        instance.setId(id);
        assertEquals(id, instance.getID());
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User instance = new User(1, "a", "b", "c");
        String expResult = "a";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "f";
        User instance = new User(1, "a", "b", "c");
        instance.setUsername(username);
        assertEquals(username, instance.getUsername());
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        User instance = new User(1, "a", "b", "c");
        String expResult = "b";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "g";
        User instance = new User(1, "a", "b", "c");
        instance.setEmail(email);
        assertEquals(email, instance.getEmail());
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User(1, "a", "b", "c");
        String expResult = "c";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "h";
        User instance = new User(1, "a", "b", "c");
        instance.setPassword(password);
        assertEquals(password, instance.getPassword());
    }

    /**
     * Test of getTransactionCollection method, of class User.
     */
    /**
    @Test
    public void testGetTransactionCollection() {
        System.out.println("getTransactionCollection");
        User instance = new User();
        Collection<com.CS3704.entitypackage.Transaction> expResult = null;
        Collection<com.CS3704.entitypackage.Transaction> result = instance.getTransactionCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setTransactionCollection method, of class User.
     */
    /**
    @Test
    public void testSetTransactionCollection() {
        System.out.println("setTransactionCollection");
        Collection<com.CS3704.entitypackage.Transaction> transactionCollection = null;
        User instance = new User();
        instance.setTransactionCollection(transactionCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getAlertCollection method, of class User.
     */
    /**
    @Test
    public void testGetAlertCollection() {
        System.out.println("getAlertCollection");
        User instance = new User();
        Collection<Alert> expResult = null;
        Collection<Alert> result = instance.getAlertCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setAlertCollection method, of class User.
     */
    /**
    @Test
    public void testSetAlertCollection() {
        System.out.println("setAlertCollection");
        Collection<Alert> alertCollection = null;
        User instance = new User();
        instance.setAlertCollection(alertCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of hashCode method, of class User.
     */
    /**
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        User instance = new User();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of equals method, of class User.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        User instance = new User(1, "a", "b", "c");
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        User instance2 = new User(1, "f", "g", "gh");
        result = instance.equals(instance2);
        expResult = true;
        assertEquals(expResult, result)
        
    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User instance = new User(1, "a", "b", "c");
        String expResult = "com.CS3704.entitypackage.User[ id=1 ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
