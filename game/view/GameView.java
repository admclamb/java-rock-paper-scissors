package game.view;

import game.player.Player;
import game.player.PlayerChoice;

public interface GameView {

    public PlayerChoice makeMove(Player player);

    public void logPlayerMoveStart(Player player);

    public void logPlayerMove(Player player, PlayerChoice playerChoice);
}
