/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CS3704.managers;

import com.CS3704.entitypackage.User;
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
public class LoginManagerTest {
    
    public LoginManagerTest() {
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
     * Test of getUsername method, of class LoginManager.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        LoginManager instance = new LoginManager();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class LoginManager.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        LoginManager instance = new LoginManager();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createUser method, of class LoginManager.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        LoginManager instance = new LoginManager();
        String expResult = "";
        String result = instance.createUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetPassword method, of class LoginManager.
     */
    @Test
    public void testResetPassword() {
        System.out.println("resetPassword");
        LoginManager instance = new LoginManager();
        String expResult = "";
        String result = instance.resetPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class LoginManager.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LoginManager instance = new LoginManager();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class LoginManager.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        LoginManager instance = new LoginManager();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErrorMessage method, of class LoginManager.
     */
    @Test
    public void testGetErrorMessage() {
        System.out.println("getErrorMessage");
        LoginManager instance = new LoginManager();
        String expResult = "";
        String result = instance.getErrorMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setErrorMessage method, of class LoginManager.
     */
    @Test
    public void testSetErrorMessage() {
        System.out.println("setErrorMessage");
        String errorMessage = "";
        LoginManager instance = new LoginManager();
        instance.setErrorMessage(errorMessage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class LoginManager.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        LoginManager instance = new LoginManager();
        String expResult = "";
        String result = instance.loginUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeSessionMap method, of class LoginManager.
     */
    @Test
    public void testInitializeSessionMap() {
        System.out.println("initializeSessionMap");
        User user = null;
        LoginManager instance = new LoginManager();
        instance.initializeSessionMap(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
