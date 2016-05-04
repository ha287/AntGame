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
public class UnmarkTest {
    
    public UnmarkTest() {
    }

    /**
     * Test of execute method, of class Unmark.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        World w = null;
        Position p = null;
        Cell c = null;
        Ant a = null;
        Unmark instance = null;
        int expResult = 0;
        int result = instance.execute(w, p, c, a);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMarker method, of class Unmark.
     */
    @Test
    public void testGetMarker() {
        System.out.println("getMarker");
        Unmark instance = null;
        int expResult = 0;
        int result = instance.getMarker();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSt method, of class Unmark.
     */
    @Test
    public void testGetSt() {
        System.out.println("getSt");
        Unmark instance = null;
        int expResult = 0;
        int result = instance.getSt();
        assertEquals(expResult, result);
    }
    
}
