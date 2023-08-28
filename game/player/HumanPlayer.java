package game.player;

public class HumanPlayer implements Player {

    public HumanPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;
}
