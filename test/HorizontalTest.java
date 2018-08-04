/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.Table;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author StyxK
 */
public class HorizontalTest {
    @Test
   public void isWinByHorizontalTest(){
       Table table = new Table();
       Integer[] position = new Integer[9];
       position[1] = 1;
       position[3] = 2;
       position[2] = 1;
       position[8] = 2;
       position[0] = 1;
       table.setBoardPosition(position);
        assertEquals(true, table.isWinByHorizontal(0, 1));
   }
    
}
