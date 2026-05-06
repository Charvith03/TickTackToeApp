public class Usecase10 {
    static boolean checkDraw(char[] board) {

        // Traverse the board
        for (int i = 0; i < 9; i++) {
            // If any cell is not filled with X or O → not a draw
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }

        // All cells filled → draw
        return true;
    }

    // Test the method
    public static void main(String[] args) {

        // Example board (full, no winner)
        char[] board = {
            'X','O','X',
            'X','O','O',
            'O','X','X'
        };

        if (checkDraw(board)) {
            System.out.println("It's a Draw!");
        } else {
            System.out.println("Game still in progress.");
        }
    }
}
