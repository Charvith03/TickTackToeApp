import java.util.Random;

public class Toss {
    public static void main(String[] args) {

        Random r = new Random();
        int toss = r.nextInt(2);

        char playerSymbol;
        char computerSymbol;

        if (toss == 0) {
            System.out.println("You start first");
            playerSymbol = 'X';
            computerSymbol = 'O';
        } else {
            System.out.println("Computer starts first");
            playerSymbol = 'O';
            computerSymbol = 'X';
        }

        System.out.println("Player: " + playerSymbol);
        System.out.println("Computer: " + computerSymbol);
    }
}