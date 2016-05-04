/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group16.antgame.ant.instructions;

import group16.antgame.ant.Ant;
import group16.antgame.ant.LinearDirection;
import group16.antgame.world.Cell;
import group16.antgame.world.Position;
import group16.antgame.world.World;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harry
 */
public class TurnTest {
    
    public TurnTest() {
    }

    /**
     * Test of execute method, of class Turn.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        World w = null;
        Position p = null;
        Cell c = null;
        Ant a = null;
        Turn instance = null;
        int expResult = 0;
        int result = instance.execute(w, p, c, a);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDir method, of class Turn.
     */
    @Test
    public void testGetDir() {
        System.out.println("getDir");
        Turn instance = null;
        LinearDirection expResult = null;
        LinearDirection result = instance.getDir();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSt method, of class Turn.
     */
    @Test
    public void testGetSt() {
        System.out.println("getSt");
        Turn instance = null;
        int expResult = 0;
        int result = instance.getSt();
        assertEquals(expResult, result);
    }
    
}
