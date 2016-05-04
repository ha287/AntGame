/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group16.antgame.ant.instructions;

import group16.antgame.ant.Ant;
import group16.antgame.world.Cell;
import group16.antgame.world.Position;
import group16.antgame.world.World;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harry
 */
public class PickUpTest {
    
    public PickUpTest() {
    }

    /**
     * Test of execute method, of class PickUp.
     */
    @Test
    public void testExecute() {
        World w = null;
        Position p = null;
        Cell c = null;
        Ant a = null;
        PickUp instance = null;
        int expResult = 0;
        int result = instance.execute(w, p, c, a);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSt1 method, of class PickUp.
     */
    @Test
    public void testGetSt1() {
        PickUp instance = null;
        int expResult = 0;
        int result = instance.getSt1();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSt2 method, of class PickUp.
     */
    @Test
    public void testGetSt2() {
        PickUp instance = null;
        int expResult = 0;
        int result = instance.getSt2();
        assertEquals(expResult, result);
    }
    
}
