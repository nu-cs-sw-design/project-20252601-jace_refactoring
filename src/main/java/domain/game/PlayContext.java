package domain.game;

public class PlayContext {
    private Game game;
    private final Player currentPlayer;
    private final Player targetPlayer;
    private Integer defuseInsertIndex;
    private boolean cancelled;


    public PlayContext(Game game, Player currentPlayer, Player targetPlayer) {
        this.game = game;
        this.currentPlayer = currentPlayer;
        this.targetPlayer = targetPlayer;
    }
    //defuse
    public Integer getDefuseInsertIndex() {
        return defuseInsertIndex;
    }
    public void setDefuseInsertIndex(Integer defuseInsertIndex) {
        this.defuseInsertIndex = defuseInsertIndex;
    }
    //nope
    public boolean isCancelled() {
        return cancelled;
    }
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
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
