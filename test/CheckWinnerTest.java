/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */

import Model.Table;
import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;


public class CheckWinnerTest {
    
    @Test
    public void checkWinnerTest(){
         Table tb = new Table();
         int check = tb.checkWinner(0);
            assertEquals(2,check);
//        fail("เขียนชุดการทดสอบสิ");
        
    }
}
