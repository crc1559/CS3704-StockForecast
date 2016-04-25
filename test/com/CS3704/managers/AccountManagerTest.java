package com.CS3704.managers;

import com.CS3704.managers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
* System test for logging in, out, and creating an account
* @author Cody Cummings
*/
public class AccountManagerTest {

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
    * Test of creating an account through the account manager class
    */
   @Test
   public void testCreateAccount() {
       //Test valid account
       System.out.println("System test for logging in");
       AccountManager instance = new AccountManager();
       instance.setUsername("VALID_USERNAME");
       instance.setEmail("VALID_EMAIL");
       instance.setPassword("VALID_PASSWORD");
       String expResult = "Profile";
       String result = instance.createAccount();
       assertEquals(expResult, result);
       //Test taken username
       instance = new AccountManager();
       instance.setUsername("TAKEN_USERNAME");
       instance.setEmail("VALID_EMAIL");
       instance.setPassword("VALID_PASSWORD");
       String expResult = "Username already exists! Please select a different one!";
       String result = instance.createAccount();
       assertEquals(expResult, result);
       //Test taken email
       instance = new AccountManager();
       instance.setUsername("VALID_USERNAME");
       instance.setEmail("TAKEN_EMAIL");
       instance.setPassword("VALID_PASSWORD");
       String expResult = "Email already exists! Please select a different one!";
       String result = instance.createAccount();
       assertEquals(expResult, result);
   }

   /**
    * Test of logging out
    */
   @Test
   public void testLogOut() {
       AccountManager instance = new AccountManager();
       instance.setUsername("VALID_USERNAME");
       instance.setEmail("VALID_EMAIL");
       instance.setPassword("VALID_PASSWORD");
       instance.logout();
       assertEquals(instance.getUsername(), "");
       assertEquals(instance.getPassword(), "");
       assertEquals(instance.getEmail(), "");
   }
}