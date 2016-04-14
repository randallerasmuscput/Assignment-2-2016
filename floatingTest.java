package Tests;

import org.junit.Test;

import static org.junit.Assert.*;


public class floatingTest {

    @Test
    public void testFloat()
    {

        {

            floating obj = new floating();

            System.out.println("Working");      //expected vs actual
            assertEquals("Floating numbers ",obj.value1(6.4f),obj.value2(12.4f),10); // the last is the tolerance level
                        //string message in case of failure
            System.out.println("working");
        }

    }
}