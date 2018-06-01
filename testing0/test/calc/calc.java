package calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class calc 
{
    test c;
    public calc() 
    {
        
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
       
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
        
    }
    
    @Before
    public void setUp() 
    {
        c = new test();
    }
    
    @After
    public void tearDown() 
    {
        
    }
    
    @Test
    public void addition() 
    {
       assertEquals(5, c.addition(3,2));
    }
    
     @Test
    public void subtraction() 
    {
         assertEquals(1, c.subtraction(3,2));
    }
    
     @Test
    public void multiplication() 
    {
          assertEquals(6, c.multiplication(3,2));
    }
    
     @Test
    public void division() 
    {
         assertEquals(1.5,c.division(3,2),0.1);
    }
}
