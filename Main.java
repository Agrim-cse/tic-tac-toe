import java.util.*;

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

    static char player(int k) {
        char p1 = 'X';
        char p2 = 'O';
        if (k % 2 == 1)
            return p1;
        else
            return p2;
    }

    static int checkwin() {
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == b[i][1] && b[i][1] == b[i][2] && b[i][0] != ' ')
                return 1;
        }
        for (int i = 0; i < 3; i++) {
            if (b[0][i] == b[1][i] && b[1][i] == b[2][i] && b[0][i] != ' ')
                return 1;
        }
        if ((b[0][0] == b[1][1] && b[1][1] == b[2][2]) || (b[0][2] == b[1][1] && b[1][1] == b[2][0])) {
            if (b[1][1] != ' ')
                return 1;
        }
        return 0;
    }

    static int checkdraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i][j] == ' ')
                    return 0;
            }
        }
        return 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tic Tac Toe Game Starting...");
        int r = 0;
        int c = 0;
        int playagain = 1;
        int turn = 1;
        char cur;
        while (playagain == 1) {
            board();
            int gameover = 0;
            while (gameover == 0) {
                printBoard();
                System.out.print("\n");
                cur = player(turn);
                System.out.print("Player "+cur+" move:");
                r = sc.nextInt();
                c = sc.nextInt();
                if (r <= 3 && c <= 3 && b[r - 1][c - 1] == ' ') {
                    b[r - 1][c - 1] = cur;
                    if (checkwin() == 1) {
                        printBoard();
                        System.out.print("\n");
                        System.out.println(cur + " WINS");
                        gameover = 1;
                        break;
                    }
                    if (checkdraw() == 1) {
                        printBoard();
                        System.out.print("\n");
                        System.out.println("DRAW");
                        gameover = 1;
                        break;
                    } else
                        turn++;
                } else
                    System.out.println("Invalid Move...RETRY!");
            }
            System.out.println("Enter 1 to play again\n0 to exit:");
            playagain=sc.nextInt();
        }
        System.out.println("Thanks for Playing!");
        sc.close();
    }
}