/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package group16.antgame.ant;

import group16.antgame.ant.instructions.Instruction;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author ha287
 */
public class AntTest {
    
Ant a; 
AntBrain brain;
Colour c;
    @Before
    public void setupAnt(){
        
        a = new Ant(brain,c.Black);
    }

    /**
     * Test of getId method, of class Ant.
     */
    @Test
    public void testGetId() {
        int expResult = 0;
        int result = a.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getState method, of class Ant.
     */
    @Test
    public void testGetState() {
        int expResult = 0;
        int result = a.getState();
        assertEquals(expResult, result);     
    }

    /**
     * Test of getInstruction method, of class Ant.
     */
    @Test
    public void testGetInstruction() {
       
        Instruction expResult = null;
        Instruction result = a.getInstruction();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColour method, of class Ant.
     */
    @Test
    public void testGetColour() {
        Colour expResult = c.Black;
        Colour result = a.getColour();
        assertEquals(expResult, result);
        
        Colour unexpResult = c.Red;
        Colour unresult = a.getColour();
        assertFalse(expResult.equals(result));
        
        
    }

    /**
     * Test of getResting method, of class Ant.
     */
    @Test
    public void testGetResting() {
        
        a.setResting(5);
        
        int expResult = 5;
        int result = a.getResting();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getDirection method, of class Ant.
     */
    @Test
    public void testGetDirection() {
        
        a.setDirection(2);
        
        int expResult = 2;
        int result = a.getDirection();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasFood method, of class Ant.
     */
    @Test
    public void testHasFood() {
        
        a.setHasFood(true);
        
        boolean expResult = true;
        boolean result = a.hasFood();
        assertEquals(expResult, result);
        assertFalse(expResult == result);
    }


}
