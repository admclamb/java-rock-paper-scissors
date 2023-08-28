package game;

import java.util.HashMap;
import java.util.Map;

import game.player.Player;
import game.view.GameView;
import game.view.TerminalView;
import game.player.PlayerChoice;

public class Game {

    public Game(Player player1, Player player2, GameView view) {
        this.view = view;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
    }

    public RoundResult playRound() {
        PlayerChoice player1Choice = player1.getMove();
        view.logPlayerMove(player1, player1Choice);
        PlayerChoice player2Choice = player2.getMove();
        view.logPlayerMove(player2, player2Choice);
        return decideWinner(player1Choice, player2Choice);
    }

    public RoundResult decideWinner(PlayerChoice player1Choice, PlayerChoice player2Choice) {
        if (player1Choice == player2Choice) {
            return RoundResult.Tie;
        }
        Map<PlayerChoice, PlayerChoice> roundDecider = new HashMap<PlayerChoice, PlayerChoice>() {
            {
                put(PlayerChoice.Paper, PlayerChoice.Rock);
                put(PlayerChoice.Rock, PlayerChoice.Scissor);
                put(PlayerChoice.Scissor, PlayerChoice.Paper);
            }
        };

        if (roundDecider.get(player1Choice) == player2Choice) {
            return RoundResult.Player1;
        }
        return RoundResult.Player2;
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