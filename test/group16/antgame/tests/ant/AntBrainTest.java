/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group16.antgame.ant;

import group16.antgame.ant.instructions.Instruction;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harry
 */
public class AntBrainTest {
    private AntBrain Brain;
    private AntBrain testBrain;
    
    public AntBrainTest() {
        
        File file = new File("Sample.ant");
        
        try {
            Brain = new AntBrain(file);
        } catch (IOException | UndefinedStateException | UnsupportedSenseDirectionException | UnsupportedConditionException | NotEnoughParametersException | MarkerOutOfBoundsException | InvalidIntegerException | UnsupportedLinearDirectionException ex) {
            Logger.getLogger(AntBrainTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            testBrain = new AntBrain(file);
        } catch (IOException | UndefinedStateException | UnsupportedSenseDirectionException | UnsupportedConditionException | NotEnoughParametersException | MarkerOutOfBoundsException | InvalidIntegerException | UnsupportedLinearDirectionException ex) {
            Logger.getLogger(AntBrainTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getStates method, of class AntBrain.
     */
    @Test
    public void testGetStates() {
        
        ArrayList<Instruction> expResult = testBrain.getStates();
        ArrayList<Instruction> result = Brain.getStates();
     
        assertFalse(expResult.equals(result) );
        
    }
    
}
