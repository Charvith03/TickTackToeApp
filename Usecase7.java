import java.util.Random;

public class Usecase7 {

    // Method to display the board
    static void printBoard(char[] board) {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 3 == 0) System.out.println();
        }
        System.out.println();
    }

    // Method to check if move is valid
    static boolean isValidMove(char[] board, int index) {
        return board[index] != 'X' && board[index] != 'O';
    }

    // UC7: Computer makes random valid move
    static void computerMove(char[] board) {
        Random rand = new Random();
        int position;

        while (true) {
            // Generate random number 1–9
            int slot = rand.nextInt(9) + 1;

            // Convert slot to index (0–8)
            position = slot - 1;

            // Check if valid
            if (isValidMove(board, position)) {
                board[position] = 'O'; // Computer uses 'O'
                System.out.println("Computer chose position: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Initialize board with numbers
        char[] board = {'1','2','3','4','5','6','7','8','9'};

        System.out.println("Initial Board:");
        printBoard(board);

        // Computer move
        computerMove(board);

        System.out.println("Board After Computer Move:");
        printBoard(board);
    }
}
