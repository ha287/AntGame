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
public class LinearDirectionTest {
    
    public LinearDirectionTest() {
    }

    /**
     * Test of values method, of class LinearDirection.
     */
    @Test
    public void testValues() {
        
        LinearDirection[] expResult = null;
        LinearDirection[] result = LinearDirection.values();
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of valueOf method, of class LinearDirection.
     */
    @Test
    public void testValueOf() {
        String name = "";
        LinearDirection expResult = null;
        LinearDirection result = LinearDirection.valueOf(name);
        assertEquals(expResult, result);
    }
    
}
