import java.util.Random;
import java.util.Scanner;

public class Usecase8 {

    // Display board
    static void printBoard(char[] board) {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 3 == 0) System.out.println();
        }
        System.out.println();
    }

    // Check valid move
    static boolean isValidMove(char[] board, int index) {
        return board[index] != 'X' && board[index] != 'O';
    }

    // Player move
    static void playerMove(char[] board, Scanner sc) {
        int slot;
        while (true) {
            System.out.print("Enter position (1-9): ");
            slot = sc.nextInt();
            int index = slot - 1;

            if (index >= 0 && index < 9 && isValidMove(board, index)) {
                board[index] = 'X';
                break;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    // Computer random move
    static void computerMove(char[] board) {
        Random rand = new Random();
        int position;

        while (true) {
            int slot = rand.nextInt(9) + 1;
            position = slot - 1;

            if (isValidMove(board, position)) {
                board[position] = 'O';
                System.out.println("Computer chose: " + slot);
                break;
            }
        }
    }

    // Check win
    static boolean checkWin(char[] b, char symbol) {
        return (b[0]==symbol && b[1]==symbol && b[2]==symbol) ||
               (b[3]==symbol && b[4]==symbol && b[5]==symbol) ||
               (b[6]==symbol && b[7]==symbol && b[8]==symbol) ||
               (b[0]==symbol && b[3]==symbol && b[6]==symbol) ||
               (b[1]==symbol && b[4]==symbol && b[7]==symbol) ||
               (b[2]==symbol && b[5]==symbol && b[8]==symbol) ||
               (b[0]==symbol && b[4]==symbol && b[8]==symbol) ||
               (b[2]==symbol && b[4]==symbol && b[6]==symbol);
    }

    // Check draw
    static boolean checkDraw(char[] board) {
        for (char c : board) {
            if (c != 'X' && c != 'O') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] board = {'1','2','3','4','5','6','7','8','9'};
        boolean playerTurn = true; // true = player, false = computer

        System.out.println("Game Start!");

        while (true) {
            printBoard(board);

            if (playerTurn) {
                playerMove(board, sc);
                if (checkWin(board, 'X')) {
                    printBoard(board);
                    System.out.println("Player Wins!");
                    break;
                }
            } else {
                computerMove(board);
                if (checkWin(board, 'O')) {
                    printBoard(board);
                    System.out.println("Computer Wins!");
                    break;
                }
            }

            if (checkDraw(board)) {
                printBoard(board);
                System.out.println("It's a Draw!");
                break;
            }

            // Switch turn
            playerTurn = !playerTurn;
        }

        sc.close();
    }
}
