/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CS3704.managers;

import com.CS3704.manager.LoginManager;
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
        instance.setUsername("_USERNAME");
        String expResult = "_USERNAME";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class LoginManager.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "_User";
        LoginManager instance = new LoginManager();
        instance.setUsername(username);
        assertEquals(username, instance.getUsername());
    }

    /**
     * Test of createUser method, of class LoginManager.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        LoginManager instance = new LoginManager();
        String expResult = "CreateAccount";
        String result = instance.createUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of resetPassword method, of class LoginManager.
     */
    @Test
    public void testResetPassword() {
        System.out.println("resetPassword");
        LoginManager instance = new LoginManager();
        String expResult = "EnterUsername?faces-redirect=true";
        String result = instance.resetPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class LoginManager.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LoginManager instance = new LoginManager();
        String expResult = "aaa";
        instance.setPassword("aaa");
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class LoginManager.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "abc";
        LoginManager instance = new LoginManager();
        instance.setPassword(password);
        assertEquals(password, instance.getPassword());
    }

    /**
     * Test of getErrorMessage method, of class LoginManager.
     */
    @Test
    public void testGetErrorMessage() {
        System.out.println("getErrorMessage");
        LoginManager instance = new LoginManager();
        intance.setErrorMessage("bbb");
        String expResult = "bbb";
        String result = instance.getErrorMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setErrorMessage method, of class LoginManager.
     */
    @Test
    public void testSetErrorMessage() {
        System.out.println("setErrorMessage");
        String errorMessage = "bbb";
        LoginManager instance = new LoginManager();
        instance.setErrorMessage(errorMessage);
        assertEquals(instance.getErrorMessage(), errorMessage);
    }

    /**
     * Test of loginUser method, of class LoginManager.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        LoginManager instance = new LoginManager();
        instance.setUsername("valid_USERNAME");
        instance.setPasswrod("valid_PASSWORD");
        String expResult = "Profile";
        String result = instance.loginUser();
        assertEquals(expResult, result);
        instance = new LoginManager();
        instance2.setUsername("nonvalid_USERNAME");
        instance2.setPasswrod("nonvalid_PASSWORD");
        expResult = "Invalid username or password!";
        result = instance2.loginUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of initializeSessionMap method, of class LoginManager.
     */
    /**@Test
    public void testInitializeSessionMap() {
        System.out.println("initializeSessionMap");
        User user = null;
        LoginManager instance = new LoginManager();
        instance.initializeSessionMap(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
