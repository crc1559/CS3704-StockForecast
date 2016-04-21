import student.TestCase; 

public class LoginManagerTest extends TestCase 
{
    
    private LoginManager lm1;
    private LoginManager lm2;
    private LoginManager lm3;

    
    public void setUp()
    {
        //FILL IN USERNAME/PASSWORD VALUES
        lm1 = new LoginManager();
        lm1.setUsername("ENTER_VALID_USERNAME");
        lm1.setPassword("ENTER_VALID_PASSWORD");
        lm2 = new LoginManager();
        lm2.setUsername("ENTER_VALID_USERNAME");
        lm2.setPassword("ENTER_NONVALID_PASSWORD");
        lm3 = new LoginManager();
        lm3.setUsername("ENTER_NONVALID_USERNAME");
        lm3.setPassword("ENTER_NONVALID_PASSWORD");
    }
    
   public void testLogin()
   {
       assertEquals(lm1.loginUser(), "Profile");
       assertEquals(lm2.loginUser(), "");
       assertEquals(lm3.loginUser(), "");
   }
   
   public void testErrorMessage()
   {
       lm1.loginUser();
       lm2.loginUser();
       lm3.loginUser();
       assertEquals(lm1.getErrorMessage(), "");
       assertEquals(lm2.getErrorMessage(), "Invalid username or password!");
       assertEquals(lm3.getErrorMessage(), "Invalid username or password!");
   }
}