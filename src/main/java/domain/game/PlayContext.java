package domain.game;

public class PlayContext {
    private Game game;
    private final Player currentPlayer;
    private final Player targetPlayer;

    public PlayContext(Game game, Player currentPlayer, Player targetPlayer) {
        this.game = game;
        this.currentPlayer = currentPlayer;
        this.targetPlayer = targetPlayer;
    }

    public Game getGame() {
        return game;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getTargetPlayer() {
        return targetPlayer;
    }

    public Deck getDeck() {
        return game.getDeck();
    }

    public int getCurrentPlayerIndex() {
        return game.getPlayerTurn();
    }

}
