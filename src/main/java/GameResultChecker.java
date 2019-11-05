public class GameResultChecker {

    public boolean isWinner(Map map) {

        for (int i = 0; i < map.getBoard().length; i++) {
            if (map.getBoard()[0][i] != '.' && map.getBoard()[0][i] == map.getBoard()[1][i] && map.getBoard()[1][i] == map.getBoard()[2][i]) {
                return true;
            }
            if (map.getBoard()[i][0] != '.' && map.getBoard()[i][0] == map.getBoard()[i][1] && map.getBoard()[i][1] == map.getBoard()[i][2]) {
                return true;
            }
        }
        if (map.getBoard()[1][1] != '.' && ((map.getBoard()[0][0] == map.getBoard()[1][1] && map.getBoard()[1][1] == map.getBoard()[2][2])
                || (map.getBoard()[0][2] == map.getBoard()[1][1] && map.getBoard()[1][1] == map.getBoard()[2][0]))) {
            return true;
        }

        return false;
    }

    public boolean isGameDrawn(Map map) {
        for (int row = 0; row < map.getBoard().length; row++) {
            for (int col = 0; col < map.getBoard().length; col++) {
                if (map.getBoard()[row][col] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}