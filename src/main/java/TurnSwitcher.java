public class TurnSwitcher {

    private char turn = 'X';

    public void switchPlayer() {
        if (turn == 'X') {
            turn = 'O';
        } else {
            turn = 'X';

        }
    }

    public char getTurn() {
        return turn;
    }
}