/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CS3704.jsfclassespackage;

import com.CS3704.entitypackage.User;
import java.util.List;
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
public class UserControllerTest {
    
    public UserControllerTest() {
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
     * Test of getSelected method, of class UserController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        UserController instance = new UserController();
        User expResult = null;
        User result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class UserController.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        User selected = null;
        UserController instance = new UserController();
        instance.setSelected(selected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmbeddableKeys method, of class UserController.
     */
    @Test
    public void testSetEmbeddableKeys() {
        System.out.println("setEmbeddableKeys");
        UserController instance = new UserController();
        instance.setEmbeddableKeys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeEmbeddableKey method, of class UserController.
     */
    @Test
    public void testInitializeEmbeddableKey() {
        System.out.println("initializeEmbeddableKey");
        UserController instance = new UserController();
        instance.initializeEmbeddableKey();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class UserController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        UserController instance = new UserController();
        User expResult = null;
        User result = instance.prepareCreate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class UserController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        UserController instance = new UserController();
        instance.create();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UserController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        UserController instance = new UserController();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class UserController.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        UserController instance = new UserController();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class UserController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        UserController instance = new UserController();
        List<User> expResult = null;
        List<User> result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class UserController.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Integer id = null;
        UserController instance = new UserController();
        User expResult = null;
        User result = instance.getUser(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectMany method, of class UserController.
     */
    @Test
    public void testGetItemsAvailableSelectMany() {
        System.out.println("getItemsAvailableSelectMany");
        UserController instance = new UserController();
        List<User> expResult = null;
        List<User> result = instance.getItemsAvailableSelectMany();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectOne method, of class UserController.
     */
    @Test
    public void testGetItemsAvailableSelectOne() {
        System.out.println("getItemsAvailableSelectOne");
        UserController instance = new UserController();
        List<User> expResult = null;
        List<User> result = instance.getItemsAvailableSelectOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
