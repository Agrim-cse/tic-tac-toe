public class Main {
    static char b[][] = new char[3][3];

    static void board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = ' ';
            }
        }
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]);
                if (j != 2)
                    System.out.print("|");
            }
            if (i != 2) {
                System.out.println();
                System.out.println("-+-+-");
            }
        }
    }
    public static void main(String args[]) {
        System.out.println("Tic Tac Toe Game Starting...");
        board();
        printBoard();
    }
}