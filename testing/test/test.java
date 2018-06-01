/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class test {
    
    bank a;
  
    
    public test()
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
        a=new bank();
    }
    
    @After
    public void tearDown()
    {
    }

     @Test
     public void create() 
     {
          assertEquals(0, a.create(50,50));
           assertEquals(0, a.create(20,20));
            assertEquals(0, a.create(70,70));
     }
     
      @Test
     public void deposit1() 
     {
          assertEquals(500, a.deposit1(500,0));
          assertEquals(600, a.deposit1(500,100));
          assertEquals(1200, a.deposit1(1000,200));
     }
     
      @Test
     public void withdraw() 
     {
         assertEquals( 500, a.withdraw1(0,500));
          assertEquals( 400, a.withdraw1(100,500));
           assertEquals( 490, a.withdraw1(10,500));
     }
     
      @Test
     public void transfer() 
     {
         assertEquals( 1500, a.transfer(1000,500,1000));
          assertEquals( 600, a.transfer(100,500,1000));
           assertEquals( 500, a.transfer(00,500,500));
     }
     
     
     
      @Test
     public void totalbal() 
     {
          assertEquals( 1500, a.totalbal(1000,500));
          assertEquals( 2000, a.totalbal(1000,1000));
          assertEquals( 520, a.totalbal(20,500));
     }
     
      @Test
     public void richest() 
     {
         assertEquals( 1000, a.richest(1000,500));
         assertEquals( 100, a.richest(100,50));
         assertEquals( 200, a.richest(200,50));
     }
     
    
}
