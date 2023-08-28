package game.view;

import java.util.Scanner;

import game.player.Player;
import game.player.PlayerChoice;

public class TerminalView implements GameView {

    public PlayerChoice makeMove(Player player) {
        PlayerChoice move = null;
        while (move == null) {
            try {
                System.out.println("Please make a move player: " + player.getName())
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return move;
    }

    private String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (Rock, Paper, or Scissor): ");
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }

    private PlayerChoice getPlayerChoice(String userInput) throws InvalidMoveException {
        return PlayerChoice.valueOf(userInput);
    }

    private class InvalidMoveException extends Exception {
        public InvalidMoveException() {
            super("This was an invalid move. Please try again.");
        }
    }
}
