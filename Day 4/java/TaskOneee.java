import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        String[] userGamePlay = new String[9];

        while (counter < 9) {
            System.out.print("Enter 'X' or 'O': ");
            String choice = input.next().toLowerCase();

            if (!choice.equals("o") && !choice.equals("x")) {
                System.out.println("Invalid choice. Please enter 'X' or 'O'.");
                continue;
            }

            System.out.print("Enter cell number (1-9): ");
            int cell = input.nextInt();

            if (cell < 1 || cell > 9) {
                System.out.println("Invalid cell number. Please enter a number between 1 and 9.");
                continue;
            }

            userGamePlay[cell - 1] = choice;
            counter++;

            // Print the board
            printBoard(userGamePlay);

            // Check for win/draw conditions or continue the game
            // (This logic needs to be added)
        }
    }

    public static void printBoard(String[] board) {
        System.out.println("-------------");
        for (int i = 0; i < 9; i += 3) {
            System.out.printf("| %s | %s | %s |%n", board[i], board[i + 1], board[i + 2]);
            System.out.println("-------------");
        }
    }
}
