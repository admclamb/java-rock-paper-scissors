package game.view;

import game.player.Player;
import game.player.PlayerChoice;

public interface GameView {

    public PlayerChoice makeMove(Player player);
}
