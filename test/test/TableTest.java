/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Model.Table;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TableTest {
    
    /*@Test
    public void checkTurnIsFiveTestTrue() {
        Table table = new Table();
        
        assertEquals(true,table.checkTurnIsFive());
    }*/
    
    @Test
    public void startGameCountTurnShouldEqualOne(){
        Table table = new Table();
        assertEquals(1, table.getTurn());
    }
}
