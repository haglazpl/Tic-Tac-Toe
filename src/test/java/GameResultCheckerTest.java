import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameResultCheckerTest {
    Map map;
    GameResultChecker gameResultChecker;

    @Before
    public void setUp(){
        map = new Map();
        gameResultChecker = new GameResultChecker();
    }

    @Test
    public void isWinner() {
        map.getBoard()[0][0] = 'X';
        map.getBoard()[0][1] = 'O';
        map.getBoard()[0][2] = 'X';

        map.getBoard()[1][0] = 'O';
        map.getBoard()[1][1] = 'X';
        map.getBoard()[1][2] = 'O';

        map.getBoard()[2][0] = 'X';
        map.getBoard()[2][1] = 'O';
        map.getBoard()[2][2] = 'X';
        Assert.assertTrue(gameResultChecker.isWinner(map));
    }

    @Test
    public void isGameDrawn() {
        map.getBoard()[0][0] = 'X';
        map.getBoard()[0][1] = '.';
        map.getBoard()[0][2] = 'X';

        map.getBoard()[1][0] = 'O';
        map.getBoard()[1][1] = 'X';
        map.getBoard()[1][2] = 'X';

        map.getBoard()[2][0] = 'O';
        map.getBoard()[2][1] = 'X';
        map.getBoard()[2][2] = 'O';
        Assert.assertFalse(gameResultChecker.isGameDrawn(map));
    }
}