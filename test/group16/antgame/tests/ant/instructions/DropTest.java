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
public class DropTest {
    
    public DropTest() {
    }

    /**
     * Test of execute method, of class Drop.
     */
    @Test
    public void testExecute() {
        World w = null;
        Position p = null;
        Cell c = null;
        Ant a = null;
        Drop instance = null;
        int expResult = 0;
        int result = instance.execute(w, p, c, a);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSt method, of class Drop.
     */
    @Test
    public void testGetSt() {
        Drop instance = null;
        int expResult = 0;
        int result = instance.getSt();
        assertEquals(expResult, result);
    }
    
}
