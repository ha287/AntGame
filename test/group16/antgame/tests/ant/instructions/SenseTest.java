/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group16.antgame.ant.instructions;

import group16.antgame.ant.Ant;
import group16.antgame.ant.Condition;
import group16.antgame.ant.SenseDirection;
import group16.antgame.world.Cell;
import group16.antgame.world.Position;
import group16.antgame.world.World;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harry
 */
public class SenseTest {
    
    public SenseTest() {
    }

    /**
     * Test of execute method, of class Sense.
     */
    @Test
    public void testExecute() {
        World w = null;
        Position p = null;
        Cell c = null;
        Ant a = null;
        Sense instance = null;
        int expResult = 0;
        int result = instance.execute(w, p, c, a);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDir method, of class Sense.
     */
    @Test
    public void testGetDir() {
        Sense instance = null;
        SenseDirection expResult = null;
        SenseDirection result = instance.getDir();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSt1 method, of class Sense.
     */
    @Test
    public void testGetSt1() {
        Sense instance = null;
        int expResult = 0;
        int result = instance.getSt1();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSt2 method, of class Sense.
     */
    @Test
    public void testGetSt2() {
        Sense instance = null;
        int expResult = 0;
        int result = instance.getSt2();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCond method, of class Sense.
     */
    @Test
    public void testGetCond() {
        Sense instance = null;
        Condition expResult = null;
        Condition result = instance.getCond();
        assertEquals(expResult, result);
    }
    
}
