/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Randall Erasmus
 */
public class intTest {

    public intTest() {
    }

    @Test
    public void intTest()
    {
        integers obj =new integers();
        obj.intTesting();

        int expected = 14;
        assertEquals("Integer Numbers differ",expected, obj.sum);

    }

}