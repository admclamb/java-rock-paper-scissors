import game.Game;
import game.player.HumanPlayer;
import game.view.TerminalView;

public class GameManager {

    public static void main(String[] args) {
        TerminalView terminalView = new TerminalView();
        Game game = new Game(new HumanPlayer("Bob", terminalView), new HumanPlayer("Joe", terminalView), terminalView);
        System.out.println(game.playRound());

        terminalView.closeScanner();
    }
}
