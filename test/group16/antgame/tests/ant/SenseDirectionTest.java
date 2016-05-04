/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group16.antgame.ant;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harry
 */
public class SenseDirectionTest {
    
    public SenseDirectionTest() {
    }

    /**
     * Test of values method, of class SenseDirection.
     */
    @Test
    public void testValues() {
        SenseDirection[] expResult = null;
        SenseDirection[] result = SenseDirection.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class SenseDirection.
     */
    @Test
    public void testValueOf() {
        String name = "";
        SenseDirection expResult = null;
        SenseDirection result = SenseDirection.valueOf(name);
        assertEquals(expResult, result);
    }
    
}
