public class Usecase9 {

    static boolean checkWin(char[] board, char symbol) {

        int[][] winPatterns = {
            {0,1,2}, {3,4,5}, {6,7,8}, // rows
            {0,3,6}, {1,4,7}, {2,5,8}, // columns
            {0,4,8}, {2,4,6}           // diagonals
        };


        for (int i = 0; i < winPatterns.length; i++) {
            int a = winPatterns[i][0];
            int b = winPatterns[i][1];
            int c = winPatterns[i][2];

            if (board[a] == symbol &&
                board[b] == symbol &&
                board[c] == symbol) {
                return true; 
            }
        }

        return false; 
    }

    
    public static void main(String[] args) {

   
        char[] board = {
            'X','X','X',
            '4','O','6',
            'O','8','9'
        };

        if (checkWin(board, 'X')) {
            System.out.println("Player X Wins!");
        } else if (checkWin(board, 'O')) {
            System.out.println("Player O Wins!");
        } else {
            System.out.println("No winner yet.");
        }
    }
}
