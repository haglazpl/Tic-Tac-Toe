public class BoardPrinter {

    public void printBoard(Map map) {
        System.out.print("*");
        for (int i = 1; i < 4; i++)
            System.out.print("|"+ i);
        System.out.println();

        char rowNumber = 64;
        for (char[] row : map.getBoard()) {
            rowNumber++;
            System.out.print(rowNumber+"|");
            for (int c = 0; c < row.length; c++) {
                System.out.print(row[c] + "|");
            }
            System.out.println();
        }
    }
}