/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;



import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * Randall Erasmus
 */
public class ObjectTest {
    
    public ObjectTest() {
    }
    
    @Test
    public void equalitytest(){
         NewClass1 c1 = new NewClass1();
         NewClass2 c2 = new NewClass2();
         double expected = 1.1;
    assertEquals("NOT EQUAL", c1, c2);
    }
    
    @Test
    public void equalitytest2(){
         NewClass1 c1 = new NewClass1();
         NewClass2 c2 = new NewClass2();
         double expected = 1.1;
    assertEquals("NOT EQUAL", c1, c1);
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
