package game;

import game.player.Player;
import game.view.GameView;
import game.view.TerminalView;
import game.player.PlayerChoice;

public class Game {

    public Game() {
        view = new TerminalView();
    }

    public void start() {

    }

    public RoundResult playRound() {

    }

    public PlayerChoice makeMove() {
        PlayerChoice player1Choice = view.makeMove(player1);
        PlayerChoice player2Choice = view.makeMove(player2);
    }

    public enum RoundResult {
        Player1,
        Player2,
        Tie
    }

    private Player player1;
    private Player player2;
    private GameView view;
}
