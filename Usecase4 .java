import java.util.Scanner;

public class TicTacToeUC4 {
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();

        if (slot < 1 || slot > 9) {
            System.out.println("Invalid slot! Enter a number between 1 and 9.");
            return;
        }

        int[] result = convertSlotToIndex(slot);

        System.out.println("Row: " + result[0] + ", Column: " + result[1]);

        scanner.close();
    }
}