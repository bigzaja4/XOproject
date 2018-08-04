/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.Table;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
/**
 *
 * @author bigza
 */
public class TableTest {  
    @Test
    public void markPositionTrueTest(){
        Table board = new Table();
        board.setBoardPosition(0, 0);
        String position = "R1_C1";
        Assert.assertEquals(false,board.markPosition(position));
    }
    
}
