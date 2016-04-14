package Tests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 2016/04/14.
 */
public class FalseTest {

    @Test
    public void testFalseTest()
    {
        False obj = new False();
        obj.falseTest();
        assertFalse("Is it False", obj.falseTest());

    }
}