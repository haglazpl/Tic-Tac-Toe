import java.util.Scanner;

public class Game {
    private Map map;
    private GameResultChecker gameResultChecker;
    private TurnSwitcher turnSwitcher;
    private BoardPrinter boardPrinter;
    private Scanner scanner;

    public Game() {
        this.map = new Map();
        this.gameResultChecker = new GameResultChecker();
        this.turnSwitcher = new TurnSwitcher();
        this.boardPrinter = new BoardPrinter();
        this.scanner = new Scanner(System.in);
    }

    void startGame() {
        map.initBoard();

        boardPrinter.printBoard(map);


        while (!gameResultChecker.isWinner(map) && !gameResultChecker.isGameDrawn(map)) {
            System.out.print("Graczu: "+turnSwitcher.getTurn()+", podaj wiersz: ");
            int row = scanner.next().charAt(0);
            row = Character.toUpperCase(row);

            if (row == 65)
                row = 0;
            else if (row == 66)
                row = 1;
            else if (row == 67)
                row = 2;

            System.out.print("Graczu: "+turnSwitcher.getTurn()+", podaj kolumne: ");
            while(!scanner.hasNextInt()){
                System.out.print("Wprowadziles nieprawidlowy znak,podaj liczbe z zakresu 1 do 3: ");
                scanner.next();
            }
            int col = scanner.nextInt()-1;
            if (col >= 3 || col <= -1) {
                System.out.println("Wprowadziles zla kolumne, sprobuj od 1 do 3");

            } else if (row >= 3 || row <= -1) {
                System.out.println("Wprowadziles zly wiersz, sprobuj od A do C");

            } else {
                if (map.isFull(row, col)) {
                    System.out.println("To miejsce jest zajete!");
                } else {
                    map.getBoard()[row][col] = turnSwitcher.getTurn();
                    boardPrinter.printBoard(map);
                    turnSwitcher.switchPlayer();
                }
            }
        }
        if(gameResultChecker.isWinner(map)) {
            turnSwitcher.switchPlayer();
            System.out.println("Wygral gracz: " + turnSwitcher.getTurn());
        }
        if(gameResultChecker.isGameDrawn(map)){
            System.out.println("Remis");
        }
    }
}