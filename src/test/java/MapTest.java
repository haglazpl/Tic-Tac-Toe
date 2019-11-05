import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapTest {
    Map map;

    @Before
    public void setUp(){
        map = new Map();
    }

    @Test
    public void getMAX_COLS() {
        int colValue = 15;
        map.setMAX_COLS(colValue);
        assertEquals(colValue, map.getMAX_COLS());
    }

    @Test
    public void getMAX_ROWS() {
        int rowValue = 15;
        map.setMAX_ROWS(rowValue);
        assertEquals(rowValue, map.getMAX_ROWS());
    }

    @Test
    public void isFull(){

        for (int i = 0; i < map.getBoard().length; i++) {
            for (int j = 0; j < map.getBoard().length; j++) {
                Assert.assertFalse(map.isFull(i,j));
            }
        }


    }

}