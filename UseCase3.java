import java.util.Scanner;

public class InputSlot {

    public static int getSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }
    public static void main(String[] args) {
        int userSlot = getSlot();

        System.out.println("You selected: " + userSlot);
    }
}