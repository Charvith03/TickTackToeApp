
import java.util.Scanner;

public class Usecase6 {

    static void displayBoard(int[][] board) {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char ch = '-';
                if (board[i][j] == 1) ch = 'X';
                else if (board[i][j] == 2) ch = 'O';

                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void updateBoard(int[][] board, int row, int col, int player) {
        board[row][col] = player;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[3][3]; 

        System.out.println("=== UC6: Update Board Demo ===");

        displayBoard(board);

        System.out.print("Enter row (0-2): ");
        int row = sc.nextInt();

        System.out.print("Enter col (0-2): ");
        int col = sc.nextInt();

        System.out.print("Enter player (1 for X, 2 for O): ");
        int player = sc.nextInt();

        updateBoard(board, row, col, player);

        System.out.println("\nAfter updating:");
        displayBoard(board);

        sc.close();
    }
}
