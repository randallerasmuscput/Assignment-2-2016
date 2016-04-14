package Tests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 2016/04/14.
 */
public class TrueTest {

    @Test
    public void testTrue() throws Exception
    {
        True obj = new True();
        obj.testTrue();

        assertEquals("True",obj.testTrue());

    }
}