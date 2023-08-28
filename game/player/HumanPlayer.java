package game.player;

import game.view.GameView;

public class HumanPlayer implements Player {

    public HumanPlayer(String name, GameView view) {
        this.name = name;
        this.view = view;
    }

    public String getName() {
        return name;
    }

    public PlayerChoice getMove() {
        return view.makeMove(this);
    }

    private String name;
    private GameView view;
}
