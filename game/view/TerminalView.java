package game.view;

import java.util.Scanner;

import game.player.Player;
import game.player.PlayerChoice;

public class TerminalView implements GameView {

    public PlayerChoice makeMove(Player player) {
        PlayerChoice move = null;
        while (move == null) {
            try {
                logPlayerMoveStart(player);
                move = getPlayerChoice(getInput());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return move;
    }

    public void logPlayerMoveStart(Player player) {
        System.out.println("Please make a move player: " + player.getName());
    }

    public void logPlayerMove(Player player, PlayerChoice playerChoice) {
        System.out.println("Player " + player.getName() + " made the move " + playerChoice);
    }

    private String getInput() {
        System.out.print("Enter your choice (Rock, Paper, or Scissor): ");
        String userInput = scanner.nextLine();
        return userInput;
    }

    private PlayerChoice getPlayerChoice(String userInput) throws InvalidMoveException {
        try {
            return PlayerChoice.valueOf(userInput);
        } catch (Exception e) {
            System.out.println("E: " + e.getMessage());
            throw new InvalidMoveException("This was an invalid move. Please try again.");
        }
    }

    private class InvalidMoveException extends Exception {
        public InvalidMoveException(String message) {
            super(message);
        }
    }

    public void closeScanner() {
        scanner.close();
    }

    private Scanner scanner = new Scanner(System.in);
}
