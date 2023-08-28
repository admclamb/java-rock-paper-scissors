package game.player;

import java.util.Random;

import game.view.GameView;

public class ComputerPlayer implements Player {

    public ComputerPlayer(String name, GameView view) {
        this.name = name;
        this.view = view;
    }

    public String getName() {
        return name;
    }

    public PlayerChoice getMove() {
        view.logPlayerMoveStart(this);
        return getComputerMove();
    }

    private PlayerChoice getComputerMove() {
        int choiceIndex = random.nextInt(PlayerChoice.values().length);
        return PlayerChoice.values()[choiceIndex];
    }

    private String name;
    private GameView view;
    private static final Random random = new Random();
}
