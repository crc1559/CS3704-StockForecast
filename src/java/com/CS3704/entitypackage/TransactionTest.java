import student.TestCase; 

public class TransactionTest extends TestCase 
{
    
    private Transaction t1;
    private Transaction t2;
    private Transaction t3;
    
    public void setUp()
    {
        t1 = new Transaction(0, "buy", "IBM", 10.0, "10/12/16", 5);
        t2 = new Transaction(1, "sell", "GOOG", 10);
        t3 = new Transaction();
    }
    
    public void testGetPrice()
    {
        assertEquals(t1.getStockPrice(), 10.0);
        assertTrue(t2.getStockPrice() > 0.0);
    }
    
    public void testLivePrice()
    {
        print(t1.getLivePrice());
        print(t2.getLivePrice());
        assertTrue(t1.getLivePrice() > 0.0);
        assertTrue(t2.getLivePrice() > 0.0);
    }
    
    public void testRealStock()
    {
        assertEquals(t1.getStock().getName(), "IBM");
        assertEquals(t2.getStock().getName(), "Google");
    }
    
    public void testFakeStock()
    {
        assertNull(t3.getStock());
    }
    
    public void testToString()
    {
        assertEquals(t1, "com.cs3704.stockpredictor.Transaction[ id=0 ]");
        assertEquals(t2, "com.cs3704.stockpredictor.Transaction[ id=1 ]");
    }
    
    public void testEquals()
    {
        assertTrue(t1, new Transaction(0, "buy", "IBM", 10.0, "10/12/16", 5));
        assertFalse(t1, t2);
    }
}